package edu.fiu.hmts.web.controller;

import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
import org.springframework.web.servlet.view.RedirectView;

import edu.fiu.hmts.domain.User;
import edu.fiu.hmts.service.IUserService;
import edu.fiu.hmts.util.servbuilder.Director;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * The Class UserController.
 */
@Controller
public class UserController extends MultiActionController {
	
	protected final Log logger = LogFactory.getLog(getClass());
	
	private IUserService userService = (IUserService) Director.contruct("UserService");
	
	
	/**
	 * Login.
	 *
	 * @param request
	 *            the request
	 * @param response
	 *            the response
	 * @return the model and view
	 * @throws Exception
	 *             the exception
	 */
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) 
			throws Exception {
		logger.info("User is signing in the system.");
		
		ModelAndView page = new ModelAndView();
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		User user = userService.login(username, password);
		
		if (user.getUserId() == -1){
			page.setViewName("login");
			page.addObject("username", username);
		}
		else{
			page.setViewName("home");
			page.addObject("userId", user.getUserId());
			page.addObject("role", user.getRole());
			page.addObject("firstName", user.getFirstName());
			page.addObject("func", user.getTag());
		}

		return page;
	}
	
	
	/**
	 * Logout.
	 *
	 * @param request
	 *            the request
	 * @param response
	 *            the response
	 * @return the model and view
	 * @throws Exception
	 *             the exception
	 */
	public ModelAndView logout(HttpServletRequest request, HttpServletResponse response) 
			throws Exception {
		logger.info("User is signing out the system");
		
		ModelAndView login = new ModelAndView(new RedirectView("userview.do"));
		login.addObject("mode", "openLogin");
		
		return login;
	}

	/**
	 * Register.
	 *
	 * @param request
	 *            the request
	 * @param response
	 *            the response
	 * @return the model and view
	 */
	public ModelAndView register(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView register = new ModelAndView();
		try{
			User user = userService.register(request.getParameter("Username")
					, request.getParameter("Password")
					, request.getParameter("FirstName")
					, request.getParameter("LastName")
					, request.getParameter("Phone")
					, request.getParameter("Role")
					, -1, "", 0);
			
			if (user.getUserId() == null)
				register.setViewName("register");
			else
				register.setViewName("home");
			
			return register;
			
		}catch(Exception e){
			logger.fatal(e.getMessage());
			register.setViewName("register");
			return register;
		}
	}
}

package edu.fiu.hmts.web.controller;

import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
import org.springframework.web.servlet.view.RedirectView;

import edu.fiu.hmts.domain.User;
import edu.fiu.hmts.service.IUserService;
import edu.fiu.hmts.util.servbuilder.Director;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.json.JSONObject;

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
	 */
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response){
		logger.info("User is signing in the system.");
		ModelAndView page = new ModelAndView();
		
		try{
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			User user = userService.login(username, password, 0);
			
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
		catch(Exception e){
			logger.fatal(e.getMessage());
			page.setViewName("login");
			return page;
		}
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
		
		ModelAndView loginView = new ModelAndView(new RedirectView("front.do"));
		loginView.addObject("mode", "dispatcher");
		loginView.addObject("target", "login");
		
		return loginView;
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
		ModelAndView usresView = new ModelAndView();
		usresView.setViewName("usres");
		try{
			Random random = new Random();
			int roleCode = -1;
			String role = request.getParameter("roleNew");
			String[] roleList = {"Manager", "Staff", "Delivery Man"};
			for (int i = 0; i < roleList.length; i++)
				if (roleList[i].equals(role))
					roleCode = i + 1;
			
			if (roleCode != -1)
				userService.register(request.getParameter("usernameNew")
						, String.valueOf((int)(100000 + random.nextFloat() * 100000))
						, request.getParameter("firstNameNew")
						, request.getParameter("lastNameNew")
						, request.getParameter("phone")
						, String.valueOf(roleCode)
						, -1, "", 0);

			List<User> userList = userService.displayUsers();
			String object = JSONObject.valueToString(userList);
			
			usresView.setViewName("users");
			usresView.addObject("userList", object);
			usresView.addObject("userId", request.getParameter("userId"));
			usresView.addObject("role", request.getParameter("role"));
			usresView.addObject("firstName", request.getParameter("firstName"));
			usresView.addObject("func", request.getParameter("func"));
			return usresView;
			
		}catch(Exception e){
			logger.fatal(e.getMessage());
			return usresView;
		}
	}
	
	/**
	 * Display the users.
	 *
	 * @param request
	 *            the request
	 * @param response
	 *            the response
	 * @return the model and view
	 */
	public ModelAndView displayUsers(HttpServletRequest request, HttpServletResponse response) {
		logger.info("Show user list");

		try{
			List<User> userList = userService.displayUsers();
			String object = JSONObject.valueToString(userList);
			
			ModelAndView userView = new ModelAndView();
			userView.setViewName("users");
			userView.addObject("userList", object);
			userView.addObject("userId", request.getParameter("userId"));
			userView.addObject("role", request.getParameter("role"));
			userView.addObject("firstName", request.getParameter("firstName"));
			userView.addObject("func", request.getParameter("func"));
			
			return userView;
		}
		catch(Exception e){
			logger.fatal(e.getMessage());
			return new ModelAndView();
		}
	}
}

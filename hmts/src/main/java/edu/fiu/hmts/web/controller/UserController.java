/**
 * 
 */
package edu.fiu.hmts.web.controller;

import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
import org.springframework.web.servlet.view.RedirectView;

import edu.fiu.hmts.domain.User;
import edu.fiu.hmts.service.IUserService;
import edu.fiu.hmts.service.impl.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author Wenbo
 *
 */
@Controller
public class UserController extends MultiActionController {
	
	protected final Log logger = LogFactory.getLog(getClass());
	
	@Autowired
	private IUserService userService;
	
	
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) 
			throws Exception {
		logger.info("User is signing in the system.");
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		User user = userService.login(username, password);
		ModelAndView home = new ModelAndView("home");
		home.addObject("UserID", user.getUserId());
		home.addObject("Role", user.getRole());
		home.addObject("FirstName", user.getFirstName());
		home.addObject("Func", user.getTag());
		return home;
	}
	
	
	public ModelAndView logout(HttpServletRequest request, HttpServletResponse response) 
			throws Exception {
		logger.info("User is signing out the system");
		
		ModelAndView login = new ModelAndView(new RedirectView("userview.do"));
		login.addObject("mode", "openLogin");
		
		return login;
	}

}

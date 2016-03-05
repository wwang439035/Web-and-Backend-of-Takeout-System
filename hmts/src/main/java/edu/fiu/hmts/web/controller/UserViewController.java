/**
 * 
 */
package edu.fiu.hmts.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

/**
 * @author Wenbo
 *
 */
@Controller
public class UserViewController extends MultiActionController {

	public ModelAndView openRegistration(HttpServletRequest request, HttpServletResponse response) 
			throws Exception {
		logger.info("Open a registration page of staff.");
		ModelAndView registerpage = new ModelAndView("/jsp/registerstaff.jsp");
		return registerpage;
	}
	
	public ModelAndView openLogin(HttpServletRequest request, HttpServletResponse response) 
			throws Exception {
		logger.info("Open a Login page.");
		ModelAndView loginView = new ModelAndView("login");
		return loginView;
	}
}

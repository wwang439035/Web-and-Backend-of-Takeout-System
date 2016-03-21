package edu.fiu.hmts.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

/**
 * The Class UserViewController.
 */
@Controller
public class UserViewController extends MultiActionController {

	/**
	 * Open registration.
	 *
	 * @param request
	 *            the request
	 * @param response
	 *            the response
	 * @return the model and view
	 * @throws Exception
	 *             the exception
	 */
	public ModelAndView openRegistration(HttpServletRequest request, HttpServletResponse response) 
			throws Exception {
		logger.info("Open a registration page of staff.");
		ModelAndView registerpage = new ModelAndView("/jsp/registerstaff.jsp");
		return registerpage;
	}
	
	/**
	 * Open login.
	 *
	 * @param request
	 *            the request
	 * @param response
	 *            the response
	 * @return the model and view
	 * @throws Exception
	 *             the exception
	 */
	public ModelAndView openLogin(HttpServletRequest request, HttpServletResponse response) 
			throws Exception {
		logger.info("Open a Login page.");
		ModelAndView loginView = new ModelAndView("login");
		return loginView;
	}
	
	/**
	 * Open order info.
	 *
	 * @param request
	 *            the request
	 * @param response
	 *            the response
	 * @return the model and view
	 * @throws Exception
	 *             the exception
	 */
	public ModelAndView openOrderInfo(HttpServletRequest request, HttpServletResponse response) 
			throws Exception {
		logger.info("Open a Order Info page.");
		ModelAndView loginView = new ModelAndView("orderinfo");
		return loginView;
	}
}

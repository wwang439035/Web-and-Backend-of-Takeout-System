/**
 * 
 */
package edu.fiu.hmts.web.controller;

import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author Wenbo
 *
 */
public class UserController extends MultiActionController {
	
	protected final Log logger = LogFactory.getLog(getClass());
	
	public ModelAndView openregister(HttpServletRequest request, HttpServletResponse response) 
			throws Exception {
		logger.info("Open a registration page of staff.");
		ModelAndView registerpage = new ModelAndView("/jsp/registerstaff.jsp");
		return registerpage;
	}
	
	
	public ModelAndView listUsers(HttpServletRequest request, HttpServletResponse response) 
			throws Exception {
		logger.info("Display a user-list.");
		ModelAndView registerpage = new ModelAndView("./jsp/home.jsp");
		return registerpage;
	}

}

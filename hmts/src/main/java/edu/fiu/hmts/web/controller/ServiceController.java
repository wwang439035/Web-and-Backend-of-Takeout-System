package edu.fiu.hmts.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;


/**
 * The Class ServiceController.
 */
@Controller
public class ServiceController extends MultiActionController {
	
	/** The logger. */
	protected final Log logger = LogFactory.getLog(getClass());
	
	/**
	 * Display the menu.
	 *
	 * @param request
	 *            the request
	 * @param response
	 *            the response
	 * @return the model and view
	 */
	public ModelAndView displayMenu(HttpServletRequest request, HttpServletResponse response) {
		return null;
	}
	
	/**
	 * Query product.
	 *
	 * @param request
	 *            the request
	 * @param response
	 *            the response
	 * @return the model and view
	 */
	public ModelAndView selectProduct(HttpServletRequest request, HttpServletResponse response) {
		return null;
	}
	
	/**
	 * Del product cart.
	 *
	 * @param request
	 *            the request
	 * @param response
	 *            the response
	 * @return the model and view
	 */
	public ModelAndView DelProductCart(HttpServletRequest request, HttpServletResponse response) {
		return null;
	}
	
	/**
	 * Display the cart.
	 *
	 * @param request
	 *            the request
	 * @param response
	 *            the response
	 * @return the model and view
	 */
	public ModelAndView displayCart(HttpServletRequest request, HttpServletResponse response) {
		return null;
	}
	
	/**
	 * New order.
	 *
	 * @param request
	 *            the request
	 * @param response
	 *            the response
	 * @return the model and view
	 */
	public ModelAndView newOrder(HttpServletRequest request, HttpServletResponse response) {
		return null;
	}
}

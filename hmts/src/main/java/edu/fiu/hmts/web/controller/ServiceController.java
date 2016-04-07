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
	
	protected final Log logger = LogFactory.getLog(getClass());
	
	/**
	 * Display the products.
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
	 * Select the product.
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
	 * Delete a product from shopping cart.
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
	 * Display shopping cart.
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
	 * Create an order.
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

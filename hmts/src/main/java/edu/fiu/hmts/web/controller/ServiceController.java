package edu.fiu.hmts.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import edu.fiu.hmts.service.IServiceService;

/**
 * The Class OperationController.
 */
@Controller
public class ServiceController extends MultiActionController {
	
	@Autowired
	private IServiceService servService;

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
		logger.info("Show product list");
		ModelAndView productList = new ModelAndView();
		
		try{
			
			
			productList.setViewName("visualizeproducts");
			productList.addObject("userId", request.getParameter("userId"));
			productList.addObject("firstName", request.getParameter("userId"));
			productList.addObject("role", request.getParameter("role"));
		}
		catch(Exception e){
			logger.fatal(e.getMessage());
		}
		
		return productList;
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
		logger.info("Show product list");
		ModelAndView productList = new ModelAndView();

		return productList;
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
		logger.info("Show product list");
		ModelAndView productList = new ModelAndView();

		return productList;
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
		logger.info("Show product list");
		ModelAndView productList = new ModelAndView();

		return productList;
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
		logger.info("Show product list");
		ModelAndView productList = new ModelAndView();

		return productList;
	}
}

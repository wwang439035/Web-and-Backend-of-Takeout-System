package edu.fiu.hmts.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import edu.fiu.hmts.domain.hmts_repos.Order;
import edu.fiu.hmts.domain.hmts_repos.Product;
import edu.fiu.hmts.service.IOperationService;

/**
 * The Class OperationController.
 */
@Controller
public class OperationController extends MultiActionController {
	
	@Autowired
	private IOperationService operaService;

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
	public ModelAndView displayProducts(HttpServletRequest request, HttpServletResponse response) {
		logger.info("Show product list");

		try{
			List<Product> proList = operaService.displayProducts();
			String object = JSONObject.valueToString(proList);
			
			ModelAndView productView = new ModelAndView();
			productView.setViewName("products");
			productView.addObject("proList", object);
			productView.addObject("userId", request.getParameter("userId"));
			productView.addObject("role", request.getParameter("role"));
			productView.addObject("firstName", request.getParameter("firstName"));
			productView.addObject("func", request.getParameter("func"));
			
			return productView;
		}
		catch(Exception e){
			logger.fatal(e.getMessage());
			return new ModelAndView();
		}
	}
	
	
	/**
	 * Creates the products.
	 *
	 * @param request
	 *            the request
	 * @param response
	 *            the response
	 * @return the model and view
	 */
	public ModelAndView createProduct(HttpServletRequest request, HttpServletResponse response) {
		logger.info("Create a product");

		try{
			Product product = new Product();
			product.setName(request.getParameter("name"));
			product.setType(request.getParameter("type"));
			product.setPrice(Double.parseDouble(request.getParameter("price")));
			product.setBrief(request.getParameter("brief"));
			
			operaService.createProduct(product);
			
			List<Product> proList = operaService.displayProducts();
			
			String object = JSONObject.valueToString(proList);
			
			ModelAndView productView = new ModelAndView();
			productView.setViewName("products");
			productView.addObject("proList", object);
			productView.addObject("userId", request.getParameter("userId"));
			productView.addObject("role", request.getParameter("role"));
			productView.addObject("firstName", request.getParameter("firstName"));
			productView.addObject("func", request.getParameter("func"));
			
			return productView;
		}
		catch(Exception e){
			logger.fatal(e.getMessage());
			return new ModelAndView();
		}
	}
	
	/**
	 * Display the orders.
	 *
	 * @param request
	 *            the request
	 * @param response
	 *            the response
	 * @return the model and view
	 */
	public ModelAndView displayOrders(HttpServletRequest request, HttpServletResponse response) {
		logger.info("Show order list");

		try{
			List<Order> orderList = operaService.displayOrders();
			String object = JSONObject.valueToString(orderList);
			
			ModelAndView orderView = new ModelAndView();
			orderView.setViewName("orders");
			orderView.addObject("orderList", object);
			orderView.addObject("userId", request.getParameter("userId"));
			orderView.addObject("role", request.getParameter("role"));
			orderView.addObject("firstName", request.getParameter("firstName"));
			orderView.addObject("func", request.getParameter("func"));
			
			return orderView;
		}
		catch(Exception e){
			logger.fatal(e.getMessage());
			return new ModelAndView();
		}
	}
}

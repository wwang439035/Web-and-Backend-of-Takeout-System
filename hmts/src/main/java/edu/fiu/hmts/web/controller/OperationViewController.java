package edu.fiu.hmts.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

/**
 * The Class OperationViewController.
 */
@Controller
public class OperationViewController extends MultiActionController {

	protected final Log logger = LogFactory.getLog(getClass());
	
	/**
	 * Adds the products.
	 *
	 * @param request
	 *            the request
	 * @param response
	 *            the response
	 * @return the model and view
	 */
	public ModelAndView addProducts(HttpServletRequest request, HttpServletResponse response) {
		logger.info("Show product list");
		ModelAndView addProduct = new ModelAndView();
		
		try{
			addProduct.setViewName("visualizeproducts");
		}
		catch(Exception e){
			logger.fatal(e.getMessage());
		}
		
		return addProduct;
	}
}

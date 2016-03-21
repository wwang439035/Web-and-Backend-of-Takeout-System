package edu.fiu.hmts.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

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
}

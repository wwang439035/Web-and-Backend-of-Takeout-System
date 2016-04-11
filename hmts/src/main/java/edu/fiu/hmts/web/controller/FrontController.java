package edu.fiu.hmts.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

/**
 * The Class FrontController.
 */
@Controller
public class FrontController extends MultiActionController {

	/** The logger. */
	protected final Log logger = LogFactory.getLog(getClass());
	
	/**
	 * Dispatcher.
	 *
	 * @param request
	 *            the request
	 * @param response
	 *            the response
	 * @return the model and view
	 */
	public ModelAndView dispatcher(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView targetView = new ModelAndView();
		try{
			String targetPage = request.getParameter("target").toString();
			logger.info("Dispatch a page " + targetPage);

			targetView.addObject("userId", request.getParameter("userId"));
			targetView.addObject("role", request.getParameter("role"));
			targetView.addObject("firstName", request.getParameter("firstName"));
			targetView.addObject("func", request.getParameter("func"));
			
			switch (targetPage) {
			case "login":
				targetView.setViewName("login");
				break;
			case "home":
				targetView.setViewName("home");
				break;
			case "contact":
				targetView.setViewName("contact");
				break;
			case "team":
				targetView.setViewName("team");
				break;
	
			default:
				break;
			}
			
			return targetView;
		}
		catch(Exception e){
			logger.fatal(e.getMessage());
			targetView.setViewName("home");
			return targetView;
		}
	}
}

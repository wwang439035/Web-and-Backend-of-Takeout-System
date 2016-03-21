package edu.fiu.hmts.web.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import com.sun.jersey.api.spring.Autowire;

import edu.fiu.hmts.service.IServiceService;

/**
 * The Class ServiceRestService.
 */
@Autowire
@Path("/servservice")
public class ServiceRestService {

	@Autowired
	private IServiceService servservice;
	
	protected final Log Logger = LogFactory.getLog(getClass());
	
	/**
	 * Display the menu.
	 *
	 * @param data
	 *            the data
	 * @return the response
	 */
	@Path("/displaymenu")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response displayMenu(JSONObject data) {
		try{
			
		}
		catch(Exception e){
			
		}
		return null;
	}
	
	/**
	 * Query product.
	 *
	 * @param data
	 *            the data
	 * @return the response
	 */
	@Path("/selectProduct")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response selectProduct(JSONObject data) {
		try{
			
		}
		catch(Exception e){
			
		}
		return null;
	}
	
	/**
	 * Remove product.
	 *
	 * @param data
	 *            the data
	 * @return the response
	 */
	@Path("/removeProduct")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response removeProduct(JSONObject data) {
		try{
			
		}
		catch(Exception e){
			
		}
		return null;
	}
	
	/**
	 * Display the cart.
	 *
	 * @param data
	 *            the data
	 * @return the response
	 */
	@Path("/displayCart")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response displayCart(JSONObject data) {
		try{
			
		}
		catch(Exception e){
			
		}
		return null;
	}
	
	/**
	 * Place order.
	 *
	 * @param data
	 *            the data
	 * @return the response
	 */
	@Path("/placeOrder")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response placeOrder(JSONObject data) {
		try{
			
		}
		catch(Exception e){
			
		}
		return null;
	}
}

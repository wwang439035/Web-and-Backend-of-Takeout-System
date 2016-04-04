package edu.fiu.hmts.web.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import com.sun.jersey.api.spring.Autowire;

import edu.fiu.hmts.domain.User;
import edu.fiu.hmts.service.IOperationService;
import edu.fiu.hmts.service.IServiceService;
import edu.fiu.hmts.service.IUserService;

/**
 * The Class MobileInterface.
 */
@Autowire
@Path("/servservice")
public class MobileInterface {

	@Autowired
	private IServiceService servservice;
	
	@Autowired
	private IUserService userService;
	
	@Autowired
	private IOperationService operaService;
	
	protected final Log logger = LogFactory.getLog(getClass());
	
	/**
	 * Register.
	 *
	 * @param data
	 *            the data
	 * @return the response
	 */
	@Path("/register")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response register(User data) {
		try{
			User user = userService.register(data.getUsername(), data.getPassword()
					, data.getFirstName(), data.getLastName(), data.getPhone()
					, data.getRole(), data.getSecQuestionId(), data.getSecAnswer()
					, 1);
			
			if (user.getUserId() == null)
				return Response.status(Status.NOT_FOUND).entity("Registration Failed").build();
			
			return Response.ok(user, MediaType.APPLICATION_JSON).build();
		}catch(Exception e){
			logger.fatal(e.getMessage());
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	
	/**
	 * Login.
	 *
	 * @param data
	 *            the data
	 * @return the response
	 */
	@Path("/login")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response login(User data) {
		try{
			User user = userService.login(data.getUsername(), data.getPassword());
			
			if (user.getUserId() == null)
				return Response.status(Status.NOT_FOUND).entity("User not found").build();
			
			return Response.ok(user, MediaType.APPLICATION_JSON).build();
		}catch(Exception e){
			logger.fatal(e.getMessage());
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	
	/**
	 * Logout.
	 *
	 * @param data
	 *            the data
	 * @return the response
	 */
	@Path("/logout")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response logout(User data) {
		try{
			boolean res = userService.logout(data.getUserId());
			
			if (!res)
				return Response.status(Status.NOT_FOUND).entity("User not found").build();
			
			return Response.ok("Logout Successfully", MediaType.TEXT_PLAIN).build();
		}catch(Exception e){
			logger.fatal(e.getMessage());
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	
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

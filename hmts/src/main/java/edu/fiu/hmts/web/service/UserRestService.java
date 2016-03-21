package edu.fiu.hmts.web.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.sun.jersey.api.spring.Autowire;

import edu.fiu.hmts.domain.User;
import edu.fiu.hmts.service.IUserService;

/**
 * The Class UserRestService.
 */
@Autowire
@Path("/userservice")
public class UserRestService {
	
	@Autowired
	private IUserService userService;
	
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
}

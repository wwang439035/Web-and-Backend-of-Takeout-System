package edu.fiu.hmts.web.service;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import com.sun.jersey.api.spring.Autowire;

import edu.fiu.hmts.domain.hmts_repos.Card;
import edu.fiu.hmts.domain.hmts_repos.Order;
import edu.fiu.hmts.domain.hmts_repos.OrderProduct;
import edu.fiu.hmts.domain.hmts_repos.Payment;
import edu.fiu.hmts.domain.hmts_repos.Product;
import edu.fiu.hmts.domain.hmts_repos.SecQuestion;
import edu.fiu.hmts.domain.hmts_repos.SelProduct;
import edu.fiu.hmts.domain.hmts_repos.User;
import edu.fiu.hmts.service.IServiceService;
import edu.fiu.hmts.service.IUserService;

/**
 * The Class MobileInterface.
 */
@Autowire
@Path("/service")
public class MobileInterface {

	@Autowired
	private IServiceService servservice;
	
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
		logger.info("Create an account.");
		try{
			Map<String, Object> map = new LinkedHashMap<>();
			User user = userService.register(data.getUsername(), data.getPassword()
					, data.getFirstName(), data.getLastName(), data.getPhone()
					, data.getRole(), data.getSecQuestionId(), data.getSecAnswer()
					, 1);
			if (user.getUserId() == -1)
				map.put("result", "failed");
			else{
				map.put("result", "successful");
				map.put("count", 1);
				map.put("data", user);
			}
			return Response.ok(map, MediaType.APPLICATION_JSON).build();
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
			User user = userService.login(data.getUsername(), data.getPassword(), 1);
			Map<String, Object> map = new LinkedHashMap<>();
			if (user.getUserId() == -1)
				map.put("result", "failed");
			else{
				map.put("result", "successful");
				map.put("count", 1);
				map.put("data", user);
			}
			return Response.ok(map, MediaType.APPLICATION_JSON).build();
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
			userService.logout(data.getUserId());
			Map<String, String> map = new LinkedHashMap<>();
			map.put("result", "successful");
			map.put("count", "1");
			map.put("data", "Logout");
			return Response.ok(map, MediaType.APPLICATION_JSON).build();
		}catch(Exception e){
			logger.fatal(e.getMessage());
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	
	/**
	 * Display the menu.
	 *
	 * @return the response
	 */
	@Path("/displaymenu")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response displayMenu() {
		logger.info("Show menu.");

		try{
			List<Product> proList = servservice.displayMenu();
			Map<String, Object> map = new LinkedHashMap<>();
			map.put("result", "successful");
			map.put("count", proList.size());
			map.put("data", proList);
			return Response.ok(map, MediaType.APPLICATION_JSON).build();
		}
		catch(Exception e){
			logger.fatal(e.getMessage());
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	/**
	 * Query product.
	 *
	 * @param selProduct
	 *            the sel product
	 * @return the response
	 */
	@Path("/selectproduct")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response selectProduct(SelProduct selProduct) {
		logger.info("Remove a product in shopping cart.");
		Map<String, Object> map = new LinkedHashMap<>();

		try{
			int res = servservice.selectProduct(selProduct);
			if (res < 1)
				map.put("result", "failed");
			else{
				List<SelProduct> selProList = servservice.displayCart(selProduct.getUserId());
				map.put("result", "successful");
				map.put("count", 1);
				map.put("data", selProList);
			}
			return Response.ok(map, MediaType.APPLICATION_JSON).build();
		}
		catch(Exception e){
			logger.fatal(e.getMessage());
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	/**
	 * Remove product.
	 *
	 * @param selProduct
	 *            the sel product
	 * @return the response
	 */
	@Path("/removeproduct")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response removeProduct(SelProduct selProduct) {
		logger.info("Remove a product in shopping cart.");
		Map<String, Object> map = new LinkedHashMap<>();

		try{
			int res = servservice.removeProduct(selProduct.getUserId(), selProduct.getProductId());
			if (res < 1)
				map.put("result", "failed");
			else{
				List<SelProduct> selProList = servservice.displayCart(selProduct.getUserId());
				map.put("result", "successful");
				map.put("count", 1);
				map.put("data", selProList);
			}
			return Response.ok(map, MediaType.APPLICATION_JSON).build();
		}
		catch(Exception e){
			logger.fatal(e.getMessage());
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	/**
	 * Display the cart.
	 *
	 * @param data
	 *            the data
	 * @return the response
	 */
	@Path("/displaycart")
	@POST
	@Consumes(MediaType.TEXT_PLAIN)
	public Response displayCart(long data) {
		logger.info("Show shopping cart.");

		try{
			List<SelProduct> selProList = servservice.displayCart(data);
			Map<String, Object> map = new LinkedHashMap<>();
			map.put("result", "successful");
			map.put("count", selProList.size());
			map.put("data", selProList);
			return Response.ok(map, MediaType.APPLICATION_JSON).build();
		}
		catch(Exception e){
			logger.fatal(e.getMessage());
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	/**
	 * Place an order.
	 *
	 * @param data
	 *            the data
	 * @return the response
	 */
	@Path("/placeorder")
	@POST
	@Consumes(MediaType.TEXT_PLAIN)
	public Response placeOrder(String data) {
		logger.info("place an order.");
		try{
			JSONObject jsonObject = new JSONObject(data);
			Order order = new ObjectMapper().readValue(jsonObject.getJSONObject("order").toString(), Order.class);
			Payment payment = new ObjectMapper().readValue(jsonObject.getJSONObject("payment").toString(), Payment.class);
			Card card = null;
			if (jsonObject.has("card"))
				card = new ObjectMapper().readValue(jsonObject.getJSONObject("card").toString(), Card.class);
			JSONArray orderArray = jsonObject.getJSONArray("cartArray");
			List<OrderProduct> orderProducts = new ArrayList<OrderProduct>();
			for (int i = 0; i < orderArray.length(); i++){
				OrderProduct orderProduct = new ObjectMapper()
						.readValue(orderArray.getJSONObject(i).toString(), OrderProduct.class);
				orderProducts.add(orderProduct);
			}
			int res = servservice.placeOrder(order, payment, orderProducts, card);
			
			JSONObject map = new JSONObject();
			map.put("result", res == 1 ? "successful" : "Failed");
			map.put("count", 0);
			map.put("data", "");
			return Response.ok(map.toString(), MediaType.TEXT_PLAIN).build();
		}
		catch(Exception e){
			logger.fatal(e.getMessage());
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	
	/**
	 * Gets the questions.
	 *
	 * @return the questions
	 */
	@Path("/getquestions")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getQuestions() {
		logger.info("Show questions.");

		try{
			List<SecQuestion> quesList = servservice.getQuestions();
			Map<String, Object> map = new LinkedHashMap<>();
			map.put("result", "successful");
			map.put("count", quesList.size());
			map.put("data", quesList);
			return Response.ok(map, MediaType.APPLICATION_JSON).build();
		}
		catch(Exception e){
			logger.fatal(e.getMessage());
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}
}

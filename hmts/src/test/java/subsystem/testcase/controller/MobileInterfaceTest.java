package subsystem.testcase.controller;

import static org.junit.Assert.*;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.doCallRealMethod;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import static org.hamcrest.Matchers.*;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import edu.fiu.hmts.dao.hmts_repos.OrderMapper;
import edu.fiu.hmts.dao.hmts_repos.ProductMapper;
import edu.fiu.hmts.dao.hmts_repos.SelProductMapper;
import edu.fiu.hmts.dao.hmts_repos.UserMapper;
import edu.fiu.hmts.domain.hmts_repos.Product;
import edu.fiu.hmts.domain.hmts_repos.SelProduct;
import edu.fiu.hmts.domain.hmts_repos.User;
import edu.fiu.hmts.service.IServiceService;
import edu.fiu.hmts.service.impl.ServiceService;
import edu.fiu.hmts.service.impl.UserService;
import edu.fiu.hmts.web.service.MobileInterface;
import net.minidev.json.JSONObject;

/**
 * The Class MobileInterfaceTest.
 * 
 * @author  Wenbo Wang
 * @version 1.0, April 2016
 */
public class MobileInterfaceTest extends JerseyTest {

	/** The serv service. */
	private ServiceService servService;
	
	/** The user service. */
	@Mock
	private UserService userService;
	
	/** The user mapper. */
	@Mock
	private UserMapper userMapper;
	
	/** The product mapper. */
	@Mock
	private ProductMapper productMapper;
	
	/** The order mapper. */
	@Mock
	private OrderMapper orderMapper;
	
	/** The sel product mapper. */
	@Mock
	private SelProductMapper selProductMapper;
	
	/** The mob user s. */
	User userNU, mobUserS;
	
	/** The user list f. */
	List<User> mobUserList, userListF;
	
	/** The pro list. */
	List<Product> proList = new ArrayList<>();
	
	/** The user json. */
	JSONObject userJson = new JSONObject();
	
	/**
	 * Configure.
	 *
	 * @return the application
	 * 
	 * @author  Wenbo Wang
	 * @version 1.0, April 2016
	 */
	@Override
	protected Application configure() {
		return new ResourceConfig(MobileInterface.class)
				.property("contextConfigLocation", "classpath:testContext.xml");
	}
	
	/**
	 * Sets the up child.
	 */
	@Before
	public void setUpChild(){
		MockitoAnnotations.initMocks(this);
		
		servService = Mockito.mock(ServiceService.class);
		
		mobUserS = new User();
		mobUserS.setUserId(2L);
		mobUserS.setUsername("david@yahoo.com");
		mobUserS.setPassword("123456");
		mobUserS.setFirstName("David");
		mobUserS.setLastName("Chris");
		mobUserS.setPhone("(305)233-9483");
		mobUserS.setSecQuestionId(1);
		mobUserS.setSecAnswer("Paul");
		mobUserS.setRole("4");
		
		userJson.put("userId", mobUserS.getUserId());
		userJson.put("username", mobUserS.getUsername());
		userJson.put("password", mobUserS.getPassword());
		userJson.put("firstName", mobUserS.getFirstName());
		userJson.put("lastName", mobUserS.getLastName());
		userJson.put("phone", mobUserS.getPhone());
		userJson.put("secQuestionId", mobUserS.getSecQuestionId());
		userJson.put("secAnswer", mobUserS.getSecAnswer());
		userJson.put("role", mobUserS.getRole());
		
		mobUserList = new ArrayList<>();
		mobUserList.add(mobUserS);
		
		Product product1 = new Product();
		product1.setName("Turkey breast");
		product1.setType("Dish");
		product1.setPrice(8.99);
		proList.add(product1);
		
		Product product2 = new Product();
		product2.setName("Vegetables");
		product2.setType("Side");
		product2.setPrice(2.99);
		proList.add(product2);
		
		Product product3 = new Product();
		product3.setName("Lemonade");
		product3.setType("Drink");
		product3.setPrice(1.99);
		proList.add(product3);
	}
	
	/**
	 * Tear down child.
	 * 
	 * @author  Wenbo Wang
	 * @version 1.0, April 2016
	 */
	@After
	public void tearDownChild() { }

	/**
	 * Test register.
	 * 
	 * @author  Wenbo Wang
	 * @version 1.0, April 2016
	 */
	@Test
	public final void testRegister() {
		try {
			doCallRealMethod().when(userService).register(any(), any(), any(), any(), any(), any(), any(), any(), any());
			when(userMapper.insert(any())).thenReturn(1);
			
			Entity<JSONObject> user = Entity.entity(userJson, MediaType.APPLICATION_JSON);
			
			Response response = target("/service/register").request().post(user);
			assertEquals(user, response.getEntity());
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	/**
	 * Test login mob success.
	 * 
	 * @author  Wenbo Wang
	 * @version 1.0, April 2016
	 */
	@Test
	public final void testLoginMobSuccess() {
		try {
			doCallRealMethod().when(userService).login(any(), any(), any());
			when(userMapper.selectByExample(any())).thenReturn(mobUserList);
			
			Entity<JSONObject> user = Entity.entity(userJson, MediaType.APPLICATION_JSON);
			
			Response response = target("/service/login").request().post(user);
			assertEquals(user, response.getEntity());
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	/**
	 * Test login mob failed.
	 * 
	 * @author  Wenbo Wang
	 * @version 1.0, April 2016
	 */
	@Test
	public final void testLoginMobFailed() {
		try {
			doCallRealMethod().when(userService).login(any(), any(), any());
			when(userMapper.selectByExample(any())).thenReturn(mobUserList);
			
			Entity<JSONObject> user = Entity.entity(userJson, MediaType.APPLICATION_JSON);
			
			Response response = target("/service/login").request().post(user);
			assertEquals(null, response.getEntity());
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	/**
	 * Test logout.
	 * 
	 * @author  Wenbo Wang
	 * @version 1.0, April 2016
	 */
	@Test
	public final void testLogout() {
		try {
			doCallRealMethod().when(userService).logout(any());
			
			Entity<JSONObject> user = Entity.entity(userJson, MediaType.APPLICATION_JSON);
			
			Response response = target("/service/logout").request().post(user);
			assertEquals(true, response.getEntity());
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	/**
	 * Test display menu.
	 * 
	 * @author  Wenbo Wang
	 * @version 1.0, April 2016
	 */
	@Test
	public final void testDisplayMenu() {
		try {
			doCallRealMethod().when(servService).displayMenu();
			when(productMapper.selectByExample(any())).thenReturn(proList);
			//when(servService.displayMenu()).thenReturn(proList);
			
			String response = target("/service/displaymenu").request().get(String.class);
			assertEquals("{\"result\":\"successful\",\"count\":0,\"data\":[]}", response);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	/**
	 * Test select product.
	 * 
	 * @author  Wenbo Wang
	 * @version 1.0, April 2016
	 */
	@Test
	public final void testSelectProduct() {
		try {
			doCallRealMethod().when(servService).selectProduct(any());
			when(productMapper.insert(any())).thenReturn(1);
			
			Entity<Product> product = Entity.entity(proList.get(0), MediaType.APPLICATION_JSON);
			
			Response response = target("/service/selectproect").request().post(product);
			assertEquals(1, response.getEntity());
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	/**
	 * Test remove product.
	 * 
	 * @author  Wenbo Wang
	 * @version 1.0, April 2016
	 */
	@Test
	public final void testRemoveProduct() {
		try {
			doCallRealMethod().when(servService).removeProduct(any(), any());
			when(productMapper.deleteByExample(any())).thenReturn(1);
			
			Entity<Product> product = Entity.entity(proList.get(0), MediaType.APPLICATION_JSON);
			
			Response response = target("/service/removeproect").request().post(product);
			assertEquals(1, response.getEntity());
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	/**
	 * Test display cart.
	 * 
	 * @author  Wenbo Wang
	 * @version 1.0, April 2016
	 */
	@Test
	public final void testDisplayCart() {
		try {
			doCallRealMethod().when(servService).displayCart(any());
			when(selProductMapper.selectByExample(any())).thenReturn(new ArrayList<SelProduct>());
			
			Entity<Product> product = Entity.entity(proList.get(0), MediaType.APPLICATION_JSON);
			
			Response response = target("/service/displaycart").request().get();
			assertEquals(1, response.getEntity());
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	/*@Test
	public final void testPlaceOrder() {
		
	}

	@Test
	public final void testGetQuestions() {
		
	}*/

}

package subsystem.testcase.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.context.WebApplicationContext;

import edu.fiu.hmts.dao.hmts_repos.OrderMapper;
import edu.fiu.hmts.dao.hmts_repos.ProductMapper;
import edu.fiu.hmts.domain.hmts_repos.Order;
import edu.fiu.hmts.domain.hmts_repos.Product;
import edu.fiu.hmts.service.impl.OperationService;


/**
 * The Class OperationControllerTest.
 * 
 * @author  Wenbo Wang
 * @version 1.0, April 2016
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/web-servlet.xml",
		"file:src/main/webapp/WEB-INF/spring/spring-jdbc.xml",
		"file:src/test/resources/testcontext.xml"})
@TestExecutionListeners({DependencyInjectionTestExecutionListener.class})
public class OperationControllerTest {
	
	/** The wac. */
	@Autowired
	private WebApplicationContext wac;
	
	/** The mock mvc. */
	private MockMvc mockMVC;

	/** The operation service. */
	@Autowired
	private OperationService operationService;
	
	/** The product mapper. */
	@Autowired
	private ProductMapper productMapper;
	
	/** The order mapper. */
	@Autowired
	private OrderMapper orderMapper;

	/** The pro list. */
	List<Product> proList = new ArrayList<>();
	
	/** The pro list failed. */
	List<Product> proListFailed = new ArrayList<>();
	
	/** The order list. */
	List<Order> orderList = new ArrayList<>();
	
	/** The product. */
	Product product = new Product();
	
	/** The products. */
	String products = "";
	
	/** The product failed. */
	String productFailed = "";
	
	/**
	 * Sets the up.
	 * 
	 * @author  Wenbo Wang
	 * @version 1.0, April 2016
	 *
	 * @throws Exception
	 *             the exception
	 */
	@Before
	public void setUp() throws Exception {
		mockMVC = webAppContextSetup(wac).build();
		
		products = "[{\"brief\":\"Roasted with a flavorful combination of butter and seasonings.\""
				+ ",\"productId\":1,\"price\":8.99,\"name\":\"Turkey Breast\",\"type\":\"Dish\"}"
				+ ",{\"brief\":\"Chopped green pepper, onion, pimiento, corn, green beans, and green peas.\""
				+ ",\"productId\":2,\"price\":2.99,\"name\":\"Vegetables\",\"type\":\"Side\"}]";
		
		productFailed = "[{\"brief\":\"Chopped green pepper, onion, pimiento, corn, green beans, and green peas.\""
				+ ",\"productId\":2,\"price\":2.99,\"name\":\"Vegetables\",\"type\":\"Side\"}]";
		
		Product product1 = new Product();
		product1.setProductId(1L);
		product1.setName("Turkey Breast");
		product1.setType("Dish");
		product1.setPrice(8.99);
		product1.setBrief("Roasted with a flavorful combination of butter and seasonings.");
		proList.add(product1);
		
		Product product2 = new Product();
		product2.setProductId(2L);
		product2.setName("Vegetables");
		product2.setType("Side");
		product2.setPrice(2.99);
		product2.setBrief("Chopped green pepper, onion, pimiento, corn, green beans, and green peas.");
		proList.add(product2);
		
		proListFailed.add(product2);
		
		product.setName("Pizza");
		product.setType("Side");
		product.setPrice(10.99);
		product.setBrief("Pork, Onions and Cheese.");
		
		Order order = new Order();
		order.setPhone("(305)474-2378");
		order.setShipAddress("123 NW 14th St, Miami FL 33100");
		order.setStatus("processing");
		order.setOrderId(5L);
		order.setUserId(3L);
		orderList.add(order);
	}

	/**
	 * Test display products success.
	 * 
	 * @author  Wenbo Wang
	 * @version 1.0, April 2016
	 */
	@Test
	public final void testDisplayProductsSuccess() {
		try {
			doCallRealMethod().when(operationService).displayProducts();
			when(productMapper.selectByExample(any())).thenReturn(proList);
			
			mockMVC.perform(post("/operation.do")
					.param("mode", "displayProducts")
					.param("userId", "1")
					.param("firstName", "Administrator")
					.param("role", "1")
					.param("func", "1,2,3,"))
				//.andDo(print())
				.andExpect(status().isOk())
				.andExpect(model().attribute("userId", "1"))
				.andExpect(model().attribute("firstName", "Administrator"))
				.andExpect(model().attribute("func", "1,2,3,"))
				.andExpect(model().attribute("proList", products));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Test display products no product.
	 * 
	 * @author  Wenbo Wang
	 * @version 1.0, April 2016
	 */
	@Test
	public final void testDisplayProductsNoProduct() {
		try {
			doCallRealMethod().when(operationService).displayProducts();
			when(productMapper.selectByExample(any())).thenReturn(new ArrayList<Product>());
			
			mockMVC.perform(post("/operation.do")
					.param("mode", "displayProducts")
					.param("userId", "1")
					.param("firstName", "Administrator")
					.param("role", "1")
					.param("func", "1,2,3,"))
				//.andDo(print())
				.andExpect(status().isOk())
				.andExpect(model().attribute("userId", "1"))
				.andExpect(model().attribute("firstName", "Administrator"))
				.andExpect(model().attribute("func", "1,2,3,"))
				.andExpect(model().attribute("proList", "[]"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Test create product success.
	 * 
	 * @author  Wenbo Wang
	 * @version 1.0, April 2016
	 */
	@Test
	public final void testCreateProductSuccess() {
		try {
			doCallRealMethod().when(operationService).displayProducts();
			doCallRealMethod().when(operationService).createProduct(any());
			when(productMapper.selectByExample(any())).thenReturn(proList);
			when(productMapper.insert(any())).thenReturn(1);
			
			mockMVC.perform(post("/operation.do")
					.param("mode", "createProduct")
					.param("userId", "1")
					.param("firstName", "Administrator")
					.param("role", "1")
					.param("func", "1,2,3,")
					.param("name", product.getName())
					.param("type", product.getType())
					.param("price", product.getPrice().toString())
					.param("brief", product.getBrief()))
				//.andDo(MockMvcResultHandlers.print())
				.andExpect(status().isOk())
				.andExpect(model().attribute("userId", "1"))
				.andExpect(model().attribute("firstName", "Administrator"))
				.andExpect(model().attribute("func", "1,2,3,"))
				.andExpect(model().attribute("proList", products));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Test create product no name.
	 * 
	 * @author  Wenbo Wang
	 * @version 1.0, April 2016
	 */
	@Test
	public final void testCreateProductNoName() {
		try {
			doCallRealMethod().when(operationService).displayProducts();
			doCallRealMethod().when(operationService).createProduct(any());
			when(productMapper.selectByExample(any())).thenReturn(proListFailed);
			when(productMapper.insert(any())).thenReturn(1);
			
			mockMVC.perform(post("/operation.do")
					.param("mode", "createProduct")
					.param("userId", "1")
					.param("firstName", "Administrator")
					.param("role", "1")
					.param("func", "1,2,3,")
					.param("name", (String)null)
					.param("type", product.getType())
					.param("price", product.getPrice().toString())
					.param("brief", product.getBrief()))
				//.andDo(MockMvcResultHandlers.print())
				.andExpect(status().isOk())
				.andExpect(model().attribute("userId", "1"))
				.andExpect(model().attribute("firstName", "Administrator"))
				.andExpect(model().attribute("func", "1,2,3,"))
				.andExpect(model().attribute("proList", productFailed));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Test create product no type.
	 * 
	 * @author  Wenbo Wang
	 * @version 1.0, April 2016
	 */
	@Test
	public final void testCreateProductNoType() {
		try {
			doCallRealMethod().when(operationService).displayProducts();
			doCallRealMethod().when(operationService).createProduct(any());
			when(productMapper.selectByExample(any())).thenReturn(proListFailed);
			when(productMapper.insert(any())).thenReturn(1);
			
			mockMVC.perform(post("/operation.do")
					.param("mode", "createProduct")
					.param("userId", "1")
					.param("firstName", "Administrator")
					.param("role", "1")
					.param("func", "1,2,3,")
					.param("name", product.getName())
					.param("type", (String)null)
					.param("price", product.getPrice().toString())
					.param("brief", product.getBrief()))
				//.andDo(MockMvcResultHandlers.print())
				.andExpect(status().isOk())
				.andExpect(model().attribute("userId", "1"))
				.andExpect(model().attribute("firstName", "Administrator"))
				.andExpect(model().attribute("func", "1,2,3,"))
				.andExpect(model().attribute("proList", productFailed));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Test create product no price.
	 * 
	 * @author  Wenbo Wang
	 * @version 1.0, April 2016
	 */
	@Test
	public final void testCreateProductNoPrice() {
		try {
			doCallRealMethod().when(operationService).displayProducts();
			doCallRealMethod().when(operationService).createProduct(any());
			when(productMapper.selectByExample(any())).thenReturn(proListFailed);
			when(productMapper.insert(any())).thenReturn(1);
			
			mockMVC.perform(post("/operation.do")
					.param("mode", "createProduct")
					.param("userId", "1")
					.param("firstName", "Administrator")
					.param("role", "1")
					.param("func", "1,2,3,")
					.param("name", product.getName())
					.param("type", product.getType())
					.param("price", (String)null)
					.param("brief", product.getBrief()))
				//.andDo(MockMvcResultHandlers.print())
				.andExpect(status().isOk())
				.andExpect(model().size(0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Test display orders success.
	 * 
	 * @author  Wenbo Wang
	 * @version 1.0, April 2016
	 */
	@Test
	public final void testDisplayOrdersSuccess() {
		try {
			doCallRealMethod().when(operationService).displayOrders();
			when(orderMapper.selectByExample(any())).thenReturn(orderList);
			
			mockMVC.perform(post("/operation.do")
					.param("mode", "displayOrders")
					.param("userId", "1")
					.param("firstName", "Administrator")
					.param("role", "1")
					.param("func", "1,2,3,"))
				//.andDo(MockMvcResultHandlers.print())
				.andExpect(status().isOk())
				.andExpect(model().attribute("userId", "1"))
				.andExpect(model().attribute("firstName", "Administrator"))
				.andExpect(model().attribute("func", "1,2,3,"))
				.andExpect(model().attribute("orderList", containsString("\"orderId\":5")))
				.andExpect(model().attribute("orderList", containsString("\"phone\":\"(305)474-2378\"")))
				.andExpect(model().attribute("orderList", containsString("\"userId\":3")))
				.andExpect(model().attribute("orderList", containsString("\"status\":\"processing\"")))
				.andExpect(model().attribute("orderList", containsString("\"shipAddress\":\"123 NW 14th St, Miami FL 33100\"")));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Test display orders no order.
	 * 
	 * @author  Wenbo Wang
	 * @version 1.0, April 2016
	 */
	@Test
	public final void testDisplayOrdersNoOrder() {
		try {
			doCallRealMethod().when(operationService).displayOrders();
			when(orderMapper.selectByExample(any())).thenReturn(new ArrayList<Order>());
			
			mockMVC.perform(post("/operation.do")
					.param("mode", "displayOrders")
					.param("userId", "1")
					.param("firstName", "Administrator")
					.param("role", "1")
					.param("func", "1,2,3,"))
				//.andDo(print())
				.andExpect(status().isOk())
				.andExpect(model().attribute("userId", "1"))
				.andExpect(model().attribute("firstName", "Administrator"))
				.andExpect(model().attribute("func", "1,2,3,"))
				.andExpect(model().attribute("orderList", "[]"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

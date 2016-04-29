package unit.testcase.service;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import edu.fiu.hmts.dao.hmts_repos.OrderMapper;
import edu.fiu.hmts.dao.hmts_repos.ProductMapper;
import edu.fiu.hmts.domain.hmts_repos.Order;
import edu.fiu.hmts.domain.hmts_repos.Product;
import edu.fiu.hmts.domain.hmts_repos.ProductExample;
import edu.fiu.hmts.service.impl.OperationService;

/**
 * The Class OperationServiceTest.
 * 
 * @author  Wenbo Wang
 * @version 1.0, April 2016
 */
@RunWith(MockitoJUnitRunner.class)
public class OperationServiceTest {
	
	/** The opera service. */
	@InjectMocks
	OperationService operaService;
	
	/** The product mapper. */
	@Mock
	ProductMapper productMapper;
	
	/** The order mapper. */
	@Mock
	OrderMapper orderMapper;

	/** The pro list display. */
	List<Product> proListDisplay = new ArrayList<>();
	
	/** The order list. */
	List<Order> orderList = new ArrayList<>();
	
	/** The product. */
	Product product = new Product();
	
	/**
	 * Sets the up.
	 *
	 * @throws Exception
	 *             the exception
	 * 
	 * @author  Wenbo Wang
	 * @version 1.0, April 2016
	 */
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		
		Product product1 = new Product();
		product1.setName("Turkey breast");
		product1.setType("Dish");
		product1.setPrice(8.99);
		proListDisplay.add(product1);
		
		Product product2 = new Product();
		product2.setName("Vegetables");
		product2.setType("Side");
		product2.setPrice(2.99);
		proListDisplay.add(product2);
		
		Product product3 = new Product();
		product3.setName("Lemonade");
		product3.setType("Drink");
		product3.setPrice(1.99);
		proListDisplay.add(product3);
		
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
	 * Test display products.
	 * 
	 * @author  Wenbo Wang
	 * @version 1.0, April 2016
	 */
	@Test
	public void testDisplayProducts() {
		Mockito.when(productMapper.selectByExample(Mockito.any(ProductExample.class))).thenReturn(proListDisplay);
		List<Product> proList = operaService.displayProducts();
		
		assertEquals(3, proList.size());
		
		assertEquals("Turkey breast", proList.get(0).getName());
		assertEquals("Dish", proList.get(0).getType());
		assertEquals(8.99, proList.get(0).getPrice(), 0.01);
		
		assertEquals("Vegetables", proList.get(1).getName());
		assertEquals("Side", proList.get(1).getType());
		assertEquals(2.99, proList.get(1).getPrice(), 0.01);
		
		assertEquals("Lemonade", proList.get(2).getName());
		assertEquals("Drink", proList.get(2).getType());
		assertEquals(1.99, proList.get(2).getPrice(), 0.01);
	}
	
	/**
	 * Test display products no product.
	 * 
	 * @author  Wenbo Wang
	 * @version 1.0, April 2016
	 */
	@Test
	public void testDisplayProductsNoProduct() {
		Mockito.when(productMapper.selectByExample(Mockito.any(ProductExample.class))).thenReturn(new ArrayList<Product>());
		List<Product> proList = operaService.displayProducts();
		assertEquals(0, proList.size());
	}

	/**
	 * Test create product success.
	 * 
	 * @author  Wenbo Wang
	 * @version 1.0, April 2016
	 */
	@Test
	public void testCreateProductSuccess() {
		int num = 0;
		if (!"".equals(product.getName()) && !"".equals(product.getType()) 
				&& product.getPrice() != null)
			num = 1;
		Mockito.when(productMapper.insert(Mockito.any(Product.class))).thenReturn(num);
		int res = operaService.createProduct(product);
		assertEquals(1, res);
	}
	
	/**
	 * Test create product no name.
	 * 
	 * @author  Wenbo Wang
	 * @version 1.0, April 2016
	 */
	@Test
	public void testCreateProductNoName() {
		int num = 0;
		product.setName("");
		if (!"".equals(product.getName()) && !"".equals(product.getType()) 
				&& product.getPrice() != null)
			num = 1;
		Mockito.when(productMapper.insert(Mockito.any(Product.class))).thenReturn(num);
		int res = operaService.createProduct(product);
		assertEquals(0, res);
	}
	
	/**
	 * Test create product no type.
	 * 
	 * @author  Wenbo Wang
	 * @version 1.0, April 2016
	 */
	@Test
	public void testCreateProductNoType() {
		int num = 0;
		product.setType("");
		if (!"".equals(product.getName()) && !"".equals(product.getType()) 
				&& product.getPrice() != null)
			num = 1;
		Mockito.when(productMapper.insert(Mockito.any(Product.class))).thenReturn(num);
		int res = operaService.createProduct(product);
		assertEquals(0, res);
	}
	
	/**
	 * Test create product no price.
	 * 
	 * @author  Wenbo Wang
	 * @version 1.0, April 2016
	 */
	@Test
	public void testCreateProductNoPrice() {
		int num = 0;
		product.setPrice(null);
		if (!"".equals(product.getName()) && !"".equals(product.getType()) 
				&& product.getPrice() != null)
			num = 1;
		Mockito.when(productMapper.insert(Mockito.any(Product.class))).thenReturn(num);
		int res = operaService.createProduct(product);
		assertEquals(0, res);
	}
	
	/**
	 * Test display orders success.
	 * 
	 * @author  Wenbo Wang
	 * @version 1.0, April 2016
	 */
	@Test
	public final void testDisplayOrdersSuccess() {
		Mockito.when(orderMapper.selectByExample(Mockito.any())).thenReturn(orderList);
		List<Order> list = operaService.displayOrders();
		assertEquals(1, list.size());
		assertEquals("(305)474-2378", list.get(0).getPhone());
		assertEquals("123 NW 14th St, Miami FL 33100", list.get(0).getShipAddress());
		assertEquals("processing", list.get(0).getStatus());
	}
	
	/**
	 * Test display orders no order.
	 * 
	 * @author  Wenbo Wang
	 * @version 1.0, April 2016
	 */
	@Test
	public final void testDisplayOrdersNoOrder() {
		Mockito.when(orderMapper.selectByExample(Mockito.any())).thenReturn(new ArrayList<Order>());
		List<Order> list = operaService.displayOrders();
		assertEquals(0, list.size());
	}
}

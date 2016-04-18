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
import org.mockito.runners.MockitoJUnitRunner;

import edu.fiu.hmts.dao.hmts_repos.ProductMapper;
import edu.fiu.hmts.domain.hmts_repos.Product;
import edu.fiu.hmts.domain.hmts_repos.ProductExample;
import edu.fiu.hmts.service.impl.OperationService;

@RunWith(MockitoJUnitRunner.class)
public class OperationServiceTest {
	
	@InjectMocks
	OperationService operaService;
	
	@Mock
	ProductMapper productMapper;

	List<Product> proListDisplay = new ArrayList<>();
	
	Product product = new Product();
	
	@Before
	public void setUp() throws Exception {
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
	}

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
	
	@Test
	public void testCreateProductException() {
		Mockito.when(productMapper.insert(Mockito.any(Product.class))).thenReturn(-1);
		int res = operaService.createProduct(null);
		assertEquals(-1, res);
	}
}

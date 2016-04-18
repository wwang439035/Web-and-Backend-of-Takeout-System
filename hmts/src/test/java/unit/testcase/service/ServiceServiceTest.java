package unit.testcase.service;

import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import edu.fiu.hmts.dao.hmts_repos.*;
import edu.fiu.hmts.domain.hmts_repos.*;
import edu.fiu.hmts.service.impl.ServiceService;

@RunWith(MockitoJUnitRunner.class)
public class ServiceServiceTest {

	@InjectMocks
	ServiceService servService;
	
	@Mock
	SecQuestionMapper secQuestionMapper;
	
	@Mock
	ProductMapper productMapper;
	
	@Mock
	SelProductMapper selProductMapper;
	
	@Mock
	OrderMapper orderMapper;
	
	@Mock
	OrderProductMapper orderProductMapper;
	
	@Mock
	PaymentMapper paymentMapper;
	
	@Mock
	CardMapper cardMapper;
	
	List<Product> products = new ArrayList<>();
	
	List<SelProduct> selProducts = new ArrayList<>();
	
	SelProduct selProduct = new SelProduct();
	
	Order order = new Order();
	
	Payment payment = new Payment();
	
	List<OrderProduct> ordProducts = new ArrayList<>();
	
	Card card = new Card();
	
	List<SecQuestion> questions = new ArrayList<>();
	
	@Before
	public void setUp() throws Exception {
		Product product1 = new Product();
		product1.setName("Turkey breast");
		product1.setType("Dish");
		product1.setPrice(8.99);
		products.add(product1);
		
		Product product2 = new Product();
		product2.setName("Vegetables");
		product2.setType("Side");
		product2.setPrice(2.99);
		products.add(product2);
		
		Product product3 = new Product();
		product3.setName("Lemonade");
		product3.setType("Drink");
		product3.setPrice(1.99);
		products.add(product3);
		
		SelProduct selProduct1 = new SelProduct();
		selProduct1.setProductId(1L);
		selProduct1.setQuantity(3);
		selProduct1.setUserId(3L);
		selProducts.add(selProduct1);
		
		SelProduct selProduct2 = new SelProduct();
		selProduct2.setProductId(2L);
		selProduct2.setQuantity(1);
		selProduct2.setUserId(3L);
		selProducts.add(selProduct2);
		
		selProduct.setProductId(1L);
		selProduct.setQuantity(5);
		selProduct.setUserId(2L);
		
		order.setPhone("(305)474-2378");
		order.setShipAddress("123 NW 14th St, Miami FL 33100");
		order.setStatus("processing");
		order.setOrderId(5L);
		order.setUserId(3L);
		
		payment.setAmount(8.99);
		payment.setMethod("0");
		payment.setOrderId(5L);
		payment.setPaymentId(6L);
		
		card.setCardNum("37283937283737283");
		card.setCardOwner("David John");
		DateFormat dateFormat = new SimpleDateFormat("MM/DD/YYYY");
		card.setExpDate(dateFormat.parse("05/01/2020"));
		card.setSecCode("876");
		card.setBillAddress("123 NW 14th St, Miami FL 33100");
		
		OrderProduct orderProduct = new OrderProduct();
		orderProduct.setAmount(8.99);
		orderProduct.setName("Pizza");
		orderProduct.setPrice(8.99);
		orderProduct.setQuantity(1);
		orderProduct.setType("Side");
		ordProducts.add(orderProduct);
		
		SecQuestion secQuestion = new SecQuestion();
		secQuestion.setSecQuestionId(1);
		secQuestion.setContent("What's your favorite sport?");
		questions.add(secQuestion);
	}

	@Test
	public final void testDisplayMenu() {
		Mockito.when(productMapper.selectByExample(Mockito.any())).thenReturn(products);
		List<Product> proList = servService.displayMenu();
		
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
	public final void testSelectProductSuccess() {
		Mockito.when(selProductMapper.insert(Mockito.any())).thenReturn(1);
		int res = servService.selectProduct(selProduct);
		assertEquals(1, res);
	}
	
	@Test
	public final void testSelectProductNoProId() {
		selProduct.setProductId(null);
		Mockito.when(selProductMapper.insert(Mockito.any())).thenReturn(0);
		int res = servService.selectProduct(selProduct);
		assertEquals(0, res);
	}
	
	@Test
	public final void testSelectProductNoQty() {
		selProduct.setProductId(1L);
		selProduct.setQuantity(null);
		Mockito.when(selProductMapper.insert(Mockito.any())).thenReturn(0);
		int res = servService.selectProduct(selProduct);
		assertEquals(0, res);
	}
	
	@Test
	public final void testSelectProductNoUserId() {
		selProduct.setQuantity(5);
		selProduct.setUserId(null);
		Mockito.when(selProductMapper.insert(Mockito.any())).thenReturn(0);
		int res = servService.selectProduct(selProduct);
		assertEquals(0, res);
	}

	@Test
	public final void testRemoveProductSuccess() {
		Mockito.when(selProductMapper.deleteByExample(Mockito.any())).thenReturn(1);
		int res = servService.removeProduct(3, 2);
		
		assertEquals(1, res);
	}
	
	@Test
	public final void testRemoveProductValidUserId() {
		Mockito.when(selProductMapper.deleteByExample(Mockito.any())).thenReturn(0);
		int res = servService.removeProduct(2, 2);
		
		assertEquals(0, res);
	}
	
	@Test
	public final void testRemoveProductInvalidUserId() {
		Mockito.when(selProductMapper.deleteByExample(Mockito.any())).thenReturn(0);
		int res = servService.removeProduct(-1, 2);
		
		assertEquals(0, res);
	}
	
	@Test
	public final void testRemoveProductValidProId() {
		Mockito.when(selProductMapper.deleteByExample(Mockito.any())).thenReturn(0);
		int res = servService.removeProduct(3, 3);
		
		assertEquals(0, res);
	}

	@Test
	public final void testDisplayCartSuccess() {
		Mockito.when(selProductMapper.selectByExample(Mockito.any())).thenReturn(selProducts);
		List<SelProduct> selProList = servService.displayCart(3L);
		
		assertEquals(2, selProList.size());
		
		assertEquals(1L, selProList.get(0).getProductId(), 1);
		assertEquals(3, selProList.get(0).getQuantity(), 1);
		assertEquals(3L, selProList.get(0).getUserId(), 1);
		
		assertEquals(2L, selProList.get(1).getProductId(), 1);
		assertEquals(1, selProList.get(1).getQuantity(), 1);
		assertEquals(3L, selProList.get(1).getUserId(), 1);
	}
	
	@Test
	public final void testDisplayCartValidUserId() {
		List<SelProduct> list = new ArrayList<>();
		Mockito.when(selProductMapper.selectByExample(Mockito.any())).thenReturn(list);
		List<SelProduct> selProList = servService.displayCart(2L);
		
		assertEquals(0, selProList.size());
	}
	
	@Test
	public final void testDisplayCartInvalidUserId() {
		List<SelProduct> list = new ArrayList<>();
		Mockito.when(selProductMapper.selectByExample(Mockito.any())).thenReturn(list);
		List<SelProduct> selProList = servService.displayCart(-1L);
		
		assertEquals(0, selProList.size());
	}

	@Test
	public final void testPlaceOrderbyCashSuccess() {
		Mockito.when(orderMapper.insert(Mockito.any())).thenReturn(1);
		Mockito.when(orderProductMapper.insert(Mockito.any())).thenReturn(1);
		Mockito.when(paymentMapper.insertSelective(Mockito.any())).thenReturn(1);
		int res = servService.placeOrder(order, payment, ordProducts, card);
		assertEquals(1, res);
	}
	
	@Test
	public final void testPlaceOrderbyCashInvalidOrder() {
		order.setUserId(null);
		Mockito.when(orderMapper.insert(Mockito.any())).thenReturn(0);
		Mockito.when(orderProductMapper.insert(Mockito.any())).thenReturn(1);
		Mockito.when(paymentMapper.insertSelective(Mockito.any())).thenReturn(1);
		int res = servService.placeOrder(order, payment, ordProducts, card);
		assertEquals(0, res);
	}
	
	@Test
	public final void testPlaceOrderbyCashNullOrder() {
		Mockito.when(orderMapper.insert(Mockito.any())).thenReturn(1);
		Mockito.when(orderProductMapper.insert(Mockito.any())).thenReturn(1);
		Mockito.when(paymentMapper.insertSelective(Mockito.any())).thenReturn(1);
		int res = servService.placeOrder(null, payment, ordProducts, card);
		assertEquals(0, res);
	}
	
	@Test
	public final void testPlaceOrderbyCashNoOrdProduct() {
		order.setUserId(3L);
		order.setOrderId(5L);
		List<OrderProduct> ordProList = new ArrayList<>();
		Mockito.when(orderMapper.insert(Mockito.any())).thenReturn(1);
		Mockito.when(orderProductMapper.insert(Mockito.any())).thenReturn(1);
		Mockito.when(paymentMapper.insertSelective(Mockito.any())).thenReturn(1);
		int res = servService.placeOrder(order, payment, ordProList, card);
		assertEquals(0, res);
	}
	
	@Test
	public final void testPlaceOrderbyCashInvalidOrdProduct() {
		ordProducts.get(0).setName(null);
		Mockito.when(orderMapper.insert(Mockito.any())).thenReturn(1);
		Mockito.when(orderProductMapper.insert(Mockito.any())).thenReturn(0);
		Mockito.when(paymentMapper.insertSelective(Mockito.any())).thenReturn(1);
		int res = servService.placeOrder(order, payment, ordProducts, card);
		assertEquals(0, res);
	}
	
	@Test
	public final void testPlaceOrderbyCashInvalidPayment() {
		ordProducts.get(0).setName("Pizza");
		payment.setMethod(null);
		Mockito.when(orderMapper.insert(Mockito.any())).thenReturn(1);
		Mockito.when(orderProductMapper.insert(Mockito.any())).thenReturn(1);
		Mockito.when(paymentMapper.insertSelective(Mockito.any())).thenReturn(0);
		int res = servService.placeOrder(order, payment, ordProducts, card);
		assertEquals(0, res);
	}
	
	@Test
	public final void testPlaceOrderbyCardSuccess() {
		payment.setMethod("1");
		Mockito.when(orderMapper.insert(Mockito.any())).thenReturn(1);
		Mockito.when(orderProductMapper.insert(Mockito.any())).thenReturn(1);
		Mockito.when(paymentMapper.insertSelective(Mockito.any())).thenReturn(1);
		Mockito.when(cardMapper.insert(Mockito.any())).thenReturn(1);
		int res = servService.placeOrder(order, payment, ordProducts, card);
		assertEquals(1, res);
	}
	
	@Test
	public final void testPlaceOrderbyCardInvalidCard() {
		payment.setMethod("1");
		card.setCardNum(null);
		Mockito.when(orderMapper.insert(Mockito.any())).thenReturn(1);
		Mockito.when(orderProductMapper.insert(Mockito.any())).thenReturn(1);
		Mockito.when(paymentMapper.insertSelective(Mockito.any())).thenReturn(1);
		Mockito.when(cardMapper.insert(Mockito.any())).thenReturn(0);
		int res = servService.placeOrder(order, payment, ordProducts, card);
		assertEquals(0, res);
	}

	@Test
	public final void testGetQuestionsSuccess() {
		Mockito.when(secQuestionMapper.selectByExample(Mockito.any())).thenReturn(questions);
		List<SecQuestion> secQuesList = servService.getQuestions();
		
		assertEquals(1, secQuesList.size());
		assertEquals(1, secQuesList.get(0).getSecQuestionId(), 1);
		assertEquals("What's your favorite sport?", secQuesList.get(0).getContent());
	}
	
	@Test
	public final void testGetQuestionsNoQuestion() {
		Mockito.when(secQuestionMapper.selectByExample(Mockito.any())).thenReturn(new ArrayList<SecQuestion>());
		List<SecQuestion> secQuesList = servService.getQuestions();
		
		assertEquals(0, secQuesList.size());
	}
}

/**
 * 
 */
package edu.fiu.hmts.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.fiu.hmts.dao.hmts_repos.CardMapper;
import edu.fiu.hmts.dao.hmts_repos.OrderMapper;
import edu.fiu.hmts.dao.hmts_repos.OrderProductMapper;
import edu.fiu.hmts.dao.hmts_repos.PaymentMapper;
import edu.fiu.hmts.dao.hmts_repos.ProductMapper;
import edu.fiu.hmts.dao.hmts_repos.SecQuestionMapper;
import edu.fiu.hmts.dao.hmts_repos.SelProductMapper;
import edu.fiu.hmts.domain.hmts_repos.Card;
import edu.fiu.hmts.domain.hmts_repos.Order;
import edu.fiu.hmts.domain.hmts_repos.OrderProduct;
import edu.fiu.hmts.domain.hmts_repos.Payment;
import edu.fiu.hmts.domain.hmts_repos.Product;
import edu.fiu.hmts.domain.hmts_repos.ProductExample;
import edu.fiu.hmts.domain.hmts_repos.SecQuestion;
import edu.fiu.hmts.domain.hmts_repos.SecQuestionExample;
import edu.fiu.hmts.domain.hmts_repos.SelProduct;
import edu.fiu.hmts.domain.hmts_repos.SelProductExample;
import edu.fiu.hmts.domain.hmts_repos.SelProductExample.Criteria;
import edu.fiu.hmts.service.IServiceService;

/**
 * The Class ServiceService.
 */
@Service
public class ServiceService implements IServiceService {
	
	@Autowired
	private SecQuestionMapper secQuestionMapper;
	
	@Autowired
	private ProductMapper productMapper;
	
	@Autowired
	private SelProductMapper selProductMapper;
	
	@Autowired
	private OrderMapper orderMapper;
	
	@Autowired
	private OrderProductMapper orderProductMapper;
	
	@Autowired
	private PaymentMapper paymentMapper;
	
	@Autowired
	private CardMapper cardMapper;

	protected final Log logger = LogFactory.getLog(getClass());
	
	/**
	 * Display the menu.
	 *
	 * @return the list
	 */
	@Override
	public List<Product> displayMenu() {
		try {
			ProductExample productExample = new ProductExample();
			productExample.setOrderByClause("type desc");
			List<Product> products = productMapper.selectByExample(productExample);
			return products;
		}
		catch(Exception e){
			logger.fatal(e.getMessage());
			return new ArrayList<Product>();
		}
	}

	/**
	 * Select product.
	 *
	 * @param userid
	 *            the userid
	 * @param product
	 *            the product
	 */
	@Override
	public int selectProduct(SelProduct product) {
		try {
			int res = selProductMapper.insert(product);
			return res;
		}
		catch(Exception e){
			logger.fatal(e.getMessage());
			return -1;
		}
	}

	/**
	 * Removes the product.
	 *
	 * @param userid
	 *            the userid
	 * @param productid
	 *            the productid
	 */
	@Override
	public int removeProduct(long userid, long productid) {
		try {
			SelProductExample selProductExample = new SelProductExample();
			Criteria criteria = selProductExample.createCriteria();
			criteria.andProductIdEqualTo(productid);
			criteria.andUserIdEqualTo(userid);
			int res = selProductMapper.deleteByExample(selProductExample);
			return res;
		}
		catch(Exception e){
			logger.fatal(e.getMessage());
			return -1;
		}
	}

	/**
	 * Display the cart.
	 *
	 * @param userid
	 *            the userid
	 * @return the list
	 */
	@Override
	public List<SelProduct> displayCart(long userid) {
		try {
			SelProductExample selProductExample = new SelProductExample();
			Criteria criteria = selProductExample.createCriteria();
			criteria.andUserIdEqualTo(userid);
			List<SelProduct> selProducts = selProductMapper.selectByExample(selProductExample);
			return selProducts;
		}
		catch(Exception e){
			logger.fatal(e.getMessage());
			return new ArrayList<SelProduct>();
		}
	}

	/**
	 * Place order.
	 *
	 * @param order
	 *            the order
	 * @param payment
	 *            the payment
	 * @param orderProducts
	 *            the order products
	 * @param card
	 *            the card
	 * @return the int
	 */
	@Override
	public int placeOrder(Order order, Payment payment, List<OrderProduct> orderProducts, Card card) {
		try {
			long orderId = -1;
			long paymentId = -1;
			int res = -1;
			
			if (orderProducts.size() > 0){
				res = orderMapper.insert(order);
				if (res == -1) return res;
				orderId = order.getOrderId();
			}
			
			for (OrderProduct orderProduct : orderProducts) {
				orderProduct.setOrderId(orderId);
				orderProductMapper.insert(orderProduct);
				if (res == -1) return res;
			}
			
			payment.setOrderId(orderId);
			payment.setPaymentId(0L);
			paymentMapper.insertSelective(payment);
			if (res == -1) return res;
			paymentId = payment.getPaymentId();
			
			if ("1".equals(payment.getMethod())){
				card.setPaymentId(paymentId);
				cardMapper.insert(card);
				if (res == -1) return res;
			}
				
			return res;
		}
		catch(Exception e){
			logger.fatal(e.getMessage());
			return -1;
		}
	}

	@Override
	public List<SecQuestion> getQuestions() {
		try {
			List<SecQuestion> questions = secQuestionMapper.selectByExample(new SecQuestionExample());
			return questions;
		}
		catch(Exception e){
			logger.fatal(e.getMessage());
			return new ArrayList<SecQuestion>();
		}
	}

}

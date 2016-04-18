/**
 * 
 */
package edu.fiu.hmts.service.impl;

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
	
	/** The sec question mapper. */
	@Autowired
	private SecQuestionMapper secQuestionMapper;
	
	/** The product mapper. */
	@Autowired
	private ProductMapper productMapper;
	
	/** The sel product mapper. */
	@Autowired
	private SelProductMapper selProductMapper;
	
	/** The order mapper. */
	@Autowired
	private OrderMapper orderMapper;
	
	/** The order product mapper. */
	@Autowired
	private OrderProductMapper orderProductMapper;
	
	/** The payment mapper. */
	@Autowired
	private PaymentMapper paymentMapper;
	
	/** The card mapper. */
	@Autowired
	private CardMapper cardMapper;

	/** The logger. */
	protected final Log logger = LogFactory.getLog(getClass());
	
	/**
	 * Display the menu.
	 *
	 * @return the list
	 */
	@Override
	public List<Product> displayMenu() {
		ProductExample productExample = new ProductExample();
		productExample.setOrderByClause("type desc");
		List<Product> products = productMapper.selectByExample(productExample);
		return products;
	}

	/**
	 * Query product.
	 *
	 * @param product
	 *            the product
	 * @return the int
	 */
	@Override
	public int selectProduct(SelProduct product) {
		int res = selProductMapper.insert(product);
		return res;
	}

	/**
	 * Remove product.
	 *
	 * @param userid
	 *            the userid
	 * @param productid
	 *            the productid
	 * @return the int
	 */
	@Override
	public int removeProduct(long userid, long productid) {
		SelProductExample selProductExample = new SelProductExample();
		Criteria criteria = selProductExample.createCriteria();
		criteria.andProductIdEqualTo(productid);
		criteria.andUserIdEqualTo(userid);
		int res = selProductMapper.deleteByExample(selProductExample);
		return res;
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
		SelProductExample selProductExample = new SelProductExample();
		Criteria criteria = selProductExample.createCriteria();
		criteria.andUserIdEqualTo(userid);
		List<SelProduct> selProducts = selProductMapper.selectByExample(selProductExample);
		return selProducts;
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
			int res = 0;
			
			if (orderProducts.size() > 0){
				res = orderMapper.insert(order);
				if (res == 0) return res;
				orderId = order.getOrderId();
			}else {
				return res;
			}
			
			for (OrderProduct orderProduct : orderProducts) {
				orderProduct.setOrderId(orderId);
				res = orderProductMapper.insert(orderProduct);
				if (res == 0) return res;
			}
			
			payment.setOrderId(orderId);
			res = paymentMapper.insertSelective(payment);
			if (res == 0) return res;
			paymentId = payment.getPaymentId();
			
			if ("1".equals(payment.getMethod())){
				card.setPaymentId(paymentId);
				res = cardMapper.insert(card);
				if (res == 0) return res;
			}
				
			return res;
		}
		catch(Exception e){
			logger.fatal(e.getMessage());
			return 0;
		}
	}

	/**
	 * Gets the questions.
	 *
	 * @return the questions
	 */
	@Override
	public List<SecQuestion> getQuestions() {
		List<SecQuestion> questions = secQuestionMapper.selectByExample(new SecQuestionExample());
		return questions;
	}

}

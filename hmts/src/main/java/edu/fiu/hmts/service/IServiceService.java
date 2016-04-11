/**
 * 
 */
package edu.fiu.hmts.service;

import java.util.List;

import edu.fiu.hmts.domain.Card;
import edu.fiu.hmts.domain.Order;
import edu.fiu.hmts.domain.OrderProduct;
import edu.fiu.hmts.domain.Payment;
import edu.fiu.hmts.domain.Product;
import edu.fiu.hmts.domain.SecQuestion;
import edu.fiu.hmts.domain.SelProduct;

/**
 * The Interface IServiceService.
 */
public interface IServiceService {

	/**
	 * Display the menu.
	 *
	 * @return the list
	 */
	public List<Product> displayMenu();
	
	/**
	 * Query product.
	 *
	 * @param userid
	 *            the userid
	 * @param product
	 *            the product
	 */
	public int selectProduct(SelProduct product);
	
	/**
	 * Remove product.
	 *
	 * @param userid
	 *            the userid
	 * @param productid
	 *            the productid
	 */
	public int removeProduct(long userid, long productid);
	
	/**
	 * Display the cart.
	 *
	 * @param data
	 *            the userid
	 * @return the list
	 */
	public List<SelProduct> displayCart(long data);
	
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
	public int placeOrder(Order order, Payment payment, List<OrderProduct> orderProducts, Card card);
	
	/**
	 * Gets the questions.
	 *
	 * @return the questions
	 */
	public List<SecQuestion> getQuestions();
}

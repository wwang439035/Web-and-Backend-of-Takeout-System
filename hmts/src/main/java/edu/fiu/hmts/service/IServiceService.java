/**
 * 
 */
package edu.fiu.hmts.service;

import java.util.List;

import edu.fiu.hmts.domain.Product;
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
	public void selectProduct(int userid, Product product);
	
	/**
	 * Remove product.
	 *
	 * @param userid
	 *            the userid
	 * @param productid
	 *            the productid
	 */
	public void removeProduct(int userid, int productid);
	
	/**
	 * Display the cart.
	 *
	 * @param userid
	 *            the userid
	 * @return the list
	 */
	public List<SelProduct> displayCart(int userid);
	
	/**
	 * Place order.
	 *
	 * @param userid
	 *            the userid
	 */
	public void placeOrder(int userid);
}

/**
 * 
 */
package edu.fiu.hmts.service;

import java.util.List;

import edu.fiu.hmts.domain.hmts_repos.Order;
import edu.fiu.hmts.domain.hmts_repos.Product;

/**
 * The Interface IOperationService.
 */
public interface IOperationService {

	/**
	 * Display the products.
	 *
	 * @return the list
	 */
	public List<Product> displayProducts();
	
	/**
	 * Creates the product.
	 *
	 * @param product
	 *            the product
	 * @return the int
	 */
	public int createProduct(Product product);
	
	/**
	 * Display the orders.
	 *
	 * @return the list
	 */
	public List<Order> displayOrders();
}

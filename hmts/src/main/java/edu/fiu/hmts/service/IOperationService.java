/**
 * 
 */
package edu.fiu.hmts.service;

import java.util.List;
import edu.fiu.hmts.domain.Product;

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
	 */
	public void createProduct(Product product);
}

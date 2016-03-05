/**
 * 
 */
package edu.fiu.hmts.service;

import java.util.List;
import edu.fiu.hmts.domain.Product;

/**
 * @author Wenbo
 *
 */
public interface IOperationService {

	public List<Product> visualizeProducts();
	
	public boolean addProduct(Product product);
}

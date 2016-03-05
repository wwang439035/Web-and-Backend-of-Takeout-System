/**
 * 
 */
package edu.fiu.hmts.service;

import java.util.List;

import edu.fiu.hmts.domain.Product;
import edu.fiu.hmts.domain.SelProduct;

/**
 * @author Wenbo
 *
 */
public interface IServiceService {

	public List<Product> displayMenu();
	
	public void selectProduct(String userid, Product product);
	
	public void removeProduct(String userid);
	
	public List<SelProduct> displayCart(String userid);
	
	public void placeOrder(String userid);
}

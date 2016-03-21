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
	
	public void selectProduct(int userid, Product product);
	
	public void removeProduct(int userid, int productid);
	
	public List<SelProduct> displayCart(int userid);
	
	public void placeOrder(int userid);
}

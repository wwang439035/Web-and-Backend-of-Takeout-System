/**
 * 
 */
package edu.fiu.hmts.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.fiu.hmts.domain.Product;
import edu.fiu.hmts.domain.SelProduct;
import edu.fiu.hmts.service.IServiceService;

/**
 * The Class ServiceService.
 */
@Service
public class ServiceService implements IServiceService {

	/**
	 * Display the menu.
	 *
	 * @return the list
	 */
	@Override
	public List<Product> displayMenu() {
		// TODO Auto-generated method stub
		return null;
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
	public void selectProduct(int userid, Product product) {
		// TODO Auto-generated method stub
		
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
	public void removeProduct(int userid, int productid) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Display the cart.
	 *
	 * @param userid
	 *            the userid
	 * @return the list
	 */
	@Override
	public List<SelProduct> displayCart(int userid) {
		return null;
		// TODO Auto-generated method stub
		
	}

	/**
	 * Place order.
	 *
	 * @param userid
	 *            the userid
	 */
	@Override
	public void placeOrder(int userid) {
		// TODO Auto-generated method stub
		
	}

}

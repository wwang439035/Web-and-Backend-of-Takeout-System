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
 * @author Wenbo
 *
 */
@Service
public class ServiceService implements IServiceService {

	@Override
	public List<Product> displayMenu() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void selectProduct(String userid, Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeProduct(String userid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<SelProduct> displayCart(String userid) {
		return null;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void placeOrder(String userid) {
		// TODO Auto-generated method stub
		
	}

}

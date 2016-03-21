/**
 * 
 */
package edu.fiu.hmts.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.fiu.hmts.dao.ProductMapper;
import edu.fiu.hmts.domain.Product;
import edu.fiu.hmts.service.IOperationService;


/**
 * The Class OperationService.
 */
@Service
public class OperationService implements IOperationService {

	private ProductMapper productMapper;
	
	
	/**
	 * Display the products.
	 *
	 * @return the list
	 */
	@Override
	public List<Product> displayProducts() {
		List<Product> products = productMapper.selectByExample(null);
		return products;
	}

	/**
	 * Creates the product.
	 *
	 * @param product
	 *            the product
	 */
	@Override
	public void createProduct(Product product) {
		// TODO Auto-generated method stub
	}

}

/**
 * 
 */
package edu.fiu.hmts.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.fiu.hmts.dao.ProductMapper;
import edu.fiu.hmts.domain.Product;
import edu.fiu.hmts.domain.ProductExample;
import edu.fiu.hmts.service.IOperationService;


/**
 * The Class OperationService.
 */
@Service
public class OperationService implements IOperationService {

	@Autowired
	private ProductMapper productMapper;
	
	
	/**
	 * Display the products.
	 *
	 * @return the list
	 */
	@Override
	public List<Product> displayProducts() {
		List<Product> products = productMapper.selectByExample(new ProductExample());
		return products;
	}

	/**
	 * Creates the product.
	 *
	 * @param product
	 *            the product
	 */
	@Override
	public int createProduct(Product product) {
		int res = productMapper.insert(product);
		return res;
	}

}

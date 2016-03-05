/**
 * 
 */
package edu.fiu.hmts.service.impl;

import java.util.List;

import edu.fiu.hmts.dao.ProductMapper;
import edu.fiu.hmts.domain.Product;
import edu.fiu.hmts.service.IOperationService;

/**
 * @author Wenbo
 *
 */
public class OperationService implements IOperationService {

	private ProductMapper productMapper;
	
	/* (non-Javadoc)
	 * @see edu.fiu.hmts.service.IOperationService#visualizeProducts()
	 */
	@Override
	public List<Product> visualizeProducts() {
		List<Product> products = productMapper.selectByExample(null);
		return products;
	}

	/* (non-Javadoc)
	 * @see edu.fiu.hmts.service.IOperationService#addProduct(edu.fiu.hmts.domain.Product)
	 */
	@Override
	public boolean addProduct(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

}

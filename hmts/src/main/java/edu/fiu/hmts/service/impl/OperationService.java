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
 * @author Wenbo
 *
 */
@Service
public class OperationService implements IOperationService {

	private ProductMapper productMapper;
	
	/* (non-Javadoc)
	 * @see edu.fiu.hmts.service.IOperationService#visualizeProducts()
	 */
	@Override
	public List<Product> displayProducts() {
		List<Product> products = productMapper.selectByExample(null);
		return products;
	}

	/* (non-Javadoc)
	 * @see edu.fiu.hmts.service.IOperationService#addProduct(edu.fiu.hmts.domain.Product)
	 */
	@Override
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
	}

}

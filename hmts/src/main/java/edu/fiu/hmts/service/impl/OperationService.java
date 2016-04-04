/**
 * 
 */
package edu.fiu.hmts.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
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
	
	protected final Log Logger = LogFactory.getLog(getClass());
	
	
	/**
	 * Display the products.
	 *
	 * @return the list
	 */
	@Override
	public List<Product> displayProducts() {
		try {
			List<Product> products = productMapper.selectByExample(new ProductExample());
			return products;
		}
		catch(Exception e){
			Logger.fatal(e.getMessage());
			return new ArrayList<Product>();
		}
	}

	/**
	 * Creates the product.
	 *
	 * @param product
	 *            the product
	 */
	@Override
	public int createProduct(Product product) {
		try{
			int res = productMapper.insert(product);
			return res;
		}
		catch(Exception e){
			Logger.fatal(e.getMessage());
			return -1;
		}
	}

}

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

import edu.fiu.hmts.dao.hmts_repos.OrderMapper;
import edu.fiu.hmts.dao.hmts_repos.ProductMapper;
import edu.fiu.hmts.domain.hmts_repos.Order;
import edu.fiu.hmts.domain.hmts_repos.OrderExample;
import edu.fiu.hmts.domain.hmts_repos.Product;
import edu.fiu.hmts.domain.hmts_repos.ProductExample;
import edu.fiu.hmts.service.IOperationService;


/**
 * The Class OperationService.
 */
@Service
public class OperationService implements IOperationService {

	@Autowired
	private ProductMapper productMapper;
	
	@Autowired
	private OrderMapper orderMapper;
	
	protected final Log logger = LogFactory.getLog(getClass());
	
	
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
			logger.fatal(e.getMessage());
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
			logger.fatal(e.getMessage());
			return -1;
		}
	}

	/**
	 * Display the orders.
	 *
	 * @return the list
	 */
	@Override
	public List<Order> displayOrders() {
		try {
			List<Order> orders = orderMapper.selectByExample(new OrderExample());
			return orders;
		}
		catch(Exception e){
			logger.fatal(e.getMessage());
			return new ArrayList<Order>();
		}
	}

}

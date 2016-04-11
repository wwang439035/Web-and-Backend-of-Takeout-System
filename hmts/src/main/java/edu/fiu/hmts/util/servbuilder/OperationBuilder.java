/**
 * 
 */
package edu.fiu.hmts.util.servbuilder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

import edu.fiu.hmts.service.IOperationService;

/**
 * The Class OperationBuilder.
 */
@Service
@Configurable
public class OperationBuilder implements IBuilder{
	
	/** The opera service. */
	@Autowired
	IOperationService operaService;
	
	/**
	 * Gets the builder.
	 *
	 * @return the builder
	 */
	public IOperationService getBuilder() {
		return operaService;
	}
}

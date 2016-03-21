/**
 * 
 */
package edu.fiu.hmts.util.servbuilder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

import edu.fiu.hmts.service.IServiceService;

/**
 * The Class ServiceBuilder.
 */
@Service
@Configurable
public class ServiceBuilder implements IBuilder{
	@Autowired
	IServiceService servService;
	
	/**
	 * Gets the builder.
	 *
	 * @return the builder
	 */
	public IServiceService getBuilder() {
		return servService;
	}
}

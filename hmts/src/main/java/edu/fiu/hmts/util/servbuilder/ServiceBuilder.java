/**
 * 
 */
package edu.fiu.hmts.util.servbuilder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

import edu.fiu.hmts.service.IServiceService;

/**
 * @author Wenbo
 *
 */
@Service
@Configurable
public class ServiceBuilder implements IBuilder{
	@Autowired
	IServiceService servService;
	
	public IServiceService get() {
		return servService;
	}
}

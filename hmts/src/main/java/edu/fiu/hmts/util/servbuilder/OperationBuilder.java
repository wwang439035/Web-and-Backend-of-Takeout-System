/**
 * 
 */
package edu.fiu.hmts.util.servbuilder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

import edu.fiu.hmts.service.IOperationService;

/**
 * @author Wenbo
 *
 */
@Service
@Configurable
public class OperationBuilder implements IBuilder{
	@Autowired
	IOperationService operaService;
	
	public IOperationService get() {
		return operaService;
	}
}

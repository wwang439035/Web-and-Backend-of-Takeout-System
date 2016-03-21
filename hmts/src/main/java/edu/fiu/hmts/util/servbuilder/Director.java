/**
 * 
 */
package edu.fiu.hmts.util.servbuilder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author Wenbo
 *
 */
@Service
public class Director {
	
	@Autowired
	private static IBuilder userBuilder;
	
	@Autowired
	private static IBuilder operaBuilder;
	
	@Autowired
	private static IBuilder servBuilder;

	@SuppressWarnings("static-access")
	@Autowired
	public Director(UserBuilder userBuilder, OperationBuilder operaBuilder
			, ServiceBuilder servBuilder) {
		this.userBuilder = userBuilder;
		this.operaBuilder = operaBuilder;
		this.servBuilder = servBuilder;
	}
	
	public static Object contruct(String classtype) {
		switch (classtype) {
		case "UserService":
			return userBuilder.get();
		case "OperationService":
			return operaBuilder.get();
		case "ServiceService":
			return servBuilder.get();
		default:
			return null;
		}
	}
}

/**
 * 
 */
package edu.fiu.hmts.util.servbuilder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * The Class Director.
 */
@Service
public class Director {
	
	@Autowired
	private static IBuilder userBuilder;
	
	@Autowired
	private static IBuilder operaBuilder;
	
	@Autowired
	private static IBuilder servBuilder;

	/**
	 * Instantiates a new director.
	 *
	 * @param userBuilder
	 *            the user builder
	 * @param operaBuilder
	 *            the opera builder
	 * @param servBuilder
	 *            the serv builder
	 */
	@SuppressWarnings("static-access")
	@Autowired
	public Director(UserBuilder userBuilder, OperationBuilder operaBuilder
			, ServiceBuilder servBuilder) {
		this.userBuilder = userBuilder;
		this.operaBuilder = operaBuilder;
		this.servBuilder = servBuilder;
	}
	
	/**
	 * Contruct.
	 *
	 * @param classtype
	 *            the classtype
	 * @return the object
	 */
	public static Object contruct(String classtype) {
		switch (classtype) {
		case "UserService":
			return userBuilder.getBuilder();
		case "OperationService":
			return operaBuilder.getBuilder();
		case "ServiceService":
			return servBuilder.getBuilder();
		default:
			return null;
		}
	}
}

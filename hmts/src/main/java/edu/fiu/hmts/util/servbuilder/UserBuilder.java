/**
 * 
 */
package edu.fiu.hmts.util.servbuilder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

import edu.fiu.hmts.service.IUserService;

/**
 * @author Wenbo
 *
 */
@Service
@Configurable
public class UserBuilder implements IBuilder {
	@Autowired
	IUserService userService;

	public IUserService get() {
		return userService;
	}
}

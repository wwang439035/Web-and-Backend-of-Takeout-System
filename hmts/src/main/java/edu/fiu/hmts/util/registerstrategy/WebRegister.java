/**
 * 
 */
package edu.fiu.hmts.util.registerstrategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

import edu.fiu.hmts.dao.UserMapper;
import edu.fiu.hmts.domain.User;

/**
 * The Class WebRegister.
 */
@Service
@Configurable
public class WebRegister implements IRegister {

	@Autowired
	UserMapper userMapper;
	
	/**
	 * Register.
	 *
	 * @param username
	 *            the username
	 * @param password
	 *            the password
	 * @param firstname
	 *            the firstname
	 * @param lastname
	 *            the lastname
	 * @param phone
	 *            the phone
	 * @param role
	 *            the role
	 * @param secid
	 *            the secid
	 * @param answer
	 *            the answer
	 * @return the user
	 */
	@Override
	public User register(String username, String password, String firstname, 
			String lastname, String phone, String role, int secid, String answer) {

		User user = new User();
		user.setUserId(System.currentTimeMillis());
		user.setUsername(username);
		user.setPassword(password);
		user.setFirstName(firstname);
		user.setLastName(lastname);
		user.setRole(role);
		
		int res = userMapper.insert(user);
		if (res > 0)
			return user;
		return new User();
	}
}

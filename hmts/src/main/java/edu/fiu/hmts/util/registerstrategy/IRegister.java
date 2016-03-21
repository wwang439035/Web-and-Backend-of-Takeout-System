/**
 * 
 */
package edu.fiu.hmts.util.registerstrategy;

import edu.fiu.hmts.domain.User;

/**
 * @author Wenbo
 *
 */
public interface IRegister {
	public User register(String username, String password, String firstname, 
			String lastname, String phone, String role, int secid, String answer);
}

/**
 * 
 */
package edu.fiu.hmts.util.registerstrategy;

import edu.fiu.hmts.domain.hmts_repos.User;

/**
 * The Interface IRegister.
 */
public interface IRegister {
	
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
	public User register(String username, String password, String firstname, 
			String lastname, String phone, String role, int secid, String answer);
}

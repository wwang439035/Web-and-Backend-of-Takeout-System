/**
 * 
 */
package edu.fiu.hmts.service;

import java.util.List;

import edu.fiu.hmts.domain.User;

/**
 * The Interface IUserService.
 */
public interface IUserService {

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
	 * @param type
	 *            the type
	 * @return the user
	 */
	public User register(String username, String password, String firstname, 
			String lastname, String phone, String role, int secid, String answer, int type);
	
	/**
	 * Login.
	 *
	 * @param username
	 *            the username
	 * @param password
	 *            the password
	 * @param type
	 *            the type
	 * @return the user
	 */
	public User login(String username, String password, int type);
	
	/**
	 * Logout.
	 *
	 * @param l
	 *            the userid
	 * @return true, if successful
	 */
	public boolean logout(long l);
	
	/**
	 * Display the users.
	 *
	 * @return the list
	 */
	public List<User> displayUsers();
}

/**
 * 
 */
package edu.fiu.hmts.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.fiu.hmts.dao.FunctionRoleMapper;
import edu.fiu.hmts.dao.UserMapper;
import edu.fiu.hmts.domain.FunctionRoleExample;
import edu.fiu.hmts.domain.FunctionRoleKey;
import edu.fiu.hmts.domain.User;
import edu.fiu.hmts.domain.UserExample;
import edu.fiu.hmts.service.IUserService;
import edu.fiu.hmts.util.registerstrategy.IRegister;
import edu.fiu.hmts.util.registerstrategy.MobileRegister;
import edu.fiu.hmts.util.registerstrategy.WebRegister;

/**
 * The Class UserService.
 */
@Service
public class UserService implements IUserService {

	@Autowired 
	private UserMapper userMapper;
	
	@Autowired
	private FunctionRoleMapper functionRoleMapper;
	
	@Autowired
	private IRegister webRegister;
	
	@Autowired
	private IRegister mobileRegister;
	
	
	/**
	 * Instantiates a new user service.
	 *
	 * @param webRegister
	 *            the web register
	 * @param mobileRegister
	 *            the mobile register
	 */
	@Autowired
	public UserService(WebRegister webRegister, MobileRegister mobileRegister) {
		this.webRegister = webRegister;
		this.mobileRegister = mobileRegister;
	}
		
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
	/* (non-Javadoc)
	 * @see edu.fiu.hmts.service.IUserService#register(edu.fiu.hmts.domain.User)
	 */
	@Override
	public User register(String username, String password, String firstname, 
			String lastname, String phone, String role, int secid, String answer, int type) {
		
		User user = new User();
		if (type == 0)
			user = webRegister.register(username, password, firstname, lastname, "", role, -1, "");
		else if (type == 1)
			user = mobileRegister.register(username, password, firstname, lastname, phone, "", secid, answer);
		
		return user;
	}

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
	/* (non-Javadoc)
	 * @see edu.fiu.hmts.service.IUserService#login(edu.fiu.hmts.domain.User, java.lang.String)
	 */
	@Override
	public User login(String username, String password, int type) {
		String func = "";
		UserExample userExample = new UserExample();
		
		if (type == 0){
			userExample.or().andUsernameEqualTo(username).andPasswordEqualTo(password).andRoleEqualTo("1");
			userExample.or().andUsernameEqualTo(username).andPasswordEqualTo(password).andRoleEqualTo("2");
		}
		else if (type == 1) {
			userExample.or().andUsernameEqualTo(username).andPasswordEqualTo(password).andRoleEqualTo("3");
			userExample.or().andUsernameEqualTo(username).andPasswordEqualTo(password).andRoleEqualTo("4");
		}
			
		List<User> userConfirm = userMapper.selectByExample(userExample);
		if (userConfirm.size() == 0){
			User user = new User();
			user.setUserId(-1);
			return user;
		}
		func = rolesControl(userConfirm.get(0));
		userConfirm.get(0).setTag(func);
		
		return userConfirm.get(0);
	}

	/**
	 * Logout.
	 *
	 * @param userid
	 *            the userid
	 * @return true, if successful
	 */
	/* (non-Javadoc)
	 * @see edu.fiu.hmts.service.IUserService#logout(edu.fiu.hmts.domain.User)
	 */
	@Override
	public boolean logout(long userid) {
		// TODO Auto-generated method stub
		return true;
	}
	
	/**
	 * Roles control.
	 *
	 * @param user
	 *            the user
	 * @return the string
	 */
	protected String rolesControl(User user) {
		String func = "";
		FunctionRoleExample functionRoleExample = new FunctionRoleExample();
		FunctionRoleExample.Criteria criteria2 = functionRoleExample.createCriteria();
		criteria2.andRoleEqualTo(user.getRole());
		List<FunctionRoleKey> functionRoleKeys = functionRoleMapper.selectByExample(functionRoleExample);
		
		for (int i = 0; i < functionRoleKeys.size(); i++){
			func += functionRoleKeys.get(i).getFunctionId() + ",";
		}
		return func;
	}

	/**
	 * Display the users.
	 *
	 * @return the list
	 */
	@Override
	public List<User> displayUsers() {
		List<User> users = userMapper.selectByExample(new UserExample());
		return users;
	}

}

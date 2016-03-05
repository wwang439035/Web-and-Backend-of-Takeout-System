/**
 * 
 */
package edu.fiu.hmts.service.impl;

import java.util.List;

import org.apache.log4j.varia.NullAppender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.fiu.hmts.dao.FunctionRoleMapper;
import edu.fiu.hmts.dao.UserMapper;
import edu.fiu.hmts.domain.FunctionRoleExample;
import edu.fiu.hmts.domain.FunctionRoleKey;
import edu.fiu.hmts.domain.User;
import edu.fiu.hmts.domain.UserExample;
import edu.fiu.hmts.domain.*;
import edu.fiu.hmts.service.IUserService;

/**
 * @author Wenbo
 *
 */
@Service
public class UserService implements IUserService {

	@Autowired 
	private UserMapper userMapper;
	
	@Autowired
	private FunctionRoleMapper functionRoleMapper;
	
	
	/* (non-Javadoc)
	 * @see edu.fiu.hmts.service.IUserService#register(edu.fiu.hmts.domain.User)
	 */
	@Override
	public User register(String username, String password, String firstname, 
			String lastname, String phone, String role, int secid, String answer) {
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setFirstName(firstname);
		user.setLastName(lastname);
		user.setPhone(phone);
		user.setSecQuestionId(secid);
		user.setSecAnswer(answer);
		
		int res = userMapper.insert(user);
		if (res > 0)
			return user;
		return null;
	}

	/* (non-Javadoc)
	 * @see edu.fiu.hmts.service.IUserService#login(edu.fiu.hmts.domain.User, java.lang.String)
	 */
	@Override
	public User login(String username, String password) {
		String func = "";
		UserExample userExample = new UserExample();
		UserExample.Criteria criteria = userExample.createCriteria();
		criteria.andUsernameEqualTo(username);
		criteria.andPasswordEqualTo(password);
		List<User> userConfirm = userMapper.selectByExample(userExample);
		
		if (userConfirm.size() == 0 || "3".equals(userConfirm.get(0).getRole())
				|| "4".equals(userConfirm.get(0).getRole()))
			return new User();
		
		FunctionRoleExample functionRoleExample = new FunctionRoleExample();
		FunctionRoleExample.Criteria criteria2 = functionRoleExample.createCriteria();
		criteria2.andRoleEqualTo(userConfirm.get(0).getRole());
		List<FunctionRoleKey> functionRoleKeys = functionRoleMapper.selectByExample(functionRoleExample);
		
		for (int i = 0; i < functionRoleKeys.size(); i++){
			func += functionRoleKeys.get(i).getFunctionId() + ",";
		}
		
		userConfirm.get(0).setTag(func);
		return userConfirm.get(0);
	}

	/* (non-Javadoc)
	 * @see edu.fiu.hmts.service.IUserService#logout(edu.fiu.hmts.domain.User)
	 */
	@Override
	public boolean logout(int userid) {
		// TODO Auto-generated method stub
		return true;
	}
	
	protected String rolesControl(int userid) {
		return null;
	}

}

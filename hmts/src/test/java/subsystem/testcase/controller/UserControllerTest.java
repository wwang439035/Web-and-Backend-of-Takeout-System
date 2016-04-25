package subsystem.testcase.controller;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

import edu.fiu.hmts.dao.hmts_repos.FunctionRoleMapper;
import edu.fiu.hmts.dao.hmts_repos.UserMapper;
import edu.fiu.hmts.domain.hmts_repos.FunctionRoleKey;
import edu.fiu.hmts.domain.hmts_repos.User;
import edu.fiu.hmts.service.impl.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/web-servlet.xml",
		"file:src/main/webapp/WEB-INF/spring/spring-jdbc.xml",
		"file:src/test/resources/testcontext.xml"})
@TestExecutionListeners({DependencyInjectionTestExecutionListener.class})
public class UserControllerTest {

	@Autowired
	private WebApplicationContext wac;
	
	private MockMvc mockMVC;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private FunctionRoleMapper functionRoleMapper;
	
	User userNU, webUserS, mobUserS;
	
	List<User> webUserList, mobUserList, userListF;
	
	List<FunctionRoleKey> functionRoleKeys, functionRoleKeys2;
	
	@Before
	public void setUp() throws Exception {		
		mockMVC = webAppContextSetup(wac).build();
		
		userNU = new User();
		userNU.setUserId(-1L);
		
		webUserS = new User();
		webUserS.setUserId(1L);
		webUserS.setUsername("peter@gmail.com");
		webUserS.setPassword("123456");
		webUserS.setFirstName("Peter");
		webUserS.setLastName("John");
		webUserS.setPhone("(305)837-4827");
		webUserS.setRole("2");
		
		mobUserS = new User();
		mobUserS.setUserId(2L);
		mobUserS.setUsername("david@yahoo.com");
		mobUserS.setPassword("123456");
		mobUserS.setFirstName("David");
		mobUserS.setLastName("Chris");
		mobUserS.setPhone("(305)233-9483");
		mobUserS.setSecQuestionId(1);
		mobUserS.setSecAnswer("Paul");
		mobUserS.setRole("4");
		
		userListF = new ArrayList<>();
		mobUserList = new ArrayList<>();
		webUserList = new ArrayList<>();
		webUserList.add(webUserS);
		mobUserList.add(mobUserS);
		
		functionRoleKeys = new ArrayList<>();
		FunctionRoleKey functionRoleKey1 = new FunctionRoleKey();
		functionRoleKey1.setFunctionId(1);
		functionRoleKeys.add(functionRoleKey1);
		FunctionRoleKey functionRoleKey2 = new FunctionRoleKey();
		functionRoleKey2.setFunctionId(2);
		functionRoleKeys.add(functionRoleKey2);
		
		functionRoleKeys2 = new ArrayList<>();
	}

	@Test
	public final void testLoginWebSuccess() {
		try {
			doCallRealMethod().when(userService).login(anyString(), anyString(), anyInt());
			doCallRealMethod().when(userService).rolesControl(any());
			when(userMapper.selectByExample(any())).thenReturn(webUserList);
			when(functionRoleMapper.selectByExample(any())).thenReturn(functionRoleKeys);
			
			mockMVC.perform(post("/user.do").param("mode", "login")
					.param("username", webUserS.getUsername())
					.param("password", webUserS.getPassword()))
				//MockMvcResultHandlers.andDo(print())
				.andExpect(status().isOk())
				.andExpect(view().name("home"))
				.andExpect(model().attribute("userId", webUserS.getUserId()))
				.andExpect(model().attribute("role", webUserS.getRole()))
				.andExpect(model().attribute("firstName", webUserS.getFirstName()))
				.andExpect(model().attribute("func", webUserS.getTag()));
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Test
	public final void testLoginWebFailed() {
		try {
			doCallRealMethod().when(userService).login(anyString(), anyString(), anyInt());
			doCallRealMethod().when(userService).rolesControl(any());
			when(userMapper.selectByExample(any())).thenReturn(userListF);
			when(functionRoleMapper.selectByExample(any())).thenReturn(functionRoleKeys2);
			
			mockMVC.perform(post("/user.do").param("mode", "login")
					.param("username", webUserS.getUsername())
					.param("password", webUserS.getPassword()))
				//.andDo(print())
				.andExpect(status().isOk())
				.andExpect(view().name("login"))
				.andExpect(model().attribute("username", webUserS.getUsername()));
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Test
	public final void testLoginWebException() {
		try {
			doCallRealMethod().when(userService).login(anyString(), anyString(), anyInt());
			doCallRealMethod().when(userService).rolesControl(any());
			when(userMapper.selectByExample(any())).thenReturn(userListF);
			when(functionRoleMapper.selectByExample(any())).thenReturn(functionRoleKeys2);
			
			mockMVC.perform(post("/user.do").param("mode", "login")
					.param("username", (String)null)
					.param("password", webUserS.getPassword()))
				//.andDo(print())
				.andExpect(status().isOk())
				.andExpect(view().name("login"));
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	@Test
	public final void testLogout() {
		try {
			doCallRealMethod().when(userService).logout(anyLong());
			
			mockMVC.perform(post("/user.do").param("mode", "logout"))
				//.andDo(print())
				.andExpect(status().is3xxRedirection())
				.andExpect(redirectedUrl("front.do?mode=dispatcher&target=login"))
				.andExpect(model().attribute("mode", "dispatcher"))
				.andExpect(model().attribute("target", "login"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public final void testRegisterWebSuccess() {
		try {
			doCallRealMethod().when(userService).displayUsers();
			doCallRealMethod().when(userService).register(anyString(), anyString()
					, anyString(), anyString(), anyString(), anyString(), anyInt()
					, anyString(), anyInt());
			when(userMapper.selectByExample(any())).thenReturn(webUserList);
			when(userMapper.insert(any())).thenReturn(1);
			
			mockMVC.perform(post("/user.do")
					.param("mode", "register")
					.param("userId", webUserS.getUserId().toString())
					.param("firstName", webUserS.getFirstName())
					.param("role", webUserS.getRole())
					.param("func", webUserS.getTag())
					.param("usernameNew", webUserS.getUsername())
					.param("firstNameNew", webUserS.getFirstName())
					.param("lastNameNew", webUserS.getLastName())
					.param("roleNew", "Staff"))
				//.andDo(MockMvcResultHandlers.print())
				.andExpect(status().isOk())
				.andExpect(view().name("users"))
				.andExpect(model().attribute("userId", webUserS.getUserId().toString()))
				.andExpect(model().attribute("firstName", webUserS.getFirstName()))
				.andExpect(model().attribute("func", webUserS.getTag()))
				.andExpect(model().attribute("userList", containsString("\"firstName\":\"Peter\"")))
				.andExpect(model().attribute("userList", containsString("\"lastName\":\"John\"")))
				.andExpect(model().attribute("userList", containsString("\"password\":\"123456\"")))
				.andExpect(model().attribute("userList", containsString("\"role\":\"2\"")))
				.andExpect(model().attribute("userList", containsString("\"phone\":\"(305)837-4827\"")))
				.andExpect(model().attribute("userList", containsString("\"userId\":1")))
				.andExpect(model().attribute("userList", containsString("\"username\":\"peter@gmail.com\"")));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public final void testRegisterWebFailed() {
		try {
			doCallRealMethod().when(userService).displayUsers();
			doCallRealMethod().when(userService).register(anyString(), anyString()
					, anyString(), anyString(), anyString(), anyString(), anyInt()
					, anyString(), anyInt());
			when(userMapper.selectByExample(any())).thenReturn(userListF);
			when(userMapper.insert(any())).thenReturn(0);
			
			mockMVC.perform(post("/user.do")
					.param("mode", "register")
					.param("userId", webUserS.getUserId().toString())
					.param("firstName", webUserS.getFirstName())
					.param("role", webUserS.getRole())
					.param("func", webUserS.getTag())
					.param("usernameNew", webUserS.getUsername())
					.param("firstNameNew", webUserS.getFirstName())
					.param("lastNameNew", webUserS.getLastName())
					.param("roleNew", "Employee"))
				//.andDo(MockMvcResultHandlers.print())
				.andExpect(status().isOk())
				.andExpect(view().name("users"))
				.andExpect(model().attribute("userId", webUserS.getUserId().toString()))
				.andExpect(model().attribute("firstName", webUserS.getFirstName()))
				.andExpect(model().attribute("func", webUserS.getTag()))
				.andExpect(model().attribute("userList", "[]"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public final void testDisplayUsersSuccess() {
		try {
			doCallRealMethod().when(userService).displayUsers();
			when(userMapper.selectByExample(any())).thenReturn(webUserList);
			
			mockMVC.perform(post("/user.do")
					.param("mode", "displayUsers")
					.param("userId", webUserS.getUserId().toString())
					.param("firstName", webUserS.getFirstName())
					.param("role", webUserS.getRole())
					.param("func", webUserS.getTag()))
				//.andDo(print())
				.andExpect(status().isOk())
				.andExpect(view().name("users"))
				.andExpect(model().attribute("userId", webUserS.getUserId().toString()))
				.andExpect(model().attribute("role", webUserS.getRole()))
				.andExpect(model().attribute("firstName", webUserS.getFirstName()))
				.andExpect(model().attribute("func", webUserS.getTag()))
				.andExpect(model().attribute("userList", containsString("\"firstName\":\"Peter\"")))
				.andExpect(model().attribute("userList", containsString("\"lastName\":\"John\"")))
				.andExpect(model().attribute("userList", containsString("\"password\":\"123456\"")))
				.andExpect(model().attribute("userList", containsString("\"role\":\"2\"")))
				.andExpect(model().attribute("userList", containsString("\"phone\":\"(305)837-4827\"")))
				.andExpect(model().attribute("userList", containsString("\"userId\":1")))
				.andExpect(model().attribute("userList", containsString("\"username\":\"peter@gmail.com\"")));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public final void testDisplayUsersNoUser() {
		try {
			doCallRealMethod().when(userService).displayUsers();
			when(userMapper.selectByExample(any())).thenReturn(userListF);
			
			mockMVC.perform(post("/user.do")
					.param("mode", "displayUsers")
					.param("userId", webUserS.getUserId().toString())
					.param("firstName", webUserS.getFirstName())
					.param("role", webUserS.getRole())
					.param("func", webUserS.getTag()))
				//.andDo(print())
				.andExpect(status().isOk())
				.andExpect(view().name("users"))
				.andExpect(model().attribute("userId", webUserS.getUserId().toString()))
				.andExpect(model().attribute("role", webUserS.getRole()))
				.andExpect(model().attribute("firstName", webUserS.getFirstName()))
				.andExpect(model().attribute("func", webUserS.getTag()))
				.andExpect(model().attribute("userList", "[]"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

package subsystem.testcase.controller;

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
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;


@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/web-servlet.xml",
		"file:src/main/webapp/WEB-INF/spring/spring-jdbc.xml",
		"file:src/test/resources/testcontext.xml"})
@TestExecutionListeners({DependencyInjectionTestExecutionListener.class})
public class FrontControllerTest {

	@Autowired
	private WebApplicationContext wac;

	MockMvc mockMvc;
	
	@Before
	public void setUp() throws Exception {
		mockMvc = webAppContextSetup(wac).build();
	}

	@Test
	public final void testDispatcherLogin() {
		try {
			mockMvc.perform(get("/front.do").param("mode", "dispatcher")
					.param("target", "login")
					.param("userId", "1")
					.param("role", "1")
					.param("firstName", "Administrator")
					.param("func", "1,2,3,"))
				.andDo(MockMvcResultHandlers.print())
				.andExpect(status().isOk())
				.andExpect(view().name("login"))
				.andExpect(model().attribute("userId", "1"))
				.andExpect(model().attribute("role", "1"))
				.andExpect(model().attribute("firstName", "Administrator"))
				.andExpect(model().attribute("func", "1,2,3,"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public final void testDispatcherHome() {
		try {
			mockMvc.perform(get("/front.do").param("mode", "dispatcher")
					.param("target", "home")
					.param("userId", "1")
					.param("role", "1")
					.param("firstName", "Administrator")
					.param("func", "1,2,3,"))
				.andDo(MockMvcResultHandlers.print())
				.andExpect(status().isOk())
				.andExpect(view().name("home"))
				.andExpect(model().attribute("userId", "1"))
				.andExpect(model().attribute("role", "1"))
				.andExpect(model().attribute("firstName", "Administrator"))
				.andExpect(model().attribute("func", "1,2,3,"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public final void testDispatcherContact() {
		try {
			mockMvc.perform(get("/front.do").param("mode", "dispatcher")
					.param("target", "contact")
					.param("userId", "1")
					.param("role", "1")
					.param("firstName", "Administrator")
					.param("func", "1,2,3,"))
				.andDo(MockMvcResultHandlers.print())
				.andExpect(status().isOk())
				.andExpect(view().name("contact"))
				.andExpect(model().attribute("userId", "1"))
				.andExpect(model().attribute("role", "1"))
				.andExpect(model().attribute("firstName", "Administrator"))
				.andExpect(model().attribute("func", "1,2,3,"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public final void testDispatcherTeam() {
		try {
			mockMvc.perform(get("/front.do").param("mode", "dispatcher")
					.param("target", "team")
					.param("userId", "1")
					.param("role", "1")
					.param("firstName", "Administrator")
					.param("func", "1,2,3,"))
				.andDo(MockMvcResultHandlers.print())
				.andExpect(status().isOk())
				.andExpect(view().name("team"))
				.andExpect(model().attribute("userId", "1"))
				.andExpect(model().attribute("role", "1"))
				.andExpect(model().attribute("firstName", "Administrator"))
				.andExpect(model().attribute("func", "1,2,3,"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public final void testDispatcherInvalidTarget() {
		try {
			mockMvc.perform(get("/front.do").param("mode", "dispatcher")
					.param("target", "WebPage")
					.param("userId", "1")
					.param("role", "1")
					.param("firstName", "Administrator")
					.param("func", "1,2,3,"))
				.andDo(MockMvcResultHandlers.print())
				.andExpect(status().isOk())
				.andExpect(view().name("error"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public final void testDispatcherException() {
		try {
			mockMvc.perform(get("/front.do").param("mode", "dispatcher")
					.param("target", (String)null)
					.param("userId", "1")
					.param("role", "1")
					.param("firstName", "Administrator")
					.param("func", "1,2,3,"))
				.andDo(MockMvcResultHandlers.print())
				.andExpect(status().isOk())
				.andExpect(view().name("home"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

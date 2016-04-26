package subsystem;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import subsystem.testcase.controller.FrontControllerTest;
import subsystem.testcase.controller.OperationControllerTest;
import subsystem.testcase.controller.UserControllerTest;

@RunWith(Suite.class)
@SuiteClasses({OperationControllerTest.class,
	UserControllerTest.class,
	FrontControllerTest.class,
	OperationControllerTest.class})
public class TestSuite {

}

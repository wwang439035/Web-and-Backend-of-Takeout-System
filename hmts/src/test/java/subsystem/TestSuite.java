package subsystem;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import subsystem.testcase.controller.FrontControllerTest;
import subsystem.testcase.controller.MobileInterfaceTest;
import subsystem.testcase.controller.OperationControllerTest;
import subsystem.testcase.controller.UserControllerTest;

@RunWith(Suite.class)
@SuiteClasses({OperationControllerTest.class,
	UserControllerTest.class,
	FrontControllerTest.class,
	MobileInterfaceTest.class})
public class TestSuite {

}

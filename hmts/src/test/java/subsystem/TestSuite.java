package subsystem;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import subsystem.testcase.controller.FrontControllerTest;
import subsystem.testcase.controller.OperationControllerTest;
import subsystem.testcase.controller.UserControllerTest;

/**
 * The Class TestSuite.
 * @author Wenbo Wang
 * @version 1.0, April 2016
 */
@RunWith(Suite.class)
@SuiteClasses({OperationControllerTest.class,
	UserControllerTest.class,
	FrontControllerTest.class,
	OperationControllerTest.class})
public class TestSuite {

}

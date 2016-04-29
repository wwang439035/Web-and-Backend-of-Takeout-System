package unit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import unit.testcase.service.OperationServiceTest;
import unit.testcase.service.ServiceServiceTest;
import unit.testcase.service.UserServiceTest;


/**
 * The Class TestSuite.
 * 
 * @author  Wenbo Wang
 * @version 1.0, April 2016
 */
@RunWith(Suite.class)
@SuiteClasses({OperationServiceTest.class
	, UserServiceTest.class
	, ServiceServiceTest.class})

public class TestSuite  {

}

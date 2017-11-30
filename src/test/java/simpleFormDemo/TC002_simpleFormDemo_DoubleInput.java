package simpleFormDemo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Test.test.seleniumEasy.BaseTest.TestBase;

public class TC002_simpleFormDemo_DoubleInput extends TestBase {
	@BeforeMethod
	public void setUp() {
		inIt();
		}
	@Test
	public void methodName() {
		simpleFormDemo_DoubleInput SFDD = new simpleFormDemo_DoubleInput(Driver);
		SFDD.DoubleInputFinal("10", "13");
		
		
		
		}
	
	@AfterMethod
	public void endTest() {
		closeTest();
		}

}

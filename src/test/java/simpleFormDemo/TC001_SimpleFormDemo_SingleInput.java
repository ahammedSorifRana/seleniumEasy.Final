package simpleFormDemo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Test.test.seleniumEasy.BaseTest.TestBase;

public class TC001_SimpleFormDemo_SingleInput extends TestBase{

	
	@BeforeMethod
	public void setUp() {
		inIt();
		}
	@Test
	public void SimpleFormDemo() {
		simpleFormDemo_SingleInput SFD = new simpleFormDemo_SingleInput(Driver);
		SFD.simpleDemoSingleInput("Hello World");
		}
	
	@AfterMethod
	public void endTest() {
		closeTest();
		}

}

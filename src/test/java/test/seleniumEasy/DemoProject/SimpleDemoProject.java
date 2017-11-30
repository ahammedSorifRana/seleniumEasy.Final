package test.seleniumEasy.DemoProject;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Test.test.seleniumEasy.BaseTest.TestBase;

public class SimpleDemoProject extends TestBase {
	
	
	
	
	@BeforeMethod
	public void setUp() {
		inIt();
		}
	@Test
	public void methodName() {
		
		
		
		
		}
	
	@AfterMethod
	public void endTest() {
		closeTest();
		}

	
	
	
	
}

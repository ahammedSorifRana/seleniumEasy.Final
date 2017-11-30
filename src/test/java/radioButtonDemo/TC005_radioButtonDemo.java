package radioButtonDemo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Test.test.seleniumEasy.BaseTest.TestBase;

public class TC005_radioButtonDemo extends TestBase {

	@BeforeMethod
	public void setUp() {
		inIt();
		}
	@Test
	public void radioButtonDemo() {
		
		radioButtonDemo_singleRadioButton RBDS = new radioButtonDemo_singleRadioButton(Driver);
		RBDS.radioButtonDemoFinal(RBDS.Female);
		
		
		}
	
	@AfterMethod
	public void endTest() {
		closeTest();
		}

	

}

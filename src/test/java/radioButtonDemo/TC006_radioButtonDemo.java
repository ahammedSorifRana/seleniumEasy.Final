package radioButtonDemo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Test.test.seleniumEasy.BaseTest.TestBase;

public class TC006_radioButtonDemo extends TestBase {

	@BeforeMethod
	public void setUp() {
		inIt();
		}
	@Test
	public void radioButtonDemo() {
		
		radioButtonDemo_multiButton RBDM = new radioButtonDemo_multiButton(Driver);
		
		RBDM.radioButtonFinal(RBDM.Female,RBDM.Fifteento25);
		
		
		
		}
	
	@AfterMethod
	public void endTest() {
		closeTest();
		}

}

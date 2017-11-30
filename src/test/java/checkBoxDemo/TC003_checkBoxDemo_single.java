package checkBoxDemo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Test.test.seleniumEasy.BaseTest.TestBase;

public class TC003_checkBoxDemo_single extends TestBase {

	@BeforeMethod
	public void setUp() {
		inIt();
		}
	@Test
	public void checkBoxDemo_singles() {
		checkBoxDemo_single CBDS = new checkBoxDemo_single(Driver);
		CBDS.checkBoxDemoFinal();
		
		
		}
	
	@AfterMethod
	public void endTest() {
		closeTest();
		}


}

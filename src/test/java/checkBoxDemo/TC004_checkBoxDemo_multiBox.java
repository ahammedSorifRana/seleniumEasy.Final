package checkBoxDemo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Test.test.seleniumEasy.BaseTest.TestBase;

public class TC004_checkBoxDemo_multiBox extends TestBase {


	@BeforeMethod
	public void setUp() {
		inIt();
		}
	@Test
	public void checkBoxDemo_multiBox() {
		
		checkBoxDemo_multiBox CBDM = new checkBoxDemo_multiBox(Driver);
		CBDM.checkBox_MultiFinal(CBDM.Option_1);
		
		
		}
	
	@AfterMethod
	public void endTest() {
		closeTest();
		}

}

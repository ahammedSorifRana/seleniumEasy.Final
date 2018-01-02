package bootStrapDatePicker;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Test.test.seleniumEasy.BaseTest.TestBase;

public class TC010_BoothDatePicker extends TestBase {

	@BeforeMethod
	public void setUp() {
		inIt();
		}
	@Test
	public void BoothDatePicker() {
		DateExample DE = new  DateExample(Driver);
		DE.DataExampleFinal();
	};
	
	@AfterMethod
	public void endTest() {
		closeTest();
		}

	

}

package bootStrapDatePicker;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Test.test.seleniumEasy.BaseTest.TestBase;

public class TC011_DateRangeExample extends TestBase{
	
	@BeforeMethod
	public void setUp() {
		inIt();
		}
	@Test
	public void methodName() {
		DateRangeExample DRE = new DateRangeExample(Driver);
		DRE.DateRangefinal();
	};
	
	@AfterMethod
	public void endTest() {
		closeTest();
		}


}

package selectDropDownList;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Test.test.seleniumEasy.BaseTest.TestBase;

public class TC007_selectDropDownListFirstManu extends TestBase {
	@BeforeMethod
	public void setUp() {
		inIt();
		}
	@Test
	public void selectDropDownListFirstManu() {
		selectDropDownListAll  SDDL = new selectDropDownListAll(Driver);
		SDDL.dowpDownFinal(SDDL.Monday);
		}
	
	@AfterMethod
	public void endTest() {
		closeTest();
		}

}

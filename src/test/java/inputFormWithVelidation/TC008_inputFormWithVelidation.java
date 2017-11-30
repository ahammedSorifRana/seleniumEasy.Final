package inputFormWithVelidation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Test.test.seleniumEasy.BaseTest.TestBase;

public class TC008_inputFormWithVelidation extends TestBase {
	
	
	@BeforeMethod
	public void setUp() {
		inIt();
		}
	@Test
	public void inputFormWithVelidation() {
		inputFormWithVelidation IFWV = new inputFormWithVelidation(Driver);
		IFWV.inputFormFinal();
		
		
		}
	
	@AfterMethod
	public void endTest() {
		closeTest();
		}

}

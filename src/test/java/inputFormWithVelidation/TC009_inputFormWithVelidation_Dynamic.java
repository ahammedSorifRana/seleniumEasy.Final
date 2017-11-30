package inputFormWithVelidation;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Test.test.seleniumEasy.BaseTest.TestBase;

public class TC009_inputFormWithVelidation_Dynamic extends TestBase {
	
	@DataProvider(name="data")
	public String[][] dynamicValue() {
	String[][] testData =	getData("InputFormSubmitte.xlsx", 0);
	return testData;
		}
	
	@BeforeTest
	public void setUp() {
		inIt();
		}
	@Test(dataProvider="data")
	public void inputFormWithVelidation_Dynamic(String FirstName,String LastName,String EmailAdd,String PhoneNum,String HomeAdd,String City,String StateName,String ZipCode,String WebAdd,String comment) {
		inputFormWithVelidation_Dynamic IFD = new inputFormWithVelidation_Dynamic(Driver);
		IFD.inputFormFinal(FirstName, LastName, EmailAdd, PhoneNum, HomeAdd, City, StateName, ZipCode, WebAdd, comment);
		
		
		
		}
	
	@AfterTest
	public void endTest() {
		closeTest();
		}

	


}

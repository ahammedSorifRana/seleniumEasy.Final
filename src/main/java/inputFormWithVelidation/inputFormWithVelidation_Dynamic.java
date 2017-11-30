package inputFormWithVelidation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import Test.test.seleniumEasy.BaseTest.TestBase;

public class inputFormWithVelidation_Dynamic extends TestBase {
		WebDriver Driver;
		
		@FindBy(css=".form-control.selectpicker")
		WebElement xstateName;
		@FindBy(css=".btn.btn-default")
		WebElement clickSend;
	public inputFormWithVelidation_Dynamic(WebDriver driver) {
		this.Driver=driver;
		PageFactory.initElements(driver, this);
		}
	public void enterText(String name,String Value) {
		String sPath = ".form-control[name='"+name+"']";
		Driver.findElement(By.cssSelector(sPath)).clear();
		Driver.findElement(By.cssSelector(sPath)).sendKeys(Value);
		}
	public void selectRadioButton(String xvalue) {
		String Bpath = ".radio>label>input[value='"+xvalue+"']";
		Driver.findElement(By.cssSelector(Bpath)).click();
		}
	public void inputFormFinal(String FirstName,String LastName,String EmailAdd,String PhoneNum,String HomeAdd,String City,String StateName,
			String ZipCode,String WebAdd,String comment) {
		chosseLeftManu(NavInputForm,Input_Form_Submit);
		enterText("first_name", FirstName);
		enterText("last_name", LastName);
		enterText("email", EmailAdd);
		enterText("phone", PhoneNum);
		enterText("address", HomeAdd);
		enterText("city", City);
		xstateName.click();
		Select sName = new Select(xstateName);
		sName.selectByVisibleText(StateName);
		enterText("zip", ZipCode);
		enterText("website", WebAdd);
		selectRadioButton("yes");
		enterText("comment", comment);
		clickSend.click();
		}
	
}

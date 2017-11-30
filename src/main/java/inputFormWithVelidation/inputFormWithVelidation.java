package inputFormWithVelidation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Test.test.seleniumEasy.BaseTest.TestBase;

public class inputFormWithVelidation extends TestBase {
		WebDriver Driver;
		
		@FindBy(css=".form-control.selectpicker")
		WebElement stateName;
		
		@FindBy(css=".btn.btn-default")
		WebElement clickSend;
	public inputFormWithVelidation(WebDriver driver) {
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
	public void inputFormFinal() {
		chosseLeftManu(NavInputForm,Input_Form_Submit);
		enterText("first_name", "Ahammed1");
		enterText("last_name", "Sorif1");
		enterText("email", "ahammed@ahammedsorif.com");
		enterText("phone", "435-455-4554");
		enterText("address", "89 MetOval ");
		enterText("city", "Brix1");
		stateName.click();
		Select sName = new Select(stateName);
		sName.selectByVisibleText("New York");
		enterText("zip", "10462");
		enterText("website", "ahammedsorif.com");
		selectRadioButton("yes");
		enterText("comment", "It project all about Selenium");
		clickSend.click();
		}

}

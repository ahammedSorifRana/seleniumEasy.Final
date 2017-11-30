package checkBoxDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Test.test.seleniumEasy.BaseTest.TestBase;

public class checkBoxDemo_single extends TestBase {
	WebDriver Driver;
	public final String expected_value ="Success - Check box is checked";
	
	@FindBy(css="div.panel.panel-default div.panel-body div.checkbox label >input#isAgeSelected")
	WebElement clickOnCheckBox;
	@FindBy(css="div#txtAge")
	WebElement getMassage;
	public checkBoxDemo_single(WebDriver driver) {
		this.Driver = driver;
		PageFactory.initElements(driver, this);
		}
	public void navCheckBox() {
		chosseLeftManu(NavInputForm,Checkbox_Demo);
		}
	public void selectCheckBox() {
		clickOnCheckBox.click();
		}
	public void verifyClick() {
			try {
				Assert.assertEquals(getMassage.getText(), expected_value);
				} 
			catch (Exception e) {
				System.out.println("CheckBoxDemo_single error : " +e.getMessage());
				}
		
		}
	public void checkBoxDemoFinal() {
		navCheckBox();
		selectCheckBox();
		verifyClick();
		}

}

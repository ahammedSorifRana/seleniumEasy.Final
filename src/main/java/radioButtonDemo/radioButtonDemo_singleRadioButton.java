package radioButtonDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Test.test.seleniumEasy.BaseTest.TestBase;
import junit.framework.Assert;

public class radioButtonDemo_singleRadioButton extends TestBase {
	WebDriver Driver;
	public final String Male ="Male";
	public final String Female ="Female";
	
	@FindBy(xpath="//div[@class='panel panel-default']//div[@class='panel-body']//label[text()='Female']//following::p//button[text()='Get Checked value']")
	WebElement clickOnButton;
	
	
	public radioButtonDemo_singleRadioButton(WebDriver driver) {
		this.Driver = driver;
		PageFactory.initElements(driver, this);
		}
	
	public void navToRadioButton() {
		chosseLeftManu(NavInputForm, Radio_Buttons_Demo);
		}
	public void selectOption(String optionName) {
		String radioXpath ="//div[@class='panel panel-default']//div[@class='panel-body']//label[text()='"+optionName+"']";
		Driver.findElement(By.xpath(radioXpath)).click();
		}
	public void clickOnButton() {
		clickOnButton.click();
		}
	public boolean getValue(String optionName) {
		String Xvalue ="//following::p//button[text()='Get Checked value']//following::p[contains(text(),'"+optionName+"')]"; 
			try {
				Driver.findElement(By.xpath(Xvalue)).isDisplayed();
				return true;
			} catch (Exception e) {
				return false;
			}
		}
	public void checkTheResult(String optionName) {
			try {
				Assert.assertEquals(true, getValue(optionName));
			} catch (Exception e) {
				System.out.println("Radio Button Assertion Fail: " + e.getMessage());
			}
		}
	public void radioButtonDemoFinal(String optionName) {
		navToRadioButton();
		selectOption(optionName);
		clickOnButton();
		checkTheResult(optionName);
		}

}

package simpleFormDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Test.test.seleniumEasy.BaseTest.TestBase;

public class simpleFormDemo_DoubleInput extends TestBase{
	WebDriver Driver;
	
	@FindBy(xpath="//div[@class='form-group']//label[text()='Enter a']//following::input[@id='sum1']")
	WebElement firstSum;
	@FindBy(xpath="//div[@class='form-group']//label[text()='Enter b']//following::input[@id='sum2']")
	WebElement SecondSum;
	@FindBy(xpath="//div[@class='form-group']//following::button[text()='Get Total']")
	WebElement clickOnButton;
	@FindBy(xpath="//div//label[contains(text(),'Total a + b =')]//following::span[@id='displayvalue']")
	WebElement addValue;
	public simpleFormDemo_DoubleInput(WebDriver driver) {
		this.Driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void navManue() {
		chosseLeftManu(NavInputForm, Simple_Form_Demo);
		}
	public void EnterText(String firstInput,String SecondInput) {
		firstSum.sendKeys(firstInput);
		SecondSum.sendKeys(SecondInput);
		clickOnButton.click();
		}
	public void checkTheValue(String firstInput,String SecondInput ) {
		
			try {
				int firstValue = Integer.parseInt(firstInput);
				int seconValue = Integer.parseInt(SecondInput);
				int expected_Final_Value = firstValue + seconValue;
				String actual_value =addValue.getText();
				int actual_Final_value = Integer.parseInt(actual_value);
				Assert.assertEquals(actual_Final_value, expected_Final_Value);
				} 
			catch (Exception e) {
			 System.out.println("Doubleinput verification error : "+ e.getMessage());
				}
		}
	public void DoubleInputFinal(String firstInput,String SecondInput) {
		navManue();
		EnterText( firstInput,SecondInput);
		checkTheValue(firstInput,SecondInput);
		}
	

}

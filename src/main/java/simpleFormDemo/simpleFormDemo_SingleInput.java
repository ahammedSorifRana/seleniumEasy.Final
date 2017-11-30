package simpleFormDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Test.test.seleniumEasy.BaseTest.TestBase;
import junit.framework.Assert;

public class simpleFormDemo_SingleInput extends TestBase {
	WebDriver Driver;
	
	@FindBy(xpath="//div[@class='form-group']//label[text()='Enter message']//following:: input[@id='user-message']")
	WebElement massageBox;
	@FindBy(xpath="//div[@class='form-group']//following::button[text()='Show Message']")
	WebElement clickOnMassageBox;
	@FindBy(xpath="//div[@id='user-message']//span[@id='display']")
	WebElement dispalyMassage;
	public simpleFormDemo_SingleInput(WebDriver driver) {
		this.Driver = driver;
		PageFactory.initElements(driver, this);
		}
	
	public void selectFromDemo() {
		chosseLeftManu(NavInputForm, Simple_Form_Demo);
		}
	public void enterMassage(String Massage) {
		massageBox.sendKeys(Massage);
		clickOnMassageBox.click();
		}
	public void verifyMassage(String Massage) {
		try {
			Assert.assertEquals(Massage, dispalyMassage.getText());
		} catch (Exception e) {
			System.out.println("Display Is not Presented"+e.getMessage());
		}
		}
	public void simpleDemoSingleInput(String Massage) {
		selectFromDemo();
		enterMassage(Massage);
		verifyMassage(Massage);
		}
	
}

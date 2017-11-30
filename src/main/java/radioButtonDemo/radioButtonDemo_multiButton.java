package radioButtonDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Test.test.seleniumEasy.BaseTest.TestBase;
import junit.framework.Assert;

public class radioButtonDemo_multiButton extends TestBase {
	WebDriver Driver;
	public final String Male ="Male";
	public final String Female ="Female";
	public final String Zeroto5 ="0 - 5";
	public final String Fiveto15 ="5 - 15";
	public final String Fifteento25 ="15 - 50";
	@FindBy(xpath="//button[text()='Get values']")
	WebElement clickOnButton;
	@FindBy(xpath=".//*[@id='easycont']/div/div[2]/div[2]/div[2]/p[2]")
	WebElement getResult;
	public radioButtonDemo_multiButton(WebDriver driver) {
		this.Driver =driver;
		PageFactory.initElements(driver, this);
		}
	public void choseRadioButton() {
		chosseLeftManu(NavInputForm, Radio_Buttons_Demo);
		}
	
	public void chooseButton(String optionName) {
		String xButton ="//*[@id='easycont']/div/div[2]/div[2]/div[2]/div/label//input[@value='"+optionName+"']";
		Driver.findElement(By.xpath(xButton)).click();
		}
	public void clickOnButton() {
		clickOnButton.click();
		}
	public String getResultText() {
		 String res = getResult.getText();
		 return res;
		}
	public void verifyDispaly(String optionName1,String optionName2) {
		try {
			String  outPut = "Sex : "+optionName1+ "\n" +"Age group: "+optionName2;
			Assert.assertEquals(false,getResultText().equalsIgnoreCase(outPut) );
		} catch (Exception e) {
			System.out.println("Redio Button Mul Fail" + e.getMessage());
		}
	}
	public void radioButtonFinal(String optionName1,String optionName2) {
		choseRadioButton();
		chooseButton(optionName1);
		chooseButton(optionName2);
		clickOnButton();
		verifyDispaly(optionName1, optionName2);
		}

}

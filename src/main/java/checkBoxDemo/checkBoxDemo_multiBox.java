package checkBoxDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Test.test.seleniumEasy.BaseTest.TestBase;
import junit.framework.Assert;

public class checkBoxDemo_multiBox extends TestBase {
	WebDriver Driver;
	public final String Check_All ="Check All";
	public final String Uncheck_All ="Uncheck All";
	public final String Option_1 ="Option 1";
	public final String Option_2 ="Option 2";
	public final String Option_3 ="Option 3";
	public final String Option_4 ="Option 4";
	
	@FindBy(xpath="//div[@class='panel panel-default']//input[@id='check1']")
	WebElement clickOnCheckBox;
	
	public checkBoxDemo_multiBox(WebDriver driver) {
		this.Driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void navCheckBoxDemo() {
		chosseLeftManu(NavInputForm, Checkbox_Demo);
		}
	public void clickOnCheckBox(String SelectCheckBox) {
			if(SelectCheckBox =="Check All" || SelectCheckBox=="Uncheck All") {
					clickOnCheckBox.click();
				}
			else
				{
				String	xCheckBox = "//div[@id='easycont']/div/div[2]/div[2]//div[@class='checkbox']//following::label[text()='"+SelectCheckBox+"']";
				Driver.findElement(By.xpath(xCheckBox)).click();
				}
		}
	public void checkTheCheck(String SelectCheckBox) {
		try {
			if(SelectCheckBox =="Check All") {
				Assert.assertEquals(Uncheck_All, clickOnCheckBox.getAttribute("value"));
				}
			else {
				Assert.assertEquals(Check_All, clickOnCheckBox.getAttribute("value"));
				}
			} 
		catch (Exception e) {
			System.out.println("CheckBoxDemo_multiBox : " + e.getMessage());
			}
		}
	public void checkBox_MultiFinal(String SelectCheckBox) {
		 navCheckBoxDemo();
		 clickOnCheckBox(SelectCheckBox);
		 checkTheCheck(SelectCheckBox);
		}

}

package selectDropDownList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Test.test.seleniumEasy.BaseTest.TestBase;
import junit.framework.Assert;

public class selectDropDownListAll extends TestBase {
	
	public final String Sunday ="Sunday";
	public final String Monday ="Monday";
	public final String Tuesday ="Tuesday";
	public final String Wednesday ="Wednesday";
	public final String Thursday ="Thursday";
	public final String Friday ="Friday";
	public final String Saturday ="Saturday";
	
	
	WebDriver Driver;
	@FindBy(css="select#select-demo.form-control")
	WebElement SelectManue;
	@FindBy(css="p.selected-value")
	WebElement VerifyValue;
	public selectDropDownListAll(WebDriver driver) {
		this.Driver = driver;
		PageFactory.initElements(driver, this);
		}
	
	public void chooseDropDownList() {
		chosseLeftManu(NavInputForm, Select_Dropdown_List);
		}
	public void clickOnManue() {
		SelectManue.click();
		}
	public void selectManue(String VisualText) {
	 Select	 sm = new Select(SelectManue) ;
	 sm.selectByVisibleText(VisualText);
		}
	private String getActualResult() {
		String res =VerifyValue.getText();
		return res;
		}
	public void varifyValue(String VisualText) {
	String  xValue = "Day selected :- "+VisualText;
	Assert.assertEquals(true, getActualResult().equalsIgnoreCase(xValue));
		}
	public void dowpDownFinal(String VisualText) {
		chooseDropDownList();
		WebDriverWait WDW = new WebDriverWait(Driver, 60);
		WDW.until(ExpectedConditions.elementToBeClickable(SelectManue));
		clickOnManue();
		selectManue(VisualText);
		varifyValue(VisualText);
		
		}
}

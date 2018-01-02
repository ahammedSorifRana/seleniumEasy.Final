package bootStrapDatePicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Test.test.seleniumEasy.BaseTest.TestBase;

public class DateExample extends TestBase {
	
	
	WebDriver Driver;
	
	final String Jan = "January";
	final String Feb ="February";
	final String Mar ="March";
	final String Apr ="April";
	final String May ="May";
	final String Jun ="June";
	final String Jul ="July";
	final String Agu ="August";
	final String Sep ="September";
	final String Oct ="October";
	final String Nov ="November";
	final String Dec ="December";
	
	@FindBy(css=".input-group-addon")
	WebElement clickToSeeData;
	@FindBy(css=".today")
	WebElement clickOnToday;
	@FindBy(css=".datepicker-switch")
	WebElement getActualDate;
	@FindBy(css=".prev")
	WebElement ClickOnPrevButton;
	@FindBy(xpath="html/body/div[3]/div[1]/table/tbody/tr/td")
	WebElement AllDate;
	@FindBy(css=".form-control")
	WebElement getSelectedDate;
	
	
	
	
	
	
	public void clickOnDate() {
		clickToSeeData.click();
	}
	
	
	
	public void actualSelectedDate() {
		String Adate =getSelectedDate.getText();
		System.out.println(Adate);
		}
	public DateExample(WebDriver Driver) {
		
		this.Driver = Driver;
		PageFactory.initElements(Driver, this);
		
		}
	
	public void chooseNav() {
		super.chosseLeftManu(super.NavDatePicker, super.Bootstrap_Date_Picker);
		
	}
	public boolean chooseDate(String Month,int Year) {
		String chooseMonth = Month+" " +Year;
		String actualMonth =getActualDate.getText();
		System.out.println(actualMonth);
		if(actualMonth.equalsIgnoreCase(chooseMonth)) {
			return true;
			
		}
		else {
			return false;
		}
		
	}
	
	public void actualChooseDate(String Date, String Month,int Year) {
		int count =0 ;
		while(chooseDate(Month,Year) == false){
			ClickOnPrevButton.click();
			count ++;
			
			if(count > 500) {
				System.out.println("Data is out of range");
				break;
			}
		
		}
		String xDate ="html/body/div[3]/div[1]/table/tbody/tr/td[text()='"+Date+"']";
		Driver.findElement(By.xpath(xDate)).click();
		
	}
	
	
	
	public void DataExampleFinal() {
		chooseNav();
		clickOnDate();
		actualChooseDate("16",Jan,2000);
		actualSelectedDate();

		}

}





 /*
  * List<WebElement> allDates = Driver.findElements(By.xpath("html/body/div[3]/div[1]/table/tbody/tr/td"));
		for(WebElement xdate : allDates) {
			String DateValue = xdate.getText();
			System.out.println(DateValue);
			System.out.println("Input Date " + Date);
			Select xValue = new Select(xdate);
			xValue.selectByVisibleText(Date);
		}
  * 
  * 
  * int size =allDates.size();
  */
	/*	System.out.println(size);
		for(WebElement dates : allDates) {
			//boolean dateText = dates.getText().equalsIgnoreCase(Date);
			System.out.println(dates.getText());
			Select dText = new Select(dates);
			dText.selectByVisibleText(Date);
			
			/*if(dateText== true) {
				dates.click();
				break;
			}
			
		}*/

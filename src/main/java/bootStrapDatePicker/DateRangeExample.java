package bootStrapDatePicker;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Test.test.seleniumEasy.BaseTest.TestBase;

public class DateRangeExample extends TestBase {
	
	WebDriver Driver;
	@FindBy(css=".form-control[placeholder='Start date']")
	WebElement StartDate;
	@FindBy(css=".form-control[placeholder='End date']")
	WebElement EndDate;
	@FindBy(css=".datepicker-switch")
	WebElement  CurrentMonth;
	@FindBy(xpath="html/body/div[3]/div[1]/table/thead/tr[2]/th[3]")
	WebElement NextButton;
	@FindBy(xpath="html/body/div[3]/div[1]/table/thead/tr[2]/th[1]")
	WebElement prevButton;
	public DateRangeExample(WebDriver driver){
		this.Driver = driver;
		PageFactory.initElements(Driver, this);
				
		
	}
	
	
	private int CurrentgetYear() {
		String CurrentMonth =this.CurrentMonth.getText();
		String[] Year =CurrentMonth.split("\\s");
		String sYear =Year[1];
		int iYear = Integer.parseInt(sYear);
		return	iYear;
		
		}
	private String actualDate(String Month ,String Year) {
		
		String actualMonth= Month+" "+Year;
		return actualMonth;
		}
	
	private boolean compareAcutal(String Month ,String Year) {
		/*System.out.println("Expected Date:" +actualDate( Month , Year));
		System.out.println("Actual Date"+this.CurrentMonth.getText());*/
		if(actualDate( Month , Year).equalsIgnoreCase(this.CurrentMonth.getText())) {
			return true;
		}
		else 
			return false;
		
	}
	private void getDate(String Date ,String month,String Year) {
		
		
		int aiYear =Integer.parseInt(Year);
	//boolean	compResul =compareAcutal( month , Year);
	/*ystem.out.println(compResul);
	System.out.println(CurrentgetYear());
	System.out.println(aiYear);*/
		
		if(CurrentgetYear()==aiYear){
			int count = 1;
			
			while(compareAcutal( month , Year) == false) {
				NextButton.click();
				count++;
				if(count == 13) {
					break;
				}
				}
			while(compareAcutal( month , Year) == false) {
				prevButton.click();
				count++;
				if(count == 25) {
					break;
					
				}
			}
			String xDate ="html/body/div[3]/div[1]/table/tbody/tr/td[text()='"+Date+"']";
			Driver.findElement(By.xpath(xDate)).click();
			
		}
		else if( CurrentgetYear()>aiYear) {
			
			while(compareAcutal( month , Year) == false) {
				prevButton.click();
			}
			String xDate ="html/body/div[3]/div[1]/table/tbody/tr/td[text()='"+Date+"']";
			Driver.findElement(By.xpath(xDate)).click();
		}
		else if( CurrentgetYear()<aiYear) {
			
			while(compareAcutal( month , Year) == false) {
				NextButton.click();
			}
			String xDate ="html/body/div[3]/div[1]/table/tbody/tr/td[text()='"+Date+"']";
			Driver.findElement(By.xpath(xDate)).click();
		}
	
		
		
	
	
	}
	
	
	public void DateRangefinal() {
		DateExample DE = new DateExample(Driver);
		chosseLeftManu(this.NavDatePicker,this.Bootstrap_Date_Picker);
		StartDate.click();
		getDate( "6" , DE.May,"2017");
		EndDate.click();
		getDate( "15" , DE.Jun, "2019");
		
	}
	

}

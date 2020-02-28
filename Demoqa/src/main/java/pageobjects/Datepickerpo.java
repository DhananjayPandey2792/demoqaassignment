package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class Datepickerpo extends Commonpo{

	
	public void clickDateInputField(){
		WebElement datePickerInput=driver.findElement(By.cssSelector("input#datepicker"));
		datePickerInput.click();
	}
	public void clickPreviousMonthButton(){
		WebElement previousMonth=driver.findElement(By.xpath("//a[@class='ui-datepicker-prev ui-corner-all']/span"));
		previousMonth.click();
	}
	public void selectDate(){
		String expectedValue="26";
		List<WebElement> dateList=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td"));
		for(WebElement date:dateList){
			if(date.getText().equals(expectedValue)){
				date.click();
				break;
			}
		}
	}
	
public void validateDateDisplayed(String date){
	WebElement datePickerInput=driver.findElement(By.cssSelector("input#datepicker"));
	String getValue=datePickerInput.getAttribute("value");
	Assert.assertTrue(getValue.contains(date));
}
}

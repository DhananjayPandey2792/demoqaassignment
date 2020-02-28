package pageobjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class Keyboardeventpo extends Commonpo{
	

	public void clickChooseFile(){
			driver.findElement(By.id("browseFile")).sendKeys("C:\\RegressionTestData\\massupd.txt");
		}
	
	public void clickUploadBtn(){
		WebElement btnUpload=driver.findElement(By.id("uploadButton"));
		btnUpload.click();
	}
public void verifyFileUpload(){
	Alert alert=driver.switchTo().alert();
	String expectedMsg="Thanks, you have selected C:\\fakepath\\massupd.txt file to Upload";
	String actualMsg=alert.getText();
	Assert.assertTrue(actualMsg.contains(expectedMsg));
	alert.accept();
	
}
}

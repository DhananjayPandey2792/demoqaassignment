package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

public class Menupo extends Commonpo {
	public void navigateToOption(String options) {

		WebDriverWait wait = new WebDriverWait(driver, 10000);
		Actions action = new Actions(driver);

		String[] optionsList = options.split("->");
		for (int i = 0; i < optionsList.length; i++) {

			List<WebElement> listElement = driver.findElements(By.xpath("//li[@class='ui-menu-item']"));

			for (WebElement webElement : listElement) {
				if (webElement.getText().equals(optionsList[i])) {
					wait.until(ExpectedConditions.visibilityOfAllElements(webElement));
					action.moveToElement(webElement).perform();

				}
			}

		}

	}

}

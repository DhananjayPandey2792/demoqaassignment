package pageobjects;

import org.junit.Assert;
import org.openqa.selenium.By;

public class Accordionpo extends Commonpo {

public void validateTextPresence(int sectionNumber){
		
	   int textEle=driver.findElements(By.xpath("(//p[contains(text(),'Vivamus')])["+sectionNumber+"]")).size();
	   try{
		Assert.assertTrue(textEle>0);
		}catch(AssertionError ae){
			System.out.println("String not present");
		}
	}

public boolean isAccordionExpanded(int sectionNumber){
	String isExpanded=driver.findElements(By.cssSelector("div#accordion h3")).get(sectionNumber-1).getAttribute("aria-expanded");
	
	if(isExpanded.equalsIgnoreCase("true")){
		return true;
	}else{
		return false;
	}
}

public void expandSection(boolean flag,int sectionNumber){
	if(!flag){
		driver.findElements(By.cssSelector("div#accordion h3")).get(sectionNumber-1).click();
	}
}
}

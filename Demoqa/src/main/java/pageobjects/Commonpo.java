package pageobjects;

import commonLib.ObjectDeclaration;

public class Commonpo extends ObjectDeclaration {
	
public void getUrl(String url){
	driver.get(url);
}
}

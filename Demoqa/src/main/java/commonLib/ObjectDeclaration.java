package commonLib;

import org.openqa.selenium.WebDriver;

import pageobjects.Accordionpo;
import pageobjects.Commonpo;
import pageobjects.Datepickerpo;
import pageobjects.Keyboardeventpo;
import pageobjects.Menupo;

public class ObjectDeclaration {

	public static WebDriver driver = DriverInitialize
			.initializeDriver(CommonLib.getConfigValue("ConstantValues", "browserType"));
	protected static CommonLib commonUtil = new CommonLib();
	protected static Commonpo commonPo = new Commonpo();
	protected static Accordionpo acc = new Accordionpo();
	protected static Datepickerpo dp = new Datepickerpo();
	protected static Keyboardeventpo keyboardpo = new Keyboardeventpo();
	protected static Menupo menupo = new Menupo();
}

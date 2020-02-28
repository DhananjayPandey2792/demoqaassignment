package testrunner;

import java.io.*;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import com.cucumber.listener.Reporter;

import commonLib.ObjectDeclaration;


@RunWith(Cucumber.class)
@CucumberOptions(
		dryRun = false,
        monochrome = true,
        strict = true,
        features = "src/test/java/features",
        glue = "stepdef",
        plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},tags={"@demoqa"})
		

public class TestRunner extends ObjectDeclaration {
	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File(commonUtil.getReportConfigPath()));
		driver.quit();
	}
}


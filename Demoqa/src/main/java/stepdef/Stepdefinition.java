package stepdef;

import commonLib.ObjectDeclaration;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition extends ObjectDeclaration {

	@Given("^i launch url \"([^\"]*)\" in demoqa$")
	public void launchUrl(String url) {
		commonPo.getUrl(url);
	}

	@Then("^validate text Vivamus in section (\\d+)$")
	public void validateText(int sectionNumber) {
		boolean flag = acc.isAccordionExpanded(sectionNumber);
		acc.expandSection(flag, sectionNumber);
		acc.validateTextPresence(sectionNumber);

	}

	@When("^i click on date input box$")
	public void clickDateInput() {
		dp.clickDateInputField();
	}

	@Then("^i navigate to big band option \"([^\"]*)\"$")
	public void navigateToBigBand(String options) {

		menupo.navigateToOption(options);
	}

	@When("^i click on previous button$")
	public void clickPreviousButton() {
		dp.clickPreviousMonthButton();
	}

	@When("^i select a specific date$")
	public void selectCalenderDate() {
		dp.selectDate();
	}

	@Then("^selected date \"([^\"]*)\" displayed in date input field$")
	public void verifyDateDisplayed(String date) {
		dp.validateDateDisplayed(date);
	}

	@When("^i click on choose file$")
	public void chooseFile() {
		keyboardpo.clickChooseFile();
	}

	@When("^click on upload button$")
	public void fileUpload() {
		keyboardpo.clickUploadBtn();
	}

	@Then("^file should be upload$")
	public void verifyFile() {
		keyboardpo.verifyFileUpload();
	}
}

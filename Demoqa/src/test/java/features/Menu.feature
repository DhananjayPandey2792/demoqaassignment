@demoqa
Feature: Menu functionality in demoqa

 Scenario: To verify menu navigation in menu page
Given i launch url "https://demoqa.com/menu/" in demoqa
	Then i navigate to big band option "Music->Jazz->Big Band"
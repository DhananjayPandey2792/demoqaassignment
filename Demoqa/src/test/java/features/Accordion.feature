@demoqa
Feature: Accordion functionality in demoqa

Scenario: To verify accordion text in accordion page
Given i launch url "https://demoqa.com/accordion/" in demoqa
  Then validate text Vivamus in section 1
  And validate text Vivamus in section 2
  And validate text Vivamus in section 3
  And validate text Vivamus in section 4
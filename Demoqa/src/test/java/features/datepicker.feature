@demoqa
Feature: Date picker functionality in demoqa

Scenario: To verify date selection in demoqa
 Given i launch url "https://demoqa.com/datepicker/" in demoqa
  When i click on date input box
   And i click on previous button
   And i select a specific date
 Then selected date "26" displayed in date input field
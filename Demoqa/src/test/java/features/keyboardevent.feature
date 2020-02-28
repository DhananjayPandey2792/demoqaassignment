@demoqa
Feature: keyboard events functionality in demoqa

 Scenario: To verify upload file in demoqa
  Given i launch url "https://demoqa.com/keyboard-events/" in demoqa
     When i click on choose file
     And click on upload button
     Then file should be upload
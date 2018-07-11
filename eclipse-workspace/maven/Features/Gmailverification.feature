
@functionaltest
Feature: Gmail Login verifications scenarios.
	@smoketest
  Scenario: Gmail login with vaild data
    Given open the firefox and open the application
	@endtoend
  Scenario: officemail login with vaild data
    When user Enter the vaild email id
	@regression
  Scenario: yahoomail login with vaild data
    Then user see the Enter the passwordpage
	@smoketest @regression 
  Scenario: ymail login with vaild data
    When user Enter the vaild password id
@endtoend @smoketest
  Scenario: facebook login with vaild data
    Then user see the inbox page
@endtoend
  Scenario: worldpress login with vaild data
    Then verify the title of the page

  Scenario: orkut login with vaild data
    Then close the browser

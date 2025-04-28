Feature: feature to test google search functionalities
	@smoketest
  Scenario: Verify if google search if functional
    Given browser is open
    And user is on google search page
    When user enters a text in search box
    And hits search box
    Then user is navigated to search result page
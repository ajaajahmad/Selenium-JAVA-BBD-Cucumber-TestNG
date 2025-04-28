# Author: Ajaaj Ahmad
# Date: 12-04-2025
# Description: N/A
@SmokeScenario
Feature: to verify login functionalities
	@smoketest
  Scenario: Verity user is able to login with valid credentials
    Given user in on login page
    When user enters username and password
    And clicks on login button
    Then user logged in and navigated to home page

  Scenario Outline: Verity user is able to login with valid credentials
    Given user in on login page
    When user enters <username> and <password>
    And clicks on login button
    Then user logged in and navigated to home page

    Examples: 
      | username | password |
      | user1    | pass1    |
      | user2    | pass2    |

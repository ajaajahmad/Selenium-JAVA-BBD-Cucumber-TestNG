Feature: To verify login functionalities

  Scenario: Check login is successful with valid user credential
    Given browser is opened
    And user is on login page
    When user enters valid username and password
    And clicks on login button
    Then user is navigated to homepage

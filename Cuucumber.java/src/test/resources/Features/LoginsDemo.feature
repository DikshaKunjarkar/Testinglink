Feature: Test login functionality

  Scenario: Check login is succesful with valid credentials
    Given browser is open
    And user is on login page
    When user enters username and password
    And user clicks on login page
    Then user is navigated to the home page

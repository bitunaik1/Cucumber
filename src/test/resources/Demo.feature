#Author
#Date
Feature: feature to test login functionality

  Scenario Outline: Check login is successful with valid credintials
    Given user is on login page
    When user enters <username> and <password>
    And click on enter
    Then user is navigated to the home page

    Examples: 
      | username | password |
      | user1    | pass1    |
      | user2    | pass2    |

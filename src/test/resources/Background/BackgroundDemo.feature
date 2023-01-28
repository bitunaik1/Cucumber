Feature: Check home page functionality

  Background: user is logged in
    Given user is in login page
    When user enters username and password
    And click on login button
    Then user is navigated to home page

  Scenario: Check logout link
    When user click on welcome link
    Then logout link is displayed

  Scenario: Verify Task link
    When click on Task link
    Then Task page is displayed

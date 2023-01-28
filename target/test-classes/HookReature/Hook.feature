Feature: Test login functionality


  Scenario: Check login is successfull with valid credintial
    Given user is in login page
    When user enters username and password
    And click enter
    Then user is navigated to homepage

  Scenario: Check login is successfull with valid credintial
    Given user is in login page
    When user enters username and password
    And click enter
    Then user is navigated to homepage

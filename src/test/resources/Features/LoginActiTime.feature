Feature: Test login functionality

  Scenario Outline: Check login is successfull with valid credintial
    When browser is open
    And user is in login page
    When user enters <username> and <password>
    And click enter
    Then user is navigated to homepage

    Examples: 
      | username | password |
      | admin    | manager  |
      | trainee  | trainee  |

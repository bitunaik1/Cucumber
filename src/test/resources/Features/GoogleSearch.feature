Feature: feature to test google search functionality

  Scenario: Validate google search is working
    Given browser is open
    And User is on google search page
    When User enters a text in search box
    And hit enter
    Then User is navigated to user result

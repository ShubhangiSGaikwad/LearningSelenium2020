Feature: Tricentis login feature
  I want to use this template for my feature file

  Scenario Outline: Tricentis login feature with multiple test data
    Given User is on Login Page
    When User Enters <username> and <password> on login page
    Then Homepage should be displayed.

    Examples: 
      | username  | password  |
      | username1 | password1 |
      | username2 | password2 |


Feature: search feature of Tricentis
  I want to use this template for my feature file

  	Scenario: To verify search scenario
    Given user is on home page
    When user search bmw in search field
    Then new window should open with search results.
     

    Scenario: Verify Search Results
    Given Search results are available
    When user click on first search result
    Then details should display
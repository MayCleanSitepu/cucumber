Feature: user search
  Scenario: validate user can search a query
    Given user is on the search page
    When user search a valid query
    Then user should be redirected to the result page
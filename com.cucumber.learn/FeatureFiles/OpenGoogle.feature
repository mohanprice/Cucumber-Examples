@All
Feature: This is to test google search
Scenario: Positive test
    Given user is entering google.co.in
    When  user is typing he search term "mohan"
    And   enters the return key
    Then  the user should see the search results
    
@Negative
Scenario: Negative test
    Given user is entering google.co.in
    When  user is typing he search term "mohan"
    And   enters the return key
    Then  the user should see the search results

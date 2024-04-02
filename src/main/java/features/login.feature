Feature: 

  Scenario: 
    Given login page must display
    When enter correct userid and correct password
    And click on login
    Then home page must dsiplay

  Scenario: 
    Given login page must display
    When enter wrong userid and correct password
    And click on login
    Then home page must not dsiplay

  Scenario: 
    Given login page must display
    When enter correct userid and wrong password
    And click on login
    Then home page must not dsiplay

  Scenario: 
    Given login page must display
    When fill blank userid and password
    And click on login
    Then home page must not dsiplay

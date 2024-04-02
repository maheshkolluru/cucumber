Feature: 

  Scenario: 
    Given login page must be display
    When enter the following fields
      | maheeesh | roooot |
      | kanna    | root  |
      | admin    | rooot |
    When click on in login
    Then error message must display in login page

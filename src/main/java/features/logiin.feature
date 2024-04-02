Feature: 

  Scenario Outline: 
    Given login page should display
    When enter "<username>" in user field
    And enter "<password>" in passwordfield and click on login
    Then failed error message must display

    Examples: 
      | username | password |
      | mahesh   |   123456 |
      | kanna    | root     |
      | admin    | roott    |

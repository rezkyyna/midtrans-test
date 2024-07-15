Feature: Activity

#TCC.JS.001
  Scenario Outline: Invalid Login
    Given User enter URL Event
    When input username "<username>"
    And input password "<password>"
    And click button submit
    Then validate login page "<statusTest>"

    Examples: Data table Login
      | username    | password | statusTest       |
      | ferinugraha | 23432    | invalid password |
      | ferinugraha | a        | success          |


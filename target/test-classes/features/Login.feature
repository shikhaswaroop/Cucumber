Feature: Login Feature

@Positive
  Scenario Outline: User should be able to login with valid credentials
    Given I enter the URL
    When I enter the  valid "<username>" and "<password>"
    And I click on Login
    Then I am able to login correctly
    
 Examples:
| username | password |
| mngr322966 |ysAhadE|
   

@Negative
  Scenario Outline: Popup message should be displayed on login with invalid credentials
    Given I enter the URL
    When I enter the  invalid "<username>" and valid "<password>"
    And I click on Login
    Then Error message popup is displayed
   

Examples:
| username | password |
| mngr322964| ysAhadE |

@Negative
  Scenario Outline: Popup message should be displayed on login with invalid credentials
    Given I enter the URL
    When I enter the  valid "<username>" and invalid "<password>"
    And I click on Login
    Then Error message popup is displayed
   

Examples:
| username | password |
| mngr322966 | Pass     |

@Negative
  Scenario Outline: Popup message should be displayed on login with invalid credentials
    Given I enter the URL
    When I enter the  invalid "<username>" and invalid "<password>"
    And I click on Login
    Then Error message popup is displayed
   

Examples:
| username | password |
| Shikha   | Pass     |
    

Feature: To validate login function
 

Scenario: To validate login function with invaild username and valid password
    Given User launch the brower and navigates to hotel booking app
    When  User enters the credentials in hotel booking app
    When  User clicks the login button
    Then  User validates the error mesaage
    
Scenario Outline: To validate login function with combination of all credentials
    Given User launch the brower and navigates to hotel booking app
    When  User enters the "<userName>" and "<password>" in hotel booking app
    When  User clicks the login button
    Then  User validates the error mesaage
    
    Examples:
    
    | userName | password |
    |6665656|26569|
    |dsfdss|4446565-|
    |helo|656565|
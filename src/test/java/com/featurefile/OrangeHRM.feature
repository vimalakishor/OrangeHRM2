
@tag
Feature: Verify Orange HRM Application
  

  @tag1
  Scenario Outline: To verify Admin Creation Functionality
    Given User loggin the application
    When User Click the Admin module
    And User enter all the mandatory details
    When User enter username "<uName>"
    And Password and confirm password is "<pwd>"
    And User click on save button
    Then Verify admin created successfully
    Examples:
    | uName  | pwd      |
    | Admin1 | Admin2023|
    | Admin2 | Admin2024|
    

 

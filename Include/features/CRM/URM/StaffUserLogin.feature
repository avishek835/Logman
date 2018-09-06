#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: Staff user login.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@StaffUserLogin
Feature: Staff user login feature
  As a staff I want to login in logman crm portal by the provided user id and password

  @Valid
  Scenario Outline: Login with the valid crediantial
    Given I want to open the logman CRM protal in the browser
    When I click the login button 
    And I enter email<avistaff3@mailinator.com> and password<123456>
    And I click on Login button
    Then I should be login successfully and being redirected to dashboard

    Examples: 
      | email  | pass | status  |
      | avistaff3@mailinator.com | 123456 | success |
      | avistaff4@mailinator.com | 123456 | Fail    |
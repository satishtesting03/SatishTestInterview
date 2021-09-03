@UI
Feature: Registration
  As a user
  I want to be able to complete the registration
  So that the user can be created

  Scenario: New User Registration
    Given I am on the Regsitartion page
    When i provide a email
    And Click on Create an account button
    And I complete the form
    Then the account is created
 

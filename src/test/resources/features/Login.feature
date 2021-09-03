@UI
Feature: Login
  As a user
  I want to be able to login
  So that I can see my account

  Scenario: Valiadte the user is logged in
    Given I am on Login page
    When I login in with user "satish.testing03@gmail.com" and Passowrd "Test0123"
    And select Sign in button
    Then user is succesfuuly Logged in

Feature: CartCheckout
  As a user
  I want to be able to add items in the cart
  So that I can purchase the items

  Background:
    Given I am on Login page
    When I login in with user "satish.testing03@gmail.com" and Passowrd "Test0123"
    And select Sign in button
    Then user is succesfuuly Logged in

  Scenario: Search for the most expensive dress and add to the cart
    When I navigate to the page "Dresses"
    #And I sort by "Price: Highest first"
    And I select the Highest priced dress from the list
    And I select Add item to the cart
    Then my item is added to the cart

  Scenario: Verify the item is still in the cart once the user is logged in
    Then item is still in the cart



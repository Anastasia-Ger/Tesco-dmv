Feature: Basket is present on the home page

  Scenario: The Tesco home page loads
  Given I am on the home page
  When I check the Basket title
  Then I see the Basket title
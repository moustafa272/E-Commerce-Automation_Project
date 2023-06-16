Feature: Different Tags|| user could select different tags
  Background:
    Given user click on login button from home page
    And I am on the login page
    When I enter Email"tes7788@gmail.com" and password"Qwert6613"
    And click the login button
    Then I should be redirected to the home page
    Scenario: User Add Items to watchlist And Assure
    And user go to Book from Books Category
    And User add Item to WatchList
    And User click on exit message
    And User go to watchlist
    And click on add to cart
    And Verify item Added to cart


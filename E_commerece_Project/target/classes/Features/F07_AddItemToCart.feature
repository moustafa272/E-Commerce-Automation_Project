Feature: User Can Add Item to Card
  Background:
    Given user click on login button from home page
    And I am on the login page
    When I enter Email"tes7788@gmail.com" and password"Qwert6613"
    And click the login button
    Then I should be redirected to the home page
  Scenario: User Select Item from Any Category And make Assurence of Adding
    And User Click on Item Button
    And User should Add Product Details Processor"2.2 GHz Intel Pentium Dual-Core E2200" RAM"2 GB" HDD"320 GB" OS"Vista Home [+$50.00]" Software"Microsoft Office [+$50.00]" and Navigate to Shopping Cart and Check all shopping carts Elements

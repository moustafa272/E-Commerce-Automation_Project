@Runner
Feature: Switch Currency
  Background:
    Given user click on login button from home page
    And I am on the login page
    When I enter Email"tes7788@gmail.com" and password"Qwert6613"
    And click the login button
    Then I should be redirected to the home page
  Scenario: User Can Switch Currency and notice Changes
    And User click on Euro From DropDown Menu
    Then Assurance That Salary converted to Euro
    And User click on Dollar From DropDown Menu
    Then Assurance That Salary converted to Dollar

Feature: Filter with Color|| User could filter with color
  Background:
    Given user click on login button from home page
    And I am on the login page
    When I enter Email"tes7788@gmail.com" and password"Qwert6613"
    And click the login button
    Then I should be redirected to the home page
  Scenario: user could filter with color
    And user select shoes from apparel
    And filter by Red color

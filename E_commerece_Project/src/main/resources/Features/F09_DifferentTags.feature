Feature: Different Tags|| user could select different tags
  Background:
    Given user click on login button from home page
    And I am on the login page
    When I enter Email"tes7788@gmail.com" and password"Qwert6613"
    And click the login button
    Then I should be redirected to the home page
  Scenario: user could select different tags on the site
    Given navigate to digital downloads
    When select cool from popular tags
    And select game from popular tags
    And select computer from popular tags
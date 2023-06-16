@Runner
Feature: Login Page As a user I want to be able to login So that I can access my account

  Scenario: Successful Login

    Given user click on login button from home page
    And I am on the login page
    When I enter Email"tes7788@gmail.com" and password"Qwert6613"
    And click the login button
    Then I should be redirected to the home page

  Scenario: Invalid Login

    Given user click on login button from home page
    And I am on the login page
    When I enter Email"test9778@fil.com" and password"Qwrt661hfg"
    And click the login button
    Then I should see an error message
    And remain on the login page
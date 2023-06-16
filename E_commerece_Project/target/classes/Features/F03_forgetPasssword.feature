@Runner
Feature: forgot password || User Enter Email and forgot password
  Background:
    Given user click on login button from home page
    And I am on the login page


  Scenario: user should get option when click on forget password
    And user click on forget password
    And user enter email address
    And user click on recover button
    Then user to reset your password



@Runner
Feature: User search on Items
  Background:
    Given user click on login button from home page
    And I am on the login page
    When I enter Email"tes7788@gmail.com" and password"Qwert6613"
    And click the login button
    Then I should be redirected to the home page
  Scenario: Empty Search Field || user left search field Empty
    When user click on search field
    And user click on button search
    Then user Get Failure Message


  Scenario Outline: user who logged can search for any item
    When user click on search field
    And user enter "<search_word>" to search
    Then user get search item and related items

    Examples:
      | search_word |
      | htc         |
      | Apple       |
      | nike        |
  Scenario Outline: User Search for specify Item
    When user click on search field
    And user enter "<search_word>" to search
    Then user get "<search_word>" only

    Examples:
      | search_word |
      | M8_HTC_5L   |
      | AP_MBP_13   |
      | NK_FRC_RS   |

@Runner
Feature: User search on Items
  Background:
    Given user click on login button from home page
    And I am on the login page
    When I enter Email"tes7788@gmail.com" and password"Qwert6613"
    And click the login button
    Then I should be redirected to the home page
  Scenario: User Choose From Categories
   When user move to Computers and can click on Desktops and Notebooks and software
   And User move to Electronics and can click on camera&photo and cellPhones and Others
   And User move to Apparel and can click on Clothing and Shoes and Accessorirs
   And User Click on Digital Downloads
  And User Click on Books
  And User Click on Jewelry
  And User Click on Gift Cards

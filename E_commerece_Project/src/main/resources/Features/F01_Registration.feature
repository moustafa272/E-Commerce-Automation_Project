@Runner
Feature: Registeration|| user could register to the site
  Scenario: user could register entering valid data
    And user navigate to home page
    And user click register
    When user fills gender"Male" fname"Mostafa" lname"Saber" day"27" month"7" year"1998" email"tes7788@gmail.com" valid data
    And user fills valid password "Qwert6613" confirm "Qwert6613"
    And user clicks register button
    Then success message is displayed


#Feature: Registeration|| user couldn't register to the site

 # Scenario: user could register entering invalid data

  #  And user navigate to home page
   # And user click register
    #When user fills gender"female" fname"Nada" lname"Magdi" day"10" month"9" year"1998" email"test9778@gmail.com" valid data
    #And user fills valid password "Qwert6613" confirm "Qwert6613"
    #And user clicks register button
    #Then failure message is displayed
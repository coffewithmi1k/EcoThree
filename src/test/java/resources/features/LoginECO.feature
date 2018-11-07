Feature: EcoLogin
  Scenario: Check Website is ON
    Given user opens ECOWeb
    Then verifies website is opened

Scenario: Check User is able to log in successfully
  Given user opens ECOWeb
  And clicks login button
  And user inserts email
  And user clicks next button
  And user inserts password
  And user clicks Sign In
  And user clicks StaySignedIn
  Then verifies user is logged In successfully
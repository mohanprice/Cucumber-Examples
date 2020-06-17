Feature: To test Login feature
Scenario: By Entering into the  Orange HRM login website
     Given User Enters into the login page of HRM
     When User gives username as "Admin" and password as "admin123"
     And  User press the Login button 
     Then HRM Welcome Page Should be Displayed at last
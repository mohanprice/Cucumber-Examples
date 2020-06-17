Feature: To test HRM Login WebSite
Scenario: Enter Into HRM login WebSite
     Given User should enter Login page
     When User gives valid Crediatials like
          |Admin |admin123|
     And  user gives a press to login button
     Then It should display the HRM HomePage
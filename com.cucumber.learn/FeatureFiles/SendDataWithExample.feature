Feature: Test Orange HRM login page
Scenario Outline: User have test HRM login site
    Given User enters Login Page
    When User gives "<username>" and "<password>"
    And Click login buton    
    
    Examples:
    |username|password|
    |Admin|admin123|
    |mohan|price123|
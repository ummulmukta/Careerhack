@examTest
Feature: Login feature Test
Scenario Outline:User able to Signin successfully  
    
    Given User able Go to home page
    When   Click on Signinbutton
    And   put user as "<username>" and password as "<Password>"
    And   Click on Submit button 
    Then  login should be successfully done 

    Examples: 
      | username                | Password|
      |login_practice@yahoo.com | Sony1983|
      |farhansf2@gmail.com|anu1234|
     
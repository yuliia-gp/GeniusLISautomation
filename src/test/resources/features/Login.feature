#Author: yuliia@geniusplaza.com


Feature: LogIn
Background: 
Given User is on the GeniusLIS signUp page
@smoke
  Scenario: SignUp
  
    When User signs up
    Then User should be successfully sign in
    
 
    
 @progression
   Scenario: Login
 
   When User is logs in
   Then User should be successfully log in

  


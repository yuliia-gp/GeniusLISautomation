#Author: yuliia@geniuseplaza.com
Feature: Sign Up Scenarios
  Description: This feature file contains scenarios which test the Sign Up functionality for the Genius LIS application for
  
  Backround: 
  Given User is on the GeniusLIS Home Page


  Scenario: User Sign Up -  Teacher
    When User signs up as a Teacher
    Then User should be successfully sign in
 @progression
  Scenario: User Sign Up -  School Staff
    When User signs up as a School Staff
    Then User should be successfully sign in

  Scenario: User Sign Up -  Dictrict Staff
    When User signs up as a Dictrict Staff
    Then User should be successfully sign in

  Scenario: User Sign Up -  College Staff/University
    When User signs up as a College/University Staff
    Then User should be successfully sign in

#Author: yuliia@geniusplaza.com
Feature: Login
  Description:  This feature file contains scenarios which tests Genius LIS login functionality

  Background: 
   Given User is on the GeniusLIS Home Page


  @test1
  Scenario: School Staff Login
    When a School Staff User logs in with username "alyssadirector1" and password "12345678"
    #Then the School Staff User should be successfully logged in and sees "My Classes"

  
  Scenario: Teacher Login
    When a Teacher User logs in with username "TeacherSt" and password "123123"
    Then the Teacher should be successfully log in and sees "My Classes"

  
  Scenario: College/University Staff Login
    When a College/University User logs in with username "TeacherSt" and password "123123"
    Then the College/University User should be successfully logged in and sees "My Classes"

  
  Scenario: Dictrict Staff Login
    When a Disctict Staff User logs in with username "Districttest" and password "123123"
    Then the District Staff User should be successfully logged in and sees "My District"

#Author: yuliia@geniusplaza.com


@regression
Feature: Profile

  Background: 
    Given User is on the GeniusLIS signUp page
    And User is logs in

  Scenario: Change Profile
    When User click on Profile
    Then User is able to edit profile
    And User save changes

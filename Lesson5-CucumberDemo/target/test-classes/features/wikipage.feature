@all
Feature: Test Wiki page on browser

@functional
Scenario: Test Create account on Wiki page
Given User is on Main page
Then User Enters username
And User Enters password

@functional @login
Scenario: Test Login link on Wiki page
		Given User is on Main Page
    When User clicks on Login link
    Then User clicks on checkbox on login page
    Then user clicks on Forgot your password? link

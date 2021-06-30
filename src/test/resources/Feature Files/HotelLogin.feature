@login
Feature: To validate the login functionality

Background: 
    Given User is in adactinhotelapp login page
    
Scenario Outline: To validate login using invalid credentials
When User enters invalid "<username>" and "<password>"
And click login button
Then User must validate the results based on "<combination>"

Examples: 
  
  |username|password |combination
  |sql     |sql@123  |negative
  |java    |java@12  |negative
  |python  |python@12|negative
  |Ezhilpraga|XGHXR5 |positive

  
  Scenario: To validate login without entering required credentials.
  When click login button
  Then User must be in invalid credentials page
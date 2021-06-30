Feature: To validate the login functionality

Background: 
    Given User is in adactinhotelapp login page
   
   #Two dimensional with header (MAP)
Scenario: To validate login using invalid credentials
When User enters invalid username and password
|username|password|
|greens|gr123|
|harry|potter12|
|famous|lock12|

And click login button
Then User must be in invalid  page

Scenario: To validate the login without entering credentials
When click login button
  Then User must be in invalid credentials page
 @search
 Feature: 

Background: 
Given User is in adactinhotelapp login page

Scenario Outline: To Validate the search page in adactinhotelapp
When user enter valid "<username>" and "<password>".
And user click login button.
And user select and enters location,hotel,room type,number of rooms,"<Check in date>","<check out date>",adults per room,children per room.
And user click search button.
And user click the radio button
And user click continue button.
And user book the hotel by entering  the details "<firstname>","<lastname>","<address>","<creditno>","<cvvno>",creditcardtype,month,year
And user click book now button
Then user must be in select page
And user must be in booking hotel page.
And user will get order id




Examples: 

|username |password      |Check in date|Check out date|firstname|lastname|address            |creditno    |cvvno|
|Ezhilpraga|XGHXR5        |26/06/2021   |28/06/2021   |Ezhil    |Maha    |chennai            |1234657890123456|123|   
 
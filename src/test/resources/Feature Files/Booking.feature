@booking
Feature:

Background: 

Given User is in adactinhotelapp login page


Scenario Outline: 
When user enter valid username and password.
And user click login button.
And user select and enters location,hotel,room type,number of rooms,Check in date,check out date,adults per room,children per room.
And user click search button.
And user click the radio button
And user click continue button.
And user book the hotel by entering  the details "<firstname>","<lastname>","<address>","<creditno>","<cvvno>",creditcardtype,expirydate
And user click book now button
Then user will get order id

Examples: 

|firstname|lastname|address            |creditcardno    |cvvno|
|Ezhil    |Maha    |kala street,chennai|1234657890123456|123|   


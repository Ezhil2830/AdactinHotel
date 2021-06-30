$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature%20Files/HotelLogin.feature");
formatter.feature({
  "name": "To validate the login functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.scenarioOutline({
  "name": "To validate login using invalid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User enters invalid \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "click login button",
  "keyword": "And "
});
formatter.step({
  "name": "User must validate the results based on \"\u003ccombination\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "sql",
        "sql@123"
      ]
    },
    {
      "cells": [
        "java",
        "java@12"
      ]
    },
    {
      "cells": [
        "python",
        "python@12"
      ]
    },
    {
      "cells": [
        "Ezhilpraga",
        "XGHXR5"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is in adactinhotelapp login page",
  "keyword": "Given "
});
formatter.match({
  "location": "HotelStepDefinition.user_is_in_adactinhotelapp_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate login using invalid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.step({
  "name": "User enters invalid \"sql\" and \"sql@123\"",
  "keyword": "When "
});
formatter.match({
  "location": "HotelStepDefinition.user_enters_invalid_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click login button",
  "keyword": "And "
});
formatter.match({
  "location": "HotelStepDefinition.click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User must validate the results based on \"\u003ccombination\u003e\"",
  "keyword": "Then "
});
formatter.match({
  "location": "HotelStepDefinition.user_must_validate_the_results_based_on(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is in adactinhotelapp login page",
  "keyword": "Given "
});
formatter.match({
  "location": "HotelStepDefinition.user_is_in_adactinhotelapp_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate login using invalid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.step({
  "name": "User enters invalid \"java\" and \"java@12\"",
  "keyword": "When "
});
formatter.match({
  "location": "HotelStepDefinition.user_enters_invalid_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click login button",
  "keyword": "And "
});
formatter.match({
  "location": "HotelStepDefinition.click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User must validate the results based on \"\u003ccombination\u003e\"",
  "keyword": "Then "
});
formatter.match({
  "location": "HotelStepDefinition.user_must_validate_the_results_based_on(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is in adactinhotelapp login page",
  "keyword": "Given "
});
formatter.match({
  "location": "HotelStepDefinition.user_is_in_adactinhotelapp_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate login using invalid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.step({
  "name": "User enters invalid \"python\" and \"python@12\"",
  "keyword": "When "
});
formatter.match({
  "location": "HotelStepDefinition.user_enters_invalid_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click login button",
  "keyword": "And "
});
formatter.match({
  "location": "HotelStepDefinition.click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User must validate the results based on \"\u003ccombination\u003e\"",
  "keyword": "Then "
});
formatter.match({
  "location": "HotelStepDefinition.user_must_validate_the_results_based_on(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is in adactinhotelapp login page",
  "keyword": "Given "
});
formatter.match({
  "location": "HotelStepDefinition.user_is_in_adactinhotelapp_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate login using invalid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.step({
  "name": "User enters invalid \"Ezhilpraga\" and \"XGHXR5\"",
  "keyword": "When "
});
formatter.match({
  "location": "HotelStepDefinition.user_enters_invalid_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click login button",
  "keyword": "And "
});
formatter.match({
  "location": "HotelStepDefinition.click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User must validate the results based on \"\u003ccombination\u003e\"",
  "keyword": "Then "
});
formatter.match({
  "location": "HotelStepDefinition.user_must_validate_the_results_based_on(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is in adactinhotelapp login page",
  "keyword": "Given "
});
formatter.match({
  "location": "HotelStepDefinition.user_is_in_adactinhotelapp_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate login without entering required credentials.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.step({
  "name": "click login button",
  "keyword": "When "
});
formatter.match({
  "location": "HotelStepDefinition.click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User must be in invalid credentials page",
  "keyword": "Then "
});
formatter.match({
  "location": "HotelStepDefinition.user_must_be_in_invalid_credentials_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Feature%20Files/Search.feature");
formatter.feature({
  "name": "",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@search"
    }
  ]
});
formatter.scenarioOutline({
  "name": "To Validate the search page in adactinhotelapp",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user enter valid \"\u003cusername\u003e\" and \"\u003cpassword\u003e\".",
  "keyword": "When "
});
formatter.step({
  "name": "user click login button.",
  "keyword": "And "
});
formatter.step({
  "name": "user select and enters location,hotel,room type,number of rooms,\"\u003cCheck in date\u003e\",\"\u003ccheck out date\u003e\",adults per room,children per room.",
  "keyword": "And "
});
formatter.step({
  "name": "user click search button.",
  "keyword": "And "
});
formatter.step({
  "name": "user click the radio button",
  "keyword": "And "
});
formatter.step({
  "name": "user click continue button.",
  "keyword": "And "
});
formatter.step({
  "name": "user book the hotel by entering  the details \"\u003cfirstname\u003e\",\"\u003clastname\u003e\",\"\u003caddress\u003e\",\"\u003ccreditno\u003e\",\"\u003ccvvno\u003e\",creditcardtype,month,year",
  "keyword": "And "
});
formatter.step({
  "name": "user click book now button",
  "keyword": "And "
});
formatter.step({
  "name": "user must be in select page",
  "keyword": "Then "
});
formatter.step({
  "name": "user must be in booking hotel page.",
  "keyword": "And "
});
formatter.step({
  "name": "user will get order id",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "Check in date",
        "Check out date",
        "firstname",
        "lastname",
        "address",
        "creditno",
        "cvvno"
      ]
    },
    {
      "cells": [
        "Ezhilpraga",
        "XGHXR5",
        "26/06/2021",
        "28/06/2021",
        "Ezhil",
        "Maha",
        "chennai",
        "1234657890123456",
        "123"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is in adactinhotelapp login page",
  "keyword": "Given "
});
formatter.match({
  "location": "HotelStepDefinition.user_is_in_adactinhotelapp_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To Validate the search page in adactinhotelapp",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@search"
    }
  ]
});
formatter.step({
  "name": "user enter valid \"Ezhilpraga\" and \"XGHXR5\".",
  "keyword": "When "
});
formatter.match({
  "location": "SearchStepD.user_enter_valid_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click login button.",
  "keyword": "And "
});
formatter.match({
  "location": "SearchStepD.user_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select and enters location,hotel,room type,number of rooms,\"26/06/2021\",\"\u003ccheck out date\u003e\",adults per room,children per room.",
  "keyword": "And "
});
formatter.match({
  "location": "SearchStepD.user_select_and_enters_location_hotel_room_type_number_of_rooms_adults_per_room_children_per_room(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click search button.",
  "keyword": "And "
});
formatter.match({
  "location": "SearchStepD.user_click_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click the radio button",
  "keyword": "And "
});
formatter.match({
  "location": "SearchStepD.user_click_the_radio_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click continue button.",
  "keyword": "And "
});
formatter.match({
  "location": "SearchStepD.user_click_continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user book the hotel by entering  the details \"Ezhil\",\"Maha\",\"chennai\",\"1234657890123456\",\"123\",creditcardtype,month,year",
  "keyword": "And "
});
formatter.match({
  "location": "SearchStepD.user_book_the_hotel_by_entering_the_details_creditcardtype_month_year(String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click book now button",
  "keyword": "And "
});
formatter.match({
  "location": "SearchStepD.user_click_book_now_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user must be in select page",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchStepD.user_must_be_in_select_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user must be in booking hotel page.",
  "keyword": "And "
});
formatter.match({
  "location": "SearchStepD.user_must_be_in_booking_hotel_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user will get order id",
  "keyword": "And "
});
formatter.match({
  "location": "SearchStepD.user_will_get_order_id()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
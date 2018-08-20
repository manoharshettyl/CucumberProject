$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("End2endTests.feature");
formatter.feature({
  "line": 1,
  "name": "Automate E2E tests",
  "description": "Description: To Test E2E Scenarios",
  "id": "automate-e2e-tests",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Customer placing an order to purchase",
  "description": "",
  "id": "automate-e2e-tests;customer-placing-an-order-to-purchase",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "he searches for \"dress\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "choose to buy first item",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "moves to checkout from minicart",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "enter \"\u003ccustomer\u003e\" Personal details on checkoutpage",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "select same delivery address",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "select payment method as \"CheckPayment\" payment",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "place the order",
  "keyword": "And "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "automate-e2e-tests;customer-placing-an-order-to-purchase;",
  "rows": [
    {
      "cells": [
        "customer"
      ],
      "line": 15,
      "id": "automate-e2e-tests;customer-placing-an-order-to-purchase;;1"
    },
    {
      "cells": [
        "Lakshay"
      ],
      "line": 16,
      "id": "automate-e2e-tests;customer-placing-an-order-to-purchase;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3568355354,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Customer placing an order to purchase",
  "description": "",
  "id": "automate-e2e-tests;customer-placing-an-order-to-purchase;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "he searches for \"dress\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "choose to buy first item",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "moves to checkout from minicart",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "enter \"Lakshay\" Personal details on checkoutpage",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "select same delivery address",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "select payment method as \"CheckPayment\" payment",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "place the order",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageSteps.user_is_on_home_page()"
});
formatter.result({
  "duration": 23244853573,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dress",
      "offset": 17
    }
  ],
  "location": "HomePageSteps.he_searches_for(String)"
});
formatter.result({
  "duration": 9878948436,
  "status": "passed"
});
formatter.match({
  "location": "ProductListingPageSteps.choose_to_buy_first_item()"
});
formatter.result({
  "duration": 5603893649,
  "status": "passed"
});
formatter.match({
  "location": "CartPageSteps.moves_to_checkout_from_minicart()"
});
formatter.result({
  "duration": 19018030653,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Lakshay",
      "offset": 7
    }
  ],
  "location": "CheckoutPageSteps.enter_Personal_details_on_checkoutpage(String)"
});
formatter.result({
  "duration": 42145205,
  "error_message": "java.lang.RuntimeException: Test Data Resouce path not specified in config file\r\n\tat dataProvider.ConfigFileReader.getTestDataResourcePath(ConfigFileReader.java:120)\r\n\tat dataProvider.JsonDataReader.\u003cinit\u003e(JsonDataReader.java:17)\r\n\tat managers.FileReaderManager.getJsonReader(FileReaderManager.java:31)\r\n\tat stepDefinitions.CheckoutPageSteps.enter_Personal_details_on_checkoutpage(CheckoutPageSteps.java:29)\r\n\tat ✽.And enter \"Lakshay\" Personal details on checkoutpage(End2endTests.feature:9)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "CheckoutPageSteps.select_same_delivery_address()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "CheckPayment",
      "offset": 26
    }
  ],
  "location": "CheckoutPageSteps.select_payment_method_as_payment(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CheckoutPageSteps.place_the_order()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 449858452,
  "status": "passed"
});
formatter.after({
  "duration": 649296915,
  "status": "passed"
});
});
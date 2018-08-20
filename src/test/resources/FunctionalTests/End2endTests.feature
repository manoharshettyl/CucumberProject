Feature: Automate E2E tests
Description: To Test E2E Scenarios

Scenario Outline: Customer placing an order to purchase 
Given user is on home page 
When he searches for "dress"
And choose to buy first item
And moves to checkout from minicart 
And enter "<customer>" Personal details on checkoutpage 
And select same delivery address 
And select payment method as "CheckPayment" payment
And place the order

Examples:
	|customer|
	|Lakshay|
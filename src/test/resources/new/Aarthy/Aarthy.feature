Feature: Test Feature

Scenario: verify email is sent in add cart screen for any product

Given user can able to enter into home page
And user can login with valid credentials
#1
Scenario: verify computer product is ordered under given process

Given user can able to enter into home page
And user can login with valid credentials
And user navigates to computer page and select desktop window
And user check the specifications
And user select ram hdd and hdd then click add to cart 
When user checkout the product 
Then product is ordered

#2
Scenario: verify the ram dropdown is whether selected or not

Given user can able to enter into home page
And user can login with valid credentials
And user navigates to computer page and select desktop window
When user checks the dropdown whether able to select or not
And user completed the checking process of the page
Then user ready to order the product

#3
Scenario: verify the product search functionality

Given user can able to enter into home page
And user can login with valid credentials
And user verify that after entering search text and clicking on search icon, the search should work
And user should be able to search based on product name,brand name or product sepcification
When user verify that sorting options should be present on search results page
And user checks the number of search results displayed on one page
Then user should be performed search in different categories for Books, Accessories, Gadgets etc

#4
Scenario: verify the product details page

Given user can able to enter into home page
And user can login with valid credentials
And user verify that the images of product are displayed correctly or not 
And user can verify the price of the product is displayed or not 
And user verify the product reviews are mentioned or not
And user should verify that the product specifications and information about in-stock/out-stock are displayed
And user can check the seller ratings should be displayed
And user verify that the variations product is displayed
When user verify the shipping information about product is displayed
And user verify that payment options are mentioned on product page
Then user verify the product suggestions related to searched products should be displayed or not

#5
Scenario: verify the product details page

Given user can able to enter into home page
And user can login with valid credentials
And user clicks the add to cart, then the product should be moved to cart
And user is able to continue shopping after adding items to cart
And user verify the quantity of item should be incremented if user adds same item in cart again
And user verify the total amount of items in cart is displayed to user
When user should not be able to add items in cart beyond a certain limit
And user clicks on remove from cart button the item should be removed from cart 
Then user check the items in cart should be present if user logs out and logs in again

#6
Scenario: verify the checkout page

Given user can able to enter into home page
And user can login with valid credentials
And user verify that the payments options available to order should be displayed at checkout
And user verify the delivery details of items should be displayed at checkout
When user should get oerder details by message or email
And user details should be displayed as per given by the term
Then user should be directed to home page after checkout

#7
Scenario: verify the payment page

Given user can able to enter into home page
And user can login with valid credentials
And user payments options should be displayed such as debit card, credit card, net banking etc
And user is not registered then payment should be done as guest user
When user should be provided with an option to save the payment method
And user verify that session should be timed out if payment page is not done for a certain time
Then user details should be displayed on payment page for the registered customers


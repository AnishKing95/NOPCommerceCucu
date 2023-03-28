Feature: Test Feature
Scenario: verify email is sent in add cart screen for any product
Given user can able to enter into home page
And user can login with valid credentials

Scenario: verify user can able to handle Apparel bar dropdown and select required  product
Given user can able to enter into home page
And user can login with valid credentials
And check user can select all products in Apparel bar
When  user select required product in Apparel bar
Then check it navigate to the selected accessories page

Scenario: Verify user can able to handle dropdown in accessories page
Given user can able to enter into home page
And user can login with valid credentials
And check user can handle and select dropdown of sortby and diplay
When user select required option in sortby and display 
Then check the selected option is changed in the accessories page

Scenario:  Verify user can change the view mode option
Given user can able to enter into home page
And user can login with valid credentials
When user select the required view type
Then check the slected option is chaged in the product page

Scenario: Verify user can not put the product in add to card without selecting size 
Given user can able to enter into home page
And user can login with valid credentials
And user select the add to card under the required product in accesories page
And check please select size warring message come 
When select the size  
Then check the product can be add to card

Scenario: Verify user can change the product quantity
Given user can able to enter into home page
And user can login with valid credentials
And user click enter the quantity icon
When enter a value 
Then it should displayed in the icon



Scenario: Verify user can add product to wish list
Given user can able to enter into home page
And user can login with valid credentials
When user select the Add to wish list
Then check it is added in wish list 


Scenario: Verify user can addcard product from wishlist
Given user can able to enter into home page
And user can login with valid credentials
And user enter into wishlist
And click add to card button
And no product selected to add to card alert message come
When select the required product 
And select add to card
Then check the product is added in add to card 

Scenario: Verify  user can hand and select gift warpping dropdown
Given user can able to enter into home page
And user can login with valid credentials
When user select gift wrapping icon
Then check user can change the dropdown values

Scenario: Verify user can enter value in Discount code box
Given user can able to enter into home page
And user can login with valid credentials
When user enter values in the discount code box 
Then check the  enter value is displayed
 


Scenario: Verify user can enter value in gift card  box
Given user can able to enter into home page
And user can login with valid credentials
When user enter values in the gift card box 
Then check the  enter value is displayed

Scenario: Verify user can click checkout
Given user can able to enter into home page
And user can login with valid credentials
And user click checkout button
And check Tearms of service alert come 
When select the terms of service icon 
Then Check the checkout is navigating to next page 


















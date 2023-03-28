Feature: Test Feature
Scenario: verify email is sent in add cart screen for any product
Given user can able to enter navigate home page
And user can login with valid credentials
Then user should be navigate to home page


Scenario: will enter the homepage
When user  handle to a  dropdown on electronics
And user select on camera & photo


Scenario: nopcommerce camera models page
When user slected on nikan D5500 DSLR model
And user navigate to nikon DSLR model page 

Scenario: nopcommmerce Nikon D5500 page
When user scroll down to element on product tags 
And user decided on camera colours 


Scenario: nopcommmerce Nikon D5500 colour choosing page
When user get select on red colour
And user add to addcart list
Then user check on addcart product


Scenario: nopcommmerce go to shoppingcart page
When user select on go cart 
And user navigate to shoppingcart page  

Scenario: nopcommmerce shopping cartpage
And scroll down to element on information
And user handle to drop down on gift wapper
And user select on yes in gift waper
And user enter on valid coupen code
And user enter on valid giftcart code
And user select on all terms and condition to select on agree
When user select on checkout button



Scenario: nopcommmerce navigate to register billing address
Given user can select on our country name select
And user can select to our state
And user should enter on your city name
And user can enter on our address
And user then recheck on your address same
And user enter to our ohone number 
And user passed on fax number 
When user to select on continue button



Scenario: nopcommmerce navigate to shipping method page
When user navigate on next page
And user select on continue



Scenario: nopcommmerce navigate to shipping payment page
When user select to payment methods
And user select on payment informations
And user  scroll down to element on recent viewed products
And user enter on confirm ordered

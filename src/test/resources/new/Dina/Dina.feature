Feature: Test Feature
Scenario: verify the dropdowns in electronics
#Given user can able to enter into home page
#And user can login with valid credentials
#And user can touch the electronis
#When user handled dropdowns to selected
#Then verify user can hanble all dropdown in the electronics icon


#1
Scenario: verify user can select electronics and navigate to camera & photo 
Given user can able to enter into home page
And user can login with valid credentials
And user navigates to electronic page 
When user select a camera & photo
Then check it navigate to selected camera & photo page

#2
Scenario: verify the dropdowns in sort by and display
Given user can able to enter into home page
And user can login with valid credentials
And user can handle to all dropdowns in sort by
When user  select on name:z to a
And user change product order 
Then check the selected value changed in the sort by tab

#3
Scenario: verify user can nagivate to Nikon D5500 model page
Given user can able to enter into home page
And user can login with valid credentials
And user choosing a camera model
When user select the  nikan D5500 DSLR model
Then check the selected product navigate to the nikan model page

#4
Scenario: verify user can select on Addcart a product
Given user can able to enter into home page
And user can login with valid credentials
And user enter  value added in product quantity 
When user select the add cart button
And user go to check on shopping cart 
Then verify user go to addcart product has present or not in shoppingcart page

#5
Scenario: verify user can  handle to gift wrapping dropdowns in shoppping page
Given user can able to enter into home page
And user can login with valid credentials
And user can access to all dropdowns
When user select the yes button
And user change the value present
Then verify user select on values yes or no


#6
Scenario: verify user can not select checkout without clicking terms of service
Given user can able to enter into home page
And user can login with valid credentials
And user see on total cost
When user select on checkout button
Then check the terms of services warning displayed

#7
Scenario: verify user can select checkout after clicking terms of service
Given user can able to enter into home page
And user can login with valid credentials
And user select on terms of service icon 
When user select on shoppingcart checkout button
Then product is check out and navigate to billing page

#8
Scenario: verify user can select continue button for billing address without values
Given user can able to enter into home page
And user can login with valid credentials
And user can not select billing adresss 
When user to select a continue button
Then check on your cart is empty alert message displayed


#9
Scenario: verify user can enter the billing details
Given user can able to enter into home page
And user can login with valid credentials
And user can enter valid billing details
When user select a continue button
Then verify user entered billling address navigate to next page  

#10
Scenario: verify user can handle shipping method 
Given user can able to enter into home page
And user can login with valid credentials
And user can handle options 
When user select the Shipping by land transport
And user click a continue button
Then check user selected option is selected


#11
Scenario: verify user can change payment method
Given user can able to enter into home page
And user can login with valid credentials
And user can change payment method
When user select credit card payment method
And user click the continue icon
Then check it was changed in the page







Feature: Test feature

Scenario: Verify Books tab is working
Given user can able to enter into home page
And user can login with valid credentials
When user can able to click Books button
Then User navigate to list of books page


Scenario: Verify the list button is working
Given user can able to enter into home page
And user can login with valid credentials
When user can change the type of list
Then User can move into different list of books


Scenario: Verify click button is working
Given user can able to enter into home page
And user can login with valid credentials
When user can click particular product
Then User can move into product view page


Scenario: Verify product picture is visible
Given user can able to enter into home page
And user can login with valid credentials
When user can click product picture
Then User can move into product picture page


Scenario: Verify other product list is visible
Given user can able to enter into home page
And user can login with valid credentials
When user can view the other related products
Then User can move into other product  page


Scenario: Verify product is added in addcart as ascending order
Given user can able to enter into home page
And user can login with valid credentials
When user can add the product in ascending order
Then User can add the number of product


Scenario: Verify addcart button is working
Given user can able to enter into home page
And user can login with valid credentials
When user can click addcart button
Then User can move into shopping cart page


Scenario: Verify update shooping cart is working
Given user can able to enter into home page
And user can login with valid credentials
When user can click update shopping cart
Then User can see the updation of product


Scenario: Verify product checkout button is working
Given user can able to enter into home page
And user can login with valid credentials
When user can click the checkout button
Then User can move into Details page


Scenario: Verify customer details enters correctly
Given user can able to enter into home page
And user can login with valid credentials
When user can enters the deails
Then User can move into billing page
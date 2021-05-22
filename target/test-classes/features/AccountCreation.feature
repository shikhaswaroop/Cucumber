Feature: Verify account creation and whishlist share to email

Background: Sucessfull Login
Given On enter of url user is loggin sucessfully

Scenario: Verify tht user can create file in ecommerce site

Given the title of the loginpage is correct
When  I click on account link and fill all the user details
And I click on register
Then Verify that registration is done


Scenario: Verify tht user can share the whishlist through email

Given the title of the loginpage is correct
And logined using registered email id 
When Click on TV
And Add products in your whislist
And in next page enter email and a message and click share whislist
Then Verify that whishlist is shared

@Placeorder
Scenario: Place an order

Given the title of the loginpage is correct
When click on account link
And click on my account link
And enter the registered user details  and click on Login
And click on My whislist
And click on Add to cart
And Enter shipping information
And click on Update total
Then Verify that shipping details is added to grand total
And click on proceed to checkout
And enter billing information and click on continue
And in shipping method click on continue
And in payment section select money order and click on continue
And click on place order
And verify that order is generated and note the order number














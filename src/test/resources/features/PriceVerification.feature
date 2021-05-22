Feature: PriceVerification

Background: Sucessfull Login
Given On enter of url user is loggin sucessfully

Scenario: Verify that price displayed is correct

Given the title of the loginpage is correct
When I click on mobile menu
And  I capture the text of sony xperia mobile
And I click on sony xperia link
And I am navigated to sony Xperia page
Then Capture the mobile price 
And Verify that both the prices are equal

@ErrorVerification
Scenario: Verify that more products than available products shouldnot be added in the cart

Given the title of the loginpage is correct
When I click on mobile menu
And I cick on Add to Cart for SonyExperia
And I change the quantity value to <large_value>
And I click on update button
Then Verify the error message 
And I click on empty cart
And the cart is empty

@Compareproducts
Scenario: Verify that you are able to compare 2 products

Given the title of the loginpage is correct
When I click on mobile menu
And I click on Add to compare for two mobiles
And I click on compare link
Then Verify the popup window
And check that the products are displyed into it








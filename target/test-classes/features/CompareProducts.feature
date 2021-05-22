Feature: Compare the two mobiles


Background: Sucessfull Login
Given On enter of url user is loggin sucessfully

Scenario: Verify that you are able to compare two products

Given the title of the loginpage is correct
When I click on mobile menu
And I click on Add to compare for two mobiles
And click on compare button
Then Verify the popup window and check that the products are reflected in it
And close the popup



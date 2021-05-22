Feature: Verify dropdown

Scenario: Verify item in mobile list can be sorted by name

Given  On enter of url user is loggin sucessfully
And the title of the loginpage is correct
When I click on mobile menu
And  the title of the page is correct 
And  I select sort by dropdown as by name
Then verify that all products are sorted
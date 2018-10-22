Feature: Login

Scenario: Registered customer Login

Given when I am in TU homepage
When I click on Register button
Then I shall be navigated to Login page
When I enter registered email address as "testmail@gmail.com"
And I eneter valid password as "test@123"
And I click on Login button
Then I shall be navigated to homepage
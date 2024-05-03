Feature: Login Page Functionality

Scenario: User successfully logs in with valid credentials
Given the user is on the login page
When the user enters valid username and valid password
And the user clicks on the login button
Then the user should be redirected to the dashboard

Scenario: User encounters an error with invalid credentials
Given the user is on the login page
When the user enters invalid username and invalid password
And the user clicks on the login button
Then an error message should be displayed indicating invalid credentials

Scenario: User forgets password and requests a password reset
Given the user is on the login page
When the user clicks on the Forgot Password? link
And enters their email address
And clicks on the Next step button
Then a confirmation message should be displayed indicating that a password reset link has been sent to the user's email

Scenario: User attempts to log in without providing any credentials
Given the user is on the login page
When the user clicks on the login button without entering any credentials
Then an error message should be displayed indicating that both username and password are required

Scenario: User attempts to log in with a blank password field
Given the user is on the login page
When the user enters valid username and leaves the password field blank
And the user clicks on the login button
Then an error message should be displayed indicating that the password field is required

Scenario: User attempts to log in with a blank username field
Given the user is on the login page
When the user leaves the username field blank and enters valid password
And the user clicks on the login button

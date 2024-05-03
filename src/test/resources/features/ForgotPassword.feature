Feature: Forgot Password Screen Access from Login Screen

Scenario: User accesses the Forgot Password screen from the Login screen
Given the user is on the login page
When the user clicks on the Forgot Password? link
Then the user should be redirected to the Forgot Password screen

Scenario: User enters their email address for password reset
Given the user is on the Forgot Password screen
When the user enters their email address
And clicks on the Reset Password button
Then a confirmation message should be displayed indicating that a password reset link has been sent to the users email

Scenario: User attempts to reset password without providing an email address
Given the user is on the Forgot Password screen
When the user clicks on the Reset Password button without entering their email address
Then an error message should be displayed indicating that the email address is required

Scenario: User attempts to reset password with an invalid email address format
Given the user is on the Forgot Password screen
When the user enters an invalid email address format
And clicks on the Reset Password button
Then an error message should be displayed indicating that the email address format is invalid

Scenario: User clicks on the Back to Login link
Given the user is on the Forgot Password screen
When the user clicks on the Back to Login link
Then the user should be redirected back to the Login screen
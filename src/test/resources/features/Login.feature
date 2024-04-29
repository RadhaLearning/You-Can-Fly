Feature: Login Page Functionality
@smoke
  Scenario: User can login with valid credentials
    Given I am on the login page
    When I enter valid "<username>" and "<password>"
    And I click on the login button
    Then I should be logged in successfully
#
  #Scenario: User cannot login with empty credentials
    #Given I am on the login page
    #When I leave the username and password fields empty
    #And I click on the login button
    #Then I should see an error message
#
  #Scenario: User cannot login with invalid username
    #Given I am on the login page
    #When I enter an invalid username
    #And I enter a valid password
    #And I click on the login button
    #Then I should see an error message
#
  #Scenario: User cannot login with invalid password
    #Given I am on the login page
    #When I enter a valid username
    #And I enter an invalid password
    #And I click on the login button
    #Then I should see an error message
#
  #Scenario: User can reset password
    #Given I am on the login page
    #And I click on the "Forgot Password" link
    #When I enter my email address
    #And I click on the "Send Reset Email" button
    #Then I should see a success message
#
  #Scenario: User can navigate back to home page from login page
    #Given I am on the login page
    #When I click on the "Home" link
    #Then I should be redirected to the home page
#
  #Scenario: User can navigate to registration page from login page
    #Given I am on the login page
    #When I click on the "Register" link
    #Then I should be redirected to the registration page
#
  #Scenario: User can navigate to forgot password page

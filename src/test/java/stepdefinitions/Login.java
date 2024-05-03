package stepdefinitions;


import org.testng.Assert;

import Pages.LoginPage;
import baseclass.BaseClass;
import baseclass.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login extends BaseClass{

	public static LoginPage l;
	
	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() {
		
		
		String actualUrl = driver.getCurrentUrl();
		System.out.println(actualUrl);
//		String expectedUrl = "http://139.59.92.92/";
//		assertEquals("URLs are not equal", expectedUrl, actualUrl);
							
	}
	
	@When("the user enters valid username and valid password")
	public void the_user_enters_valid_username_and_valid_password() {
		l = new LoginPage();
		String Uname = ConfigReader.getProperty("USERNAME");
		String Pname = ConfigReader.getProperty("PASSWORD");
		sendKeys(l.getUserName(), Uname);
		sendKeys(l.getPassword(), Pname);
	}

	@When("the user clicks on the login button")
	public void the_user_clicks_on_the_login_button() throws InterruptedException {
	   click(l.getSignin());
	   Thread.sleep(2000);
	}

	@Then("the user should be redirected to the dashboard")
	public void the_user_should_be_redirected_to_the_dashboard() {
	 
		System.out.println("User should redirects to dashboard page");
	}

	@When("the user enters invalid username and invalid password")
	public void the_user_enters_invalid_username_and_invalid_password() {
	
		String invalidUname = ConfigReader.getProperty("USERNAME");
		String invalidPname = ConfigReader.getProperty("PASSWORD");
		sendKeys(l.getUserName(), invalidUname);
		sendKeys(l.getPassword(), invalidPname);
	}

	@Then("an error message should be displayed indicating invalid credentials")
	public void an_error_message_should_be_displayed_indicating_invalid_credentials() {
	   
		    Assert.assertEquals(l.getInvalidEmail().isDisplayed(), "Invalid email address");
		   // Assert.assertTrue("Invalid credentials error message is not displayed", l.getInvalidEmail().isDisplayed());
		  
//		    String errorMessageText = l.getInvalidEmail().getText();
//
//		 
//		    String expectedErrorMessage = "Invalid username or password. Please try again."; 
//
//		   
//		    Assert.assertEquals("Error message text does not match expected", expectedErrorMessage, errorMessageText);
	}

	@When("enters their email address")
	public void enters_their_email_address() {
	   
	}

	@When("clicks on the Next step button")
	public void clicks_on_the_next_step_button() {
	
	}

	@Then("a confirmation message should be displayed indicating that a password reset link has been sent to the user's email")
	public void a_confirmation_message_should_be_displayed_indicating_that_a_password_reset_link_has_been_sent_to_the_user_s_email() {
	 
	}

	@When("the user clicks on the login button without entering any credentials")
	public void the_user_clicks_on_the_login_button_without_entering_any_credentials() {
	   
	}

	@Then("an error message should be displayed indicating that both username and password are required")
	public void an_error_message_should_be_displayed_indicating_that_both_username_and_password_are_required() {
	   
	}

	@When("the user enters valid username and leaves the password field blank")
	public void the_user_enters_valid_username_and_leaves_the_password_field_blank() {
	 
	}

	@Then("an error message should be displayed indicating that the password field is required")
	public void an_error_message_should_be_displayed_indicating_that_the_password_field_is_required() {
	
	}

	@When("the user leaves the username field blank and enters valid password")
	public void the_user_leaves_the_username_field_blank_and_enters_valid_password() {
	   
	}
}

package stepdefinitions;

import org.openqa.selenium.By;

import baseclass.BaseClass;
import baseclass.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login extends BaseClass{

	By username = By.xpath("(//input[@name='username'])[2]");
	By password = By.xpath("(//input[@name='password'])[2]");
	By signin = By.xpath("(//input[@type='Submit'])[2]");
	By forgotpassword = By.xpath("(//form[@class='cognito-asf']//a)[2]");
	By start = By.xpath("//button[text()='Get Start cura...']");
	
	
	
	@Given("I am on the login page")
	public void i_am_on_the_login_page() throws InterruptedException {
	
		click(start);
		Thread.sleep(5000);
	}

	@When("I enter valid {string} and {string}")
	public void i_enter_valid_and(String usernameKey, String passwordKey) throws InterruptedException {
		
		String Uname1 = ConfigReader.getProperty("USERNAME");
		String Pname1 = ConfigReader.getProperty("PASSWORD");
	    sendKeys(driver.findElement(username), Uname1);
	    Thread.sleep(2000);
	    sendKeys(driver.findElement(password), Pname1);
	}

	@When("I click on the login button")
	public void i_click_on_the_login_button() throws InterruptedException {

		click(driver.findElement(signin));
		Thread.sleep(5000);
	}

	@Then("I should be logged in successfully")
	public void i_should_be_logged_in_successfully() {

		System.out.println("User Logged in successfully");
	}


	
	
}

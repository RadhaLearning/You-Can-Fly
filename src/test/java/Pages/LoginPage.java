package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import baseclass.BaseClass;

public class LoginPage extends BaseClass{

	public LoginPage() {
	      PageFactory.initElements(driver, this);
		}
			
		@CacheLookup
		@FindBy(how=How.XPATH,using="//input[@type='email']")
		private WebElement username;
		
	    public WebElement getUserName(){
	    	return username;
	    }
	  
	    @FindBy(how=How.XPATH,using="//input[@type='password']")
	    private WebElement password;
	    
	    public WebElement getPassword() {
			return password;
		}
	    
	    @FindBy(how=How.XPATH,using="(//button[@tabindex='0'])[2]")
	    private WebElement signin;
		
	    public WebElement getSignin() {
			return signin;
		}
	    
	    @FindBy(how=How.XPATH,using="//span[text()='Forgot Password?']")
	    private WebElement forgotPassword;
		
	    public WebElement getForgotpassword() {
			return forgotPassword;
		}
	    
	    @FindBy(how=How.XPATH,using="//p[text()='Invalid email address']")
	    private WebElement invalidemail;
		
	    public WebElement getInvalidEmail() {
			return forgotPassword;
		}
	    
	    @FindBy(how=How.XPATH,using="//p[text()='Password must have at least one special character']")
	    private WebElement leastpassword;
		
	    public WebElement getLeastPassword() {
			return forgotPassword;
		}
	    
	  	  
}

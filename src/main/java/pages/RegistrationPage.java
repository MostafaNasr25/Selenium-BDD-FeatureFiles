	package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends PageBase {

	public RegistrationPage(WebDriver Driver) {
		super(Driver);

	}
	
	@FindBy(id ="gender-male")
	WebElement genderbtn;
	
	@FindBy(id = "FirstName")
	WebElement Firstnamebx;
	
	@FindBy(id = "LastName")
	WebElement Lastnamebx;
	
	@FindBy(id = "Email")
	WebElement Emailbx;
	
	@FindBy(id = "Password")
	WebElement passbx;
	
	@FindBy(id = "ConfirmPassword")
	WebElement confpassbx;
	
	@FindBy(id = "register-button")
	WebElement registerbtn;
	
	@FindBy(css =  "div.result")
	public WebElement sucessmsg;
	
	@FindBy(linkText = "Log out")
	public WebElement logoutlink;             //assertion
	
	public void registerationUse(String firstname , String lastname , String email , String password) 
	{
		buttonClick(genderbtn);
		sendELementTxt(Firstnamebx, firstname);
		sendELementTxt(Lastnamebx, lastname);
		sendELementTxt(Emailbx, email);
		sendELementTxt(passbx, password);
		sendELementTxt(confpassbx, password);
		buttonClick(registerbtn);
		
	}

	public void logoutUse() {
		buttonClick(logoutlink);
	}



}

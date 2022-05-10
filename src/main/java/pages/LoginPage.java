package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {

	public LoginPage(WebDriver Driver) {
		super(Driver);
	}
	
	@FindBy(id = "Email")
	WebElement Emailbx;
	
	@FindBy(id = "Password")
	WebElement passbx;
	
	@FindBy(css = "button.button-1.login-button")
	WebElement lginbtn;
	
	@FindBy(tagName = "h2")
	public WebElement welcomemssg;
	
	public void loginUse(String email , String password)
	{
		sendELementTxt(Emailbx, email);
		sendELementTxt(passbx, password);
		buttonClick(lginbtn);
	}

}

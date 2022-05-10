package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {

	public HomePage(WebDriver Driver) {
		super(Driver);
	}
	
	@FindBy(linkText = "Register")
	WebElement registerlink;
	
	public void openRegistPage(){
		registerlink.click();
	}
	
	@FindBy(linkText = "Log in")
	WebElement loginlink;
	
	
	
	public void openLoginPage(){
		loginlink.click();
	}
	
	
	
}

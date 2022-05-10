package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
	
	protected WebDriver driver;  
	
	public PageBase(WebDriver Driver) {
		
		PageFactory.initElements(Driver, this);
	}
	
	protected static void buttonClick(WebElement btn) {
		btn.click();
	}
	
	protected static void sendELementTxt(WebElement ElementTxt , String value ) {
		ElementTxt.sendKeys(value);
	}

}

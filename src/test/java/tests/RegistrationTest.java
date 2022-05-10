package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.RegistrationPage;

public class RegistrationTest extends TestBase {
	
	HomePage homepage;
	RegistrationPage registerpage;
	LoginPage loginpage;
	
	
	@DataProvider(name = "datatest")
	public static Object[][] data(){
		
		return new Object [][] {
			{"mostafa" , "nasr" , "testemail19@gmail.com" , "1234567" },
			{"mostafa" , "nasr" , "testemail20@gmail.com" , "1234567" }	
		};
	}
	
	
	@Test(alwaysRun = true, dataProvider = "datatest")
	public void registrationSuccessfuly(String Firstname, String Lastname , String Email , String Password) {
		//registeration
		homepage = new HomePage(driver); 
		registerpage = new RegistrationPage(driver);
		registerpage.registerationUse(Firstname,Lastname, Email, Password);
		Assert.assertTrue(registerpage.sucessmsg.getText().contains("completed"));
		
		// logout 
		registerpage.logoutUse();
		
		//login 
		homepage.openLoginPage();
		loginpage = new LoginPage(driver);
		loginpage.loginUse(Email, Password);
		Assert.assertTrue(registerpage.logoutlink.isDisplayed());
		Assert.assertTrue(loginpage.welcomemssg.isDisplayed());
		registerpage.logoutUse();
	}
	
	
	
	
	
}

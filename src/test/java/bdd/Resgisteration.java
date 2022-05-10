package bdd;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.RegistrationPage;
import tests.TestBase;

public class Resgisteration extends TestBase {

	HomePage homepage;
	RegistrationPage registerpage;

	@Given("the user in homepage")
	public void the_user_in_homepage() {
		homepage = new HomePage(driver);
		homepage.openRegistPage();

	}
	@When("I click on register link")
	public void i_click_on_register_link() {
		Assert.assertTrue(driver.getCurrentUrl().contains("register"));
	}
	
	// single data
	/*
	 * @When("I entered fisrtname , lastname , email , password") public void
	 * i_entered_fisrtname_lastname_email_password() { registerpage=new
	 * RegistrationPage(driver); registerpage.registerationUse("mostafa", "nasr",
	 * "test100@email.com", "147852");
	 * }
	 */

		//multiable data
		@When("I entered {string} , {string} , {string} , {string}")
		public void i_entered(String firstname, String lastname, String email, String password) {
			registerpage=new RegistrationPage(driver);
			registerpage.registerationUse(firstname, lastname, email, password);
		}

	
	@Then("the registeration page displayed sucessfully")
	public void the_registeration_page_displayed_sucessfully() {
		Assert.assertTrue(registerpage.sucessmsg.getText().contains("completed"));
		registerpage.logoutUse();

	}
}

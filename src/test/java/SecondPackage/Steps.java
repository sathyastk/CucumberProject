package SecondPackage;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@SuppressWarnings("unused")
public class Steps {
	
	@Given("Enter {string} in the username field")
	public void enter_in_the_username_field(String string) {
	    System.out.println(string);
	}

	@Given("Enter {string} in the pwd field")
	public void enter_in_the_pwd_field(String string) {
		System.out.println(string);
	}

	@When("Click on login button")
	public void click_on_login_button() {
		System.out.println("Login button is clicked");
	}

	@Then("Home page is displayed")
	public void home_page_is_displayed() {
		System.out.println("Home page is displayed");
	}


	
}

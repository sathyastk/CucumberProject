package FirstPackage;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@SuppressWarnings("unused")
public class Steps {

	@Given("Enter {string} and {string}")
	public void credentials(String x, String y) {
	   System.out.println(x+"   "+y);
	}

	
	@When("Click on login button")
	public void click_on_login_button() {
		 System.out.println("login button is clicked");
	    
	}

	@Then("Home page is displayed")
	public void home_page_is_displayed() {
		 System.out.println("homepage is displayed");
	    
	}

	@Given("Enter credentials")
	public void enter_credentials() {
		 System.out.println("Credentials entered");
	}
	

	@Then("Home page is not displayed")
	public void home_page_is_not_displayed() {
		 System.out.println("Home page is not displayed");
	}


}

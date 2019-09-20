package thirdPackage;

import cucumber.api.CucumberOptions;
import java.util.List;
import java.util.Map;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@SuppressWarnings("unused")
public class Steps {
	
	@Given("I want to create an account")
	public void i_want_to_create_an_account() {
	    
		System.out.println("Account created");
	}

	@When("I enter my data")
	public void i_enter_my_data(io.cucumber.datatable.DataTable dt) {
	    
		List<Map<String,String>> list = dt.asMaps(String.class, String.class);
		for (int i =0; i<list.size(); i++) {
			System.out.println(list.get(i).get("name"));
			System.out.println(list.get(i).get("password"));
		}
	}

	@Then("I verify the account")
	public void i_verify_the_account() {
	   
		System.out.println("Account verified");
	}



	
}

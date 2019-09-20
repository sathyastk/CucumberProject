package Selenium;

import cucumber.api.CucumberOptions;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@SuppressWarnings("unused")
public class Steps {
	WebDriver driver;
	@Given("Open the browser")
	public void open_the_browser() {
	   
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a08019dirp_c2x.08.05\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Given("Enter the url")
	public void enter_the_url() {
	    driver.get("https://www.google.com");
	}

	@Then("Home page is displayed")
	public void home_page_is_displayed() {
	    
		assertEquals("Google",driver.getTitle());
		driver.close();
	}




	
}

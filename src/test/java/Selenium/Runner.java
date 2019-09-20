package Selenium;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@SuppressWarnings("unused")
@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty","json:Cucumber-Selenium-reports_Json.json"})
public class Runner {

}

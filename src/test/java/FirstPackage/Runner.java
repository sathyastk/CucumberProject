package FirstPackage;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@CucumberOptions(monochrome=true,tags="@sanity,@smoke")
@RunWith(Cucumber.class)
public class Runner {

}

package automation;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


	
	@CucumberOptions(features ="src\\test\\resources\\Features\\HRM.feature",name = "Login",plugin = "html:Reports.html")
	
	public class TestRunner extends AbstractTestNGCucumberTests {

}

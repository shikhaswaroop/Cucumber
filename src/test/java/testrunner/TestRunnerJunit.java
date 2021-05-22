package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
	@CucumberOptions(  
		    features = "C://Users//HII//Desktop//SeleniumProject_qedze//guru99_Project//src//test//resources//features//AccountCreation.feature",
		    glue="stepdefinations", tags="@Placeorder")
	public class TestRunnerJunit  {

	}


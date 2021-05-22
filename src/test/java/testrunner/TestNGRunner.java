package testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="C://Users//HII//Desktop//SeleniumProject_qedze//guru99_Project//src//test//resources//features//AccountCraetion.feature",tags="@Placeorder",plugin= {"pretty", "html:target/cucumber-reports" },monochrome=true)
public class TestNGRunner extends AbstractTestNGCucumberTests{
	
}
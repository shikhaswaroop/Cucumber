package stepdefinations;

import org.junit.Assert;
import org.testng.annotations.Test;
import org.testng.xml.LaunchSuite;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import rough.LoginPage;
import testbase.TestBase;

public class LoginStepDefinitations extends TestBase {
	
		
	
	LoginPage login = new LoginPage(driver);
	
	
	@Given("^I enter the URL$")
	public void i_enter_the_URL() throws Throwable {
		
		
		launchURL();
		
	   
	}
   
	@When("^I enter the  valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_the_valid_and(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    login.enterUserName(arg1);
	    login.enterPassword(arg2);
	}

	@When("^I click on Login$")
	public void i_click_on_Login() throws Throwable {
		
	    login.clickOnLogin();
	}

	@Then("^I am able to login correctly$")
	public void i_am_able_to_login_correctly() throws Throwable {
		
	   login.verifyTitle();
	}

	@Then("^Close Browser$")
	public void close_Browser() throws Throwable {
		//driver.close();	    
	}

	@When("^I enter the  invalid \"([^\"]*)\" and invalid \"([^\"]*)\"$")
	public void i_enter_the_invalid_and_invalid(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   login.enterUserName(arg1);
	   login.enterPassword(arg2);
	}
	

	@Then("^Error message popup is displayed$")
	public void error_message_popup_is_displayed() throws Throwable {
		String text =login.getAlertText();
		String Text1 = "User or Password is not valid";
		Assert.assertEquals(text, Text1);
		
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@When("^I enter the  invalid \"([^\"]*)\" and valid \"([^\"]*)\"$")
	public void i_enter_the_invalid_and_valid(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		login.enterUserName(arg1);
		   login.enterPassword(arg2);
	}

	@When("^I enter the  valid \"([^\"]*)\" and invalid \"([^\"]*)\"$")
	public void i_enter_the_valid_and_invalid(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		login.enterUserName(arg1);
		   login.enterPassword(arg2);
	}
	
	
	

}

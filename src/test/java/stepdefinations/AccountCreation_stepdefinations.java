package stepdefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pageobjects.AccountCreationPage;
import testbase.TestBase;

public class AccountCreation_stepdefinations extends TestBase {
	
	//Object Creation
	AccountCreationPage acc_creation = new AccountCreationPage(driver) ;
	
	@Given("^User is in home page$")
	public void user_is_in_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@When("^I click on account link and fill all the user details$")
	public void i_click_on_account_link_and_fill_all_the_user_details() throws Throwable {
	    acc_creation.account_link.click();
	    acc_creation.Myaccount_link.click();
	    acc_creation.Createaccount_link.click();
	    
	    acc_creation.enterdetails("Shkha", "Swarop", "shikhaswaroop123@yopmail.com", "helloworld");
	    acc_creation.register_btn.click();
	    
	}

	@When("^I click on register$")
	public void i_click_on_register() throws Throwable {
	    acc_creation.register_btn.click();
	    
	}

	@Then("^Verify that registration is done$")
	public void verify_that_registration_is_done() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		wait_until_visibilityOfElement(acc_creation.dashbord);
		acc_creation.verify_RegistrationIsdone();
	    
	}

	@Given("^logined using registered email id$")
	public void logined_using_registered_email_id() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^Click on TV$")
	public void click_on_TV() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("^Add products in your whislist$")
	public void add_products_in_your_whislist() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^in next page enter email and a message and click share whislist$")
	public void in_next_page_enter_email_and_a_message_and_click_share_whislist() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^Verify that whishlist is shared$")
	public void verify_that_whishlist_is_shared() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}


@When("^click on account link$")
public void click_on_account_link() throws Throwable {
    
    acc_creation.account_link.click();
}

@When("^click on my account link$")
public void click_on_my_account_link() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	acc_creation.Myaccount_link.click();
}

@When("^enter the registered user details  and click on Login$")
public void enter_the_registered_user_details_and_click_on_Login() throws Throwable {
    acc_creation.email.sendKeys("shikhaswaroop123@yopmail.com");
    acc_creation.pass.sendKeys("helloworld");
    acc_creation.loginbtn.click();
}

@When("^click on My whislist$")
public void click_on_My_whislist() throws Throwable {
    acc_creation.my_whislist.click();
    
}

@When("^click on Add to cart$")
public void click_on_Add_to_cart() throws Throwable {
    acc_creation.Addtocart_btn.click();
}

@When("^Enter shipping information$")
public void enter_shipping_information() throws Throwable {
    acc_creation.shippingdetails();
    
}

@When("^click on Update total$")
public void click_on_Update_total() throws Throwable {
acc_creation.updateshippingpriceradio_btn.click();
   acc_creation.update_btn.click();
    
}

@Then("^Verify that shipping details is added to grand total$")
public void verify_that_shipping_details_is_added_to_grand_total() throws Throwable {
   // String text = acc_creation.shipping_price.getText();
   // String actual =acc_creation.shippingpricein_update.getText();
   // Assert.assertEquals(text, actual);
  
}

@Then("^click on proceed to checkout$")
public void click_on_proceed_to_checkout() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    acc_creation.proceedtochckout.click();
}

@Then("^enter billing information and click on continue$")
public void enter_billing_information_and_click_on_continue() throws Throwable {
   acc_creation.continue_btn.click();
}

@Then("^in shipping method click on continue$")
public void in_shipping_method_click_on_continue() throws Throwable {
	wait_until_visibilityOfElement(acc_creation.shipping_methodcontinue_btn);
    acc_creation.shipping_methodcontinue_btn.click();
    
}

@Then("^in payment section select money order and click on continue$")
public void in_payment_section_select_money_order_and_click_on_continue() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	acc_creation.moneyorder_radiobtn.click();
	acc_creation.continue_payment_btn.click();
    
}

@Then("^click on place order$")
public void click_on_place_order() throws Throwable {
	scrollPage();
    acc_creation.placeorder.click();
}

@Then("^verify that order is generated and note the order number$")
public void verify_that_order_is_generated_and_note_the_order_number() throws Throwable {
   String text=acc_creation.orderno.getText();
   System.out.println(text);
    
}



}

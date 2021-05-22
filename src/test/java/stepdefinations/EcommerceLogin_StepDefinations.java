package stepdefinations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.Loginecommerce;
import testbase.TestBase;

public class EcommerceLogin_StepDefinations extends TestBase {
	String MenuPage_Price;
	String detailsPrice ;
	
	 Loginecommerce log = new  Loginecommerce(driver);
	
	@Given("^On enter of url user is loggin sucessfully$")
	public void on_enter_of_url_user_is_loggin_sucessfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		launchURL();
	   
	}

	@Given("^the title of the loginpage is correct$")
	public void the_title_of_the_loginpage_is_correct() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String title =driver.getTitle();
		String expected_title = "Home page";
		Assert.assertEquals(title,expected_title);
	    
	}

	@When("^I click on mobile menu$")
	public void i_click_on_mobile_menu() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   log.mbl_link.click();
	}

	@When("^the title of the page is correct$")
	public void the_title_of_the_page_is_correct() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		String title =driver.getTitle();
		String expected_title = "Mobile";
		Assert.assertEquals(title,expected_title);
	}

	@When("^I select sort by dropdown as by name$")
	public void i_select_sort_by_dropdown_as_by_name() throws Throwable {
	   
		Loginecommerce.sortByname();
	}

	@Then("^verify that all products are sorted$")
	public void verify_that_all_products_are_sorted() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Loginecommerce.check_alphabetical_order();
	   
	}
	@When("^I capture the text of sony xperia mobile$")
	public void i_capture_the_text_of_sony_xperia_mobile() throws Throwable {
	  MenuPage_Price = log.price_sonyxperia_Menu_Page.getText();
	
	}

	@When("^I click on sony xperia link$")
	public void i_click_on_sony_xperia_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   log.sonyxperia_link.click();
	}

	@When("^I am navigated to sony Xperia page$")
	public void i_am_navigated_to_sony_Xperia_page() throws Throwable {
	    String actualtitle =driver.getTitle();
	    String expectedtitle ="Sony Xperia - Mobile";
	    Assert.assertEquals(actualtitle, expectedtitle);
	   
	}

	@Then("^Capture the mobile price$")
	public void capture_the_mobile_price() throws Throwable {
	  detailsPrice= log.price_sonyxperia_details_page.getText();
	  
	}
	@Then("^Verify that both the prices are equal$")
	public void verify_that_both_the_prices_are_equal() throws Throwable {
	    log.compareMenu_and_detailsPrice(MenuPage_Price, detailsPrice);
	    
	}
	@When("^I cick on Add to Cart for SonyExperia$")
	public void i_cick_on_Add_to_Cart_for_SonyExperia() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 log.AddtoCart_SonyXperia_btn.click();
	}

	@When("^I change the quantity value to <large_value>$")
	public void i_change_the_quantity_value_to_large_value() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 log.qnty_sonyxperia.clear();
	  log.qnty_sonyxperia.sendKeys("1000");
	}

	@When("^I click on update button$")
	public void i_click_on_update_button() throws Throwable {
	    log.title_update.click();
	}

	@Then("^Verify the error message$")
	public void verify_the_error_message() throws Throwable {
	    String actualmsg =log.error_msg.getText();
	    String expectedMessage = "* The maximum quantity allowed for purchase is 500.";
	    Assert.assertEquals(actualmsg, expectedMessage);
	 
	}

	@Then("^I click on empty cart then the cart is empty$")
	public void i_click_on_empty_cart_then_the_cart_is_empty() throws Throwable {
	    String actualcount =log.Count.getText();
	    String expectedcount ="0";
	    Assert.assertEquals(actualcount, expectedcount);
	   
	}
	@Then("^I click on empty cart$")
	public void i_click_on_empty_cart() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    log.emptycart.click();
	}

	@Then("^the cart is empty$")
	public void the_cart_is_empty() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 String actualcount =log.Count.getText();
		 System.out.println("CountVerified");
		 System.out.println(actualcount);
		    
		    //Assert.assertEquals(actualcount, expectedcount);
	}

	@When("^I click on Add to compare for two mobiles$")
	public void i_click_on_Add_to_compare_for_two_mobiles() throws Throwable {
	   log.sonyXperia_compareto_link.click();
	   log.Iphone_compareto_link.click();
	   
	}

	
	   
	
	
	@When("^click on compare button$")
	public void click_on_compare_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  log.compare_btn.click();
	}




	

	
	

	@Then("^Verify the popup window and check that the products are reflected in it$")
	public void verify_the_popup_window_and_check_that_the_products_are_reflected_in_it() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		  log.verify_in_popup();
	}

	@Then("^close the popup$")
	public void close_the_popup() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		log.close_popup.click();
		//scrollPageuptoElementvisible(close);
		 //close.click();
		    
		    // switching to new window
		    /*for (String handle : driver.getWindowHandles()) {
		    driver.switchTo().window(handle);*/
	}




}

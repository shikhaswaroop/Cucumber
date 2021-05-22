package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;
import testbase.TestBase;

public class AccountCreationPage extends TestBase {
	
public static WebDriver driver;
	
	public AccountCreationPage(WebDriver driver){
		this.driver = driver;
		
	PageFactory.initElements(driver, this);
		
		
}

	@FindBy(linkText="ACCOUNT")
	public WebElement account_link;
	
	//div[@class='account-cart-wrapper']/a
	
	@FindBy(xpath="(//a[@title='My Account'])[1]")
	public WebElement Myaccount_link;
	
	@FindBy(xpath="//a[@title='Create an Account']")
	public WebElement Createaccount_link;
	
	//input[@id='firstname']
	
	//h1[text()='My Dashboard']
	
	@FindBy(xpath="//h1[text()='My Dashboard']")
	public WebElement dashbord;
	
	@FindBy(xpath="//input[@id='firstname']")
	public WebElement firstnname_txtbox;
	
	@FindBy(xpath="//input[@id='lastname']")
	public WebElement lastname_txtbox;
	
	//input[@id='email_address']
	
	@FindBy(xpath="//input[@id='email_address']")
	public WebElement email_txtbox;
	
	@FindBy(xpath="//input[@id='password']")
	public WebElement password_txtbox;
	
	@FindBy(xpath="//input[@id='confirmation']")
	public WebElement confirmation_txtbox;
	
	@FindBy(xpath="//button[@title='Register']")
	public WebElement register_btn;
	
	//input[@id='email']
	
	@FindBy(xpath="//input[@id='email']")
	public WebElement email;
	
	@FindBy(xpath="//input[@id='pass']")
	public WebElement pass;
	
	//button[@id='send2']
	
	@FindBy(xpath="//button[@id='send2']")
	public WebElement loginbtn;
	
	@FindBy(linkText="MY WISHLIST")
	public WebElement my_whislist;
	
	@FindBy(xpath="//span[contains(text(),'Add All to Cart')]")
	public WebElement Addtocart_btn;
	
	//select[@id='country']
	
	@FindBy(xpath="//select[@id='country']")
	public WebElement select_cntry;
	
	//select[@id='region_id']
	
	@FindBy(xpath="//select[@id='region_id']")
	public WebElement region_id;
	
	
	//input[@id='postcode']
	
	@FindBy(xpath="//input[@id='postcode']")
	public WebElement zipcode;
	
	//span[contains(text(),'Estimate')]
	
	@FindBy(xpath="//span[contains(text(),'Estimate')]")
	public WebElement estimate_link;
	
	//button[@title='Update Total']
	
	@FindBy(xpath="//button[@title='Update Total']")
	public WebElement update_btn;
	
	//label[contains(text(),'Fixed')]
	
	//label[contains(text(),'Fixed')]//span[@class='price']
	
	@FindBy(xpath="///label[contains(text(),'Fixed')]//span[@class='price']")
	public WebElement shipping_price;
	
	//td[normalize-space()='Shipping & Handling (Flat Rate - Fixed)']//following::span[@class='price']
	@FindBy(xpath="///label[contains(text(),'Fixed')]//span[@class='price']")
	public WebElement shippingpricein_update;
	
	//button[@title='Proceed to Checkout']
	
	@FindBy(xpath="//button[@title='Proceed to Checkout']")
	public WebElement proceedtochckout;
	
	@FindBy(xpath="(//button[@title='Continue'])[1]")
	public WebElement continue_btn;
	
	
	@FindBy(xpath="//div[@id='shipping-method-buttons-container']//button")
	public WebElement shipping_methodcontinue_btn;
	
	//input[@id='p_method_checkmo']
	
	@FindBy(xpath="//input[@id='p_method_checkmo']")
	public WebElement moneyorder_radiobtn;
	
	@FindBy(xpath="//button[@onclick='payment.save()']//span//span[contains(text(),'Continue')]")
	public WebElement continue_payment_btn;
	
	//span[contains(text(),'Place Order')]
	
	@FindBy(xpath="//span[contains(text(),'Place Order')]")
	public WebElement placeorder;
	//input[@id='s_method_flatrate_flatrate']
	
	@FindBy(xpath="//input[@id='s_method_flatrate_flatrate']")
	public WebElement updateshippingpriceradio_btn;
	
	//h2[@class='sub-title']/following::p[text()='Your order # is: ']/a
	
	@FindBy(xpath="	//h2[@class='sub-title']/following::p[text()='Your order # is: ']/a")
	public WebElement orderno;
	
	
	public  void enterdetails(String firstname,String lastname,String email,String password)
	{
	
	firstnname_txtbox.sendKeys(firstname);
	lastname_txtbox.sendKeys(lastname);
	email_txtbox.sendKeys(email);
	password_txtbox.sendKeys(password);
	confirmation_txtbox.sendKeys(password);
	
	}
	
	public void verify_RegistrationIsdone(){
		
		
		String title = driver.getTitle();
		System.out.println(title);
		//String expected_title = "My Account";
		
		
	}
	
	public void shippingdetails(){
		
		Select dropdown = new Select(select_cntry);
		dropdown.selectByVisibleText("United States");
		
		Select drp_cntry = new Select(region_id);
		drp_cntry.selectByVisibleText("New York");
		
		zipcode.sendKeys("542896");
		
		estimate_link.click();
		
		
		
		
	}
	
	

}

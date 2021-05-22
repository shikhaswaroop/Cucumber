package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import testbase.TestBase;

public class LoginPage  {

	public WebDriver driver;
	
	public LoginPage(WebDriver driver){
		this.driver = driver;
		
	PageFactory.initElements(driver, this);
		
		
}
	
	@FindBy(xpath="//input[@name='uid']")
	public WebElement username_txtbox;
	
	@FindBy(xpath="//input[@name='password']")
	public WebElement password_txtbox;
	
	@FindBy(name="btnLogin")
	public WebElement login_btn;
	
	@FindBy(xpath="//input[@name='btnReset']")
	public WebElement reset_btn;
	
	public  void enterUserName(String username)
	{
		//wait_until_visibilityOfElement(username_txtbox);
		username_txtbox.clear();
		username_txtbox.sendKeys(username);
	}
	
	public  void enterPassword(String password)
	{
		//wait_until_visibilityOfElement(password_txtbox);
		password_txtbox.clear();
		password_txtbox.sendKeys(password);
	}
	
	public void clickOnLogin()
	{
		//wait_until_visibilityOfElement(login_btn);
		login_btn.click();
	}
	
	public void clickonResetbutton()
	{
		
		reset_btn.click();
	}
	
	public void verifyTitle(){
		String title = driver.getTitle();
	   String expectedtitle = "Guru99 Bank Manager HomePage";
	   Assert.assertEquals(title,expectedtitle);
	}
	
	public String  getAlertText(){
		String text = driver.switchTo().alert().getText();
		return text;
	}
	
}

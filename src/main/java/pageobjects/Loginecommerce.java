package pageobjects;

import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import testbase.TestBase;

public class Loginecommerce extends TestBase{
	
public static WebDriver driver;
	
	public Loginecommerce(WebDriver driver){
		this.driver = driver;
		
	PageFactory.initElements(driver, this);
		
		
}
	
	@FindBy(xpath="")
	public WebElement mbl_drop;
	
	@FindBy(xpath="//button[@title='Close Window']")
	public WebElement close_popup;
	
	@FindBy(xpath="//a[contains(text(),'Mobile')]")
	public WebElement mbl_link;
	
	@FindBy(xpath="(//select[@title='Sort By'])[1]")
	public static WebElement sortby_drpdown;
	

	@FindBy(xpath="//span[@class ='price']")
	public WebElement price_sonyxperia_details_page;
	
	@FindBy(xpath="//span[@id='product-price-1']//child::span")
	public WebElement price_sonyxperia_Menu_Page;
	
	@FindBy(xpath="//a[@title='Sony Xperia']")
	public WebElement sonyxperia_link;
	
	@FindBy(xpath="//h2/a[@title='Sony Xperia']//parent::h2//following-sibling::div[3]/button")
	public WebElement AddtoCart_SonyXperia_btn;
	

	@FindBy(xpath="//input[@title='Qty']")
	public WebElement qnty_sonyxperia;
	
	@FindBy(xpath="//button[@title='Update']")
	public WebElement title_update;
	
	@FindBy(xpath="//h2/a[text()='Sony Xperia']//parent::h2//following-sibling::p")
	public WebElement error_msg;
	
	@FindBy(xpath="//button[@title='Empty Cart']")
	public WebElement emptycart;
	
	@FindBy(linkText="Account")
	public WebElement Account_link;
	
	@FindBy(linkText="My Cart")
	public WebElement MyCart_link;
	
	//span[@class='count']
	
	@FindBy(xpath="//span[@class='count']")
	public WebElement Count;
	
	@FindBy(xpath="//a[@title='Sony Xperia']/parent::h2/following::a[3]")
	public WebElement sonyXperia_compareto_link;
	
	//a[@title='IPhone']/parent::h2/following::a[3]
	
	@FindBy(xpath="	//a[@title='IPhone']/parent::h2/following::a[3]")
	public WebElement Iphone_compareto_link;
	
	//button[@title='Compare']
	
	@FindBy(xpath="//button[@title='Compare']")
	public WebElement compare_btn;
	
	@FindBy(xpath="//h2")
	public WebElement compare_txt;
	
	
	public static void check_alphabetical_order(){
		
		
LinkedList<String> text =new LinkedList<String>() ;
		
		List<WebElement> elements =driver.findElements(By.tagName("h2"));
		for(WebElement element : elements){
			text.add( element.getText()) ;
			System.out.println(text);
		}
		String result =comp_order(text);
		System.out.println(result);
}
	
	public static boolean verifyTitle(){
		
	
		
		
		return false;
		
	}
	
	public static void sortByname(){
		Select drpdown = new Select(sortby_drpdown);
		drpdown.selectByVisibleText("Name");
		
		
	}
	 
	public void compareMenu_and_detailsPrice(String menuPrice,String ListPrice){
	 if(menuPrice.equalsIgnoreCase(ListPrice)){
		//Assert.assertEquals(menuPrice, ListPrice);
		System.out.println("Price_equal");
		
	}
	 else
	 { System.out.println("Price not equal");
}
	 
}
	public void verify_in_popup(){
		
		  String strHead = ("COMPARE PRODUCTS");
		   	
		   String actual =compare_txt.getText();
		  // Assert.assertEquals(strHead, actual);
		    String popupMobile1 = driver.findElement(By.xpath("//h2/a[@title='IPhone']")).getText();  // text captured is "IPHONE" in uppercase
		    String popupMobile2 = driver.findElement(By.xpath("//h2/a[@title='Sony Xperia']")).getText();  // text captured "SONY XPERIA" in uppercase
		    System.out.println("popupMobile1 = "+popupMobile1);
		    System.out.println("popupMobile2 = "+popupMobile2);
		   
		    // to check the popup heading/title
		    
		    // to check the 2 mobiles selected are the two in the popup - this is tp check the IPhone
		    try {	    	
		    	Assert.assertEquals(
		    			"SONY XPERIA", popupMobile2);
			    } catch (Exception e) {
			    	e.printStackTrace();	    	
			    }	
		    // to check the 2 mobiles selected are the two in the popup - this is to check Sony X
		    try {	    	
		    	Assert.assertEquals("IPHONE", popupMobile1);
			    } catch (Exception e) {
			    	e.printStackTrace();	    	
			    }	
		    	    
	}
	
	
	
}
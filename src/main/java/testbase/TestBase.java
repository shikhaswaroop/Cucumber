package testbase;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {

	public static WebDriver driver;
	public Properties prop;
	public WebDriverWait wait;

	public WebDriver initializeDriver() throws IOException {

		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C://Users//HII//Desktop//SeleniumProject_qedze//guru99_Project//src//main//java//resources//config.properties");

		prop.load(fis);
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);

		if (browserName.equals("chrome")) {
			// System.setProperty("webdriver.chrome.driver",
			// "C://chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		
			// execute in chrome driver

		} else if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();
			// firefox code
		} else if (browserName.equals("IE")) {
			// IE code
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;

	}
	public void explicit_wait_visibiltyofelement(WebElement element){
	wait= new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static void getScreenshot() throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,
				new File("C://Users//HII//Desktop//SeleniumProject_qedze//guru99_Project//src//main//java//resources//config.properties"));

	}

	public void implicitwait(int time){
		driver.manage().timeouts().implicitlyWait(time,TimeUnit.SECONDS) ;
	}
	
	public void wait_until_visibilityOfElement(WebElement element){
		
	    wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void launchURL() throws Throwable{
		prop = new Properties();
		FileInputStream file = new FileInputStream("C://Users//HII//Desktop//SeleniumProject_qedze//guru99_Project//src//main//java//resources//config.properties");
		prop.load(file);
		String weburl= prop.getProperty("url");
		driver.get(weburl);
		
	}
	
	public void closeBrowser(){
		driver.quit();
	}
	
	public static String comp_order(LinkedList<String> pn)    
    {           
        String prev=""; // empty string    
        for ( String cur: pn)    
        {    
            if (cur.compareTo(prev) < 0)    
            {      
               
				return "fail";     
            }    
            prev=cur;    
        }    
     
		return "passed";    
        }   

	public static void scrollPage(){
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
	}
	
	
}

package testbase;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
	public static Properties prop;
	public WebDriverWait wait;

	
	public static WebDriver initializeDriver() throws IOException {

		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"E://SeleniumProject_qedze//Guru99TestNg//src//main//resources//config.properties");

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

	public  static void getScreenshot(String result) throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,
				new File("E://SeleniumProject_qedze//Guru99TestNg//Screenshots" + result + "screenshot.png"));

	}

	public void implicitwait(int time){
		driver.manage().timeouts().implicitlyWait(time,TimeUnit.SECONDS) ;
	}
	
	public void wait_until_visibilityOfElement(WebElement element){
		
	    wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void launchURL() throws Throwable{
		prop = new Properties();
		FileInputStream file = new FileInputStream("E://SeleniumProject_qedze//Guru99TestNg//src//main//resources//config.properties");
		prop.load(file);
		String weburl= prop.getProperty("url");
		driver.get(weburl);
	}
	
	public void closeBrowser(){
		driver.quit();
	}
}

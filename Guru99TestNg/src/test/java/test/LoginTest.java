package test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.LoginPage;
import testbase.TestBase;
import utilities.ExcelFileUtil;

public class LoginTest extends TestBase{

	static LoginPage log ;
	
	private static final Logger logger1 = LogManager.getLogger(LoginTest.class);
	
	@BeforeMethod
	public static void testlauchURL() throws Throwable{
		initializeDriver();
		launchURL();
		logger1.info("Driver started sucessfully");
		
		
	}
	@Test(priority=0,dataProvider="validdataProvider",enabled=false)
	public static void verifyLogin_validcredentials(String username,String password) throws Throwable{
	 
	 log = new LoginPage(driver);
	 log.enterUserName(username);
	 log.enterPassword(password);
	 log.clickOnLogin();
	 
	 logger1.info("Succeffully Login");
	 
}
	
@Test(priority=1,dataProvider="invaliddataProvider")
public static void verifyLogin_invalidcredentials(String username,String password) throws Throwable{
	 //ExcelFileUtil file = new ExcelFileUtil("E://SeleniumProject_qedze//Guru99TestNg//src//test//resources//Guru99Inputdata.xlsx");
	 TestBase test = new TestBase();
	 log = new LoginPage(driver);
	 log.enterUserName(username);
	 log.enterPassword(password);
	 log.clickOnLogin();
	 String text = driver.switchTo().alert().getText();
	 System.out.println(text);
	 driver.switchTo().alert().accept();
	 File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,
				new File("E://SeleniumProject_qedze//Guru99TestNg//Screenshots//screenshot1.png"));

	 
	 
	 getScreenshot("error");
	 
	 logger1.info("Succeffully Login");
}
	@AfterMethod
	public static void closebrowser(){
		driver.quit();;
		
	}
	
	@DataProvider(name="validdataProvider")
    public Object[][] getDataFromDataprovider(){
    return new Object[][] 
    	{
            { "mngr322966", "ysAhadE"},
           
        };
	} 
        
	@DataProvider(name="invaliddataProvider")
        public Object[][] getInvlidDataFromDataprovider(){
        return new Object[][] 
        	{
                { "mngr322967", "ysAhadE"},
               /* { "mngr322967", "ysAhadP"},
                { "mngr322966", "ysAhadP"},*/
               
            };


    }
	
}

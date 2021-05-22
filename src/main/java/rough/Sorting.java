package rough;

import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sorting {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://live.demoguru99.com/index.php/");
		
		
		WebElement mbl = driver.findElement(By.xpath("//a[contains(text(),'Mobile')]"));
		mbl.click();
		Select drpdown = new Select(driver.findElement(By.xpath("(//select[@title='Sort By'])[1]")));
		drpdown.selectByVisibleText("Name");
		LinkedList<String> text =new LinkedList<String>() ;
		
		List<WebElement> elements =driver.findElements(By.tagName("h2"));
		for(WebElement element : elements){
			text.add( element.getText()) ;
			System.out.println(text);
		}
	
	
	
	
	String result =comp_order(text);
	System.out.println(result);
	driver.close();
	
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
	}



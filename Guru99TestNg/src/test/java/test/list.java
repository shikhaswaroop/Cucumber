package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class list {
	public static void main(String[] args) {
		test();
		
		
	}
	public static void sort(){
	WebDriver driver = new ChromeDriver();
	ArrayList<String> obtainedList = new ArrayList<>(); 
	List<WebElement> elementList= driver.findElements(By.xpath(""));
	for(WebElement we:elementList){
	   obtainedList.add(we.getText());
	}
	ArrayList<String> sortedList = new ArrayList<>();   
	for(String s:obtainedList){
	sortedList.add(s);
	}
	Collections.sort(sortedList);
	Assert.assertTrue(sortedList.equals(obtainedList));

}
	

	
	    public static void test()
	    {
	        String name1= "Atqaz";
	        String name2= "Sest";
	        int tmp=name2.compareTo(name1);
	        System.out.println(tmp);
	    }
	} 
	

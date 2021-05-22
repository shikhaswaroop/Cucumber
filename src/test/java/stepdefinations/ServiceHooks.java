package stepdefinations;



import cucumber.api.java.After;
import cucumber.api.java.Before;
import testbase.TestBase;

public class ServiceHooks {
	
	TestBase  base ;
	
	@Before
	public void initializeTest() throws Throwable{
		base = new TestBase();
		base.initializeDriver();
		
	}
	
	@After
	 public  void closeBrowser(){
		base = new TestBase();
		base.closeBrowser();
		
	}
	

}

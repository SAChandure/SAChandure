package TestNG_Study;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class Priority_Study {
  
	@Test(priority = -1)
	  
	public void TC3() 
	  {
		Reporter.log("TC3 is Running",true);  
		  
	  }
	@Test(priority=1)
	  public void TC2() 
	  {
		Reporter.log("TC2 is Running",true);  
		  
	  }
   @Test(priority=-2)
  public void TC1() 
  {
	Reporter.log("TC1 is Running",true);  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("Before Method is Running",true);
  }

  @AfterMethod
  public void afterMethod() {
	  Reporter.log("After Method is Running",true);
  }

}

package TestNG_Study;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class Invocation_Study {
  
	
	
	
  @Test (invocationCount =2)
  public void TestCase() {
	  
	  Reporter.log("Test is Running",true);
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

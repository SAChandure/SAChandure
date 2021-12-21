package TestNG_Practice;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class failedXml_Study {
  @Test(invocationCount=2)
  
  
  public void f() {
	  
	  Reporter.log("TC f is running",true);
	  
  }
  
 @Test 
  public void a()
  {
	  Assert.fail();
	  Reporter.log("TC a is running",true);
  }
  @Test(timeOut=5200)
  public void c() throws InterruptedException
  {
	  Thread.sleep(5100);
	  Reporter.log("TC c is running",true);
  }
  @Test(dependsOnMethods= {"f"})
  public void e()
  {
	  Reporter.log("TC e is running",true);
  }
}

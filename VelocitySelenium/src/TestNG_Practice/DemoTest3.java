package TestNG_Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest3 {
	
	
  @Test(groups="regression")
  public void f() {
	  Reporter.log("Test f is Running",true);
  }
  @Test (groups="sanity")
 public void a()
  {
	  Reporter.log("Test a is Running",true);
  }
  @Test (groups="sanity")
  public void d()
  {
	  Reporter.log("Test d is Running",true);
  }
  @Test (groups="regression")
  public void b()
  {
	  Reporter.log("Test b is Running",true);
  }
  @Test (groups="sanity")
  public void c()
  {
	  Reporter.log("Test c is Running",true);
  }
}

package TestNG_Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest4 {
  
	
  @Test(groups="sanity")
  
  public void c() {
	  Reporter.log("Test c is Running",true);
  }
	
  @Test(groups="regression")
  public void d() {
	  Reporter.log("Test d is Running",true);
  }
	
  @Test(groups="sanity")
  public void e() {
	  Reporter.log("Test e is Running",true);
  }
	
  @Test(groups="sanity")
  public void a() {
	  Reporter.log("Test a is Running",true);
	  
  }
	
  @Test(groups="regression")
  public void b() {
	  Reporter.log("Test b is Running",true);
  }
  
}

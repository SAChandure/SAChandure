package TestNG_Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest1 {
  @Test
 
  public void b()
  {
	  Reporter.log("Test b is running",true);
  }
  @Test
  public void a() {
	  Reporter.log("Test a is running",true);
  }
  @Test
  public void c()
  {
	  Reporter.log("Test c is Running",true);
  }
  @Test
  public void d()
  {
	  Reporter.log("Test d is running",true);
  }
  @Test
  public void e()
  {
	  Reporter.log("Test e is Running",true);
  }
}

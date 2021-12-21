package TestNG_Study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependOnMethodStudy {
 
	@Test()
	  public void b() {
		
		Reporter.log("Method b is Running",true);
	  }	
	
	@Test(dependsOnMethods= {"b"})
	  public void a() {
		
		Reporter.log("Method a is Running",true);
	  }
	@Test(priority=-1)
	  public void d() {
		
		Reporter.log("Method d is Running",true);
	  }
	
@Test
  public void c() {
	
	Reporter.log("Method c is Running",true);
  }
}

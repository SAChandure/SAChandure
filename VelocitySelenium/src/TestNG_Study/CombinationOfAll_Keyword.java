package TestNG_Study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CombinationOfAll_Keyword {
  @Test(priority=-2)
  public void b() {
	  
	  Reporter.log("Method b is running",true);
  }
  
  @Test(invocationCount=2)
  public void e() {
	  Reporter.log("Method e is running",true);
  }
  
  @Test(priority=-1)
  public void a() 
  {
	  Reporter.log("Method a is running",true);
  }
  @Test(enabled=false)
  public void c() 
  {
	  Reporter.log("Method c is running",true);
  }
  @Test(invocationCount=2,timeOut=500)
  public void g () throws InterruptedException
  {
	  Thread.sleep(600);
	  Reporter.log("Method g is running",true);
  }
  @Test(priority=-5,dependsOnMethods= {"b"})
  public void f() 
  {
	  Reporter.log("Method f is running",true);
  }
}

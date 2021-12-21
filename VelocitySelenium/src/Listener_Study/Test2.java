package Listener_Study;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(Listener_Study.Listener.class)
public class Test2 {
  
	@Test
  public void TC3() {
	  Reporter.log("TC3 is running",true);
  }
  
  
	@Test
  public void TC2() {
	  
	  Reporter.log("TC2 is running ",true);
  }
 
@Test
  public void TC1() {
  Reporter.log("TC1 is Running",true);
  }
  

@Test
  public void TC4() {
	Assert.fail();
	Reporter.log("TC4 is running",true);
  }
}

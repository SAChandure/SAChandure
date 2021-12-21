package Listener_Study;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import org.testng.Reporter;
import org.testng.Assert;



@Listeners(Listener_Study.Listener.class)

public class Test1 
{
  
	@Test
	public void TC5() {
		
		Reporter.log("TC5 is Running ",true);
  }
	
	@Test
	public void TC2() {
		
		Reporter.log("TC2 is Running ",true);
  }
	
@Test
	public void TC1() {
		
		Reporter.log("TC1 is Running ",true);
  }
@Test
	public void TC4() {
		
		Reporter.log("TC4 is Running ",true);
  }
@Test
	public void TC3() {
		Assert.fail();
		Reporter.log("TC3 is Running ",true);
		
  }
}

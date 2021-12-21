package TestNG_Study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class KeyWord_TimeOut {
 
@Test
public void e(){
	Reporter.log("TC e is Running",true);
}
	
	
@Test(timeOut=1100)
  public void c() throws InterruptedException 
  {
	Thread.sleep(1300);
	Reporter.log("TC c is Running",true);
  }

@Test(priority=-1)
public void d()
{
	Reporter.log("TC d is Running",true);
}
@Test
public void a()
{
	Reporter.log("TC a is Running",true);
}
}

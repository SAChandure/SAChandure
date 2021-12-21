package TestNG_Study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword_Enabled_Study {
  
  
  @Test
  public void Test2()
  {
	  Reporter.log("Test2 is Running",true);
  }
  
 

  @Test(priority=-1)
  public void Test4() 
  {
	  Reporter.log("Test4 is Running",true);
  }
  
  
  @Test
  public void Test1() 
  {
  Reporter.log("Test1 is Running",true);
  }
  
  
  @Test(enabled =false)
  public void Test3() 
  {
  Reporter.log("Test3 is Running",true);
  }
}

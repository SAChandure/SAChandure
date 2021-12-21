package TestNGHard_Assert_Study;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_Null {
  @Test
  public void f() {
	  
	  
	  
	  String s=null;
	 
	  String s1="Pune";
	  

	  
	  Assert.assertNull(s1, "String is not empty");
	  Reporter.log("TC is passed String is empty", true);
  }
}

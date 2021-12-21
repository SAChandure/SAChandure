package TestNGHard_Assert_Study;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_NOTNull_Study {
  @Test
 
	  
	  
	  public void Assert_Not_Null() {
		  
		  
		  
	  String s=null;
	
	  
	  Assert.assertNotNull(s,"String is Empty");
	  Reporter.log("TC is passed String is not empty", true);
	  
	  
  }
}

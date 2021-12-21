package TestNG_SoftAssertStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertStudy {
	
	
	
	  SoftAssert soft= new SoftAssert();
  
	  
	  @Test
  public void f() {
		  
		  
		  String s1 = "selenium with java";
		 String  s2="selenium";
		 String  s3=null;
		 String  s4="selenium";
		 String s5=null;
		 boolean s6 = false;
		 
		 soft.assertEquals(s2,s4,"Both String are Different" );
		 Reporter.log("Both string are same and TC is Passed",true);
		 
		 soft.assertNotNull(s2,"String is Null");
		 Reporter.log("string is not  null and TC is Passed",true);
		 
		 soft.assertNull(s4,"String is not Null");
		 Reporter.log("String is null and TC is passed",true);
		 
		 soft.assertTrue(s6,"String contains false");
		 Reporter.log("String is boolean True TC Passed",true);
		
		 soft.assertAll();
		  
	  
	  
	
	  
	  
	 
	  
	  
	  
	  
  }
}

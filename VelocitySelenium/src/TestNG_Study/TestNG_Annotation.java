package TestNG_Study;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Annotation {
//  @Test
//  public void userValidated() {
//	 Reporter.log("UserValidated",true);
//  }
	  @Test
	  public void ValidatePin() {
		  Reporter.log("Pin Validation done-->@Test used", true);
	  }
	  
	  @Test
	  public void ValidateUserId() {
		  Reporter.log("UserId Validation done--> @Test used", true);
	  }
	  @BeforeMethod
	  public void EnterUserIdAndPassword() {
		  Reporter.log("UserIdPasswordEntered  done--> @BeforeMethod used", true);
	  }

	  @AfterMethod
	  public void Logout() {
		  Reporter.log("Logout  done--> @AfterMethod used", true);
	  }

	  @BeforeClass
	  public void BrowserLaunch() {
		  Reporter.log("Launch Browser--> @BeforeClass used", true);
	  }

	  @AfterClass
	  public void CloseBrowser() {
		  Reporter.log("Closed Browser--> @AfterClass used", true);
	  }

}

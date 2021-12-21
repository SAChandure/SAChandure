package TestNG_Study;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class AnnotationRunningSequence {
  @Test
  public void Test() {
	  Reporter.log("Test is Running",true);
  }
  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("Before Method is Running",true);
  }

  @AfterMethod
  public void afterMethod() {
	  Reporter.log("After Method is Running",true);
  }

  @BeforeClass
  public void beforeClass() {
	  Reporter.log("Before class is Running",true);
  }

  @AfterClass
  public void afterClass() {
	  Reporter.log("AfterClass is Running ",true);
  }

  @BeforeTest
  public void beforeTest() {
	  Reporter.log("Before test is Running",true);
  }

  @AfterTest
  public void afterTest() {
	  Reporter.log("After test is Running",true);
  }

}

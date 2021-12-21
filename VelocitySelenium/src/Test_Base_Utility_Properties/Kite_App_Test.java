package Test_Base_Utility_Properties;

import static org.testng.Assert.assertEquals;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Kite_App_Test extends BaseClass{
	
	int TCID=25;
	KiteLoginPage login;
	KitePInPage pin;
	KiteHomePage home;
	@BeforeClass
	public void launchBrowser() throws InterruptedException, EncryptedDocumentException, IOException
	{
		BrowserInitialization();
		login=new KiteLoginPage(driver);
		pin=new KitePInPage(driver);
		home=new KiteHomePage(driver);
	}
	@BeforeMethod
	public void LogintoKite() throws EncryptedDocumentException, IOException, InterruptedException
	{
		login.sendUserID(Utility.getDataFromPropertyFile("UN"));
		login.sendPassword(Utility.getDataFromPropertyFile("PWD"));
		Reporter.log("Entering username and password",true);
		login.clickOnloginButton();
		pin.sendPin(Utility.getDataFromPropertyFile("PIN"));
		Reporter.log("Entering Pin",true);
		pin.clickonContinue();
	}
  @Test
  public void validateUserID() throws EncryptedDocumentException, IOException, InterruptedException {
	  
	 String ActualUserId = home.userIdvalidation();
	 String ExpectedUserID = (Utility.getDataFromPropertyFile("UID"));
	 Reporter.log("Validating UserID",true);
     Assert.assertEquals(ExpectedUserID, ActualUserId,"ID's not Matching Test Case Failed");
    // Reporter.log("ID's are Matched TC "+TCID+" is passed",true);
    
     Reporter.log("Taking ScreenShot",true);
     Utility.captureScreenShot(driver, TCID);
  }
  @AfterMethod
  public void LogoutKite(ITestResult result) throws InterruptedException, IOException
  {   
	  
	  
	  Thread.sleep(2000);
	  if(result.getStatus()==ITestResult.FAILURE)
	  {
		 Utility.captureScreenShot(driver, TCID);
	  }
	 home.clickOnUserID();
	 home.clickOnLogout();
	 Reporter.log("Logging Out",true);
	  
  }
  @AfterClass
  public void CloseBrowser()
  {
	  driver.close();
	  Reporter.log("Closing Browser",true);
  }
}

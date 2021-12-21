package POM_Test_Base_Utility;

import static org.testng.Assert.assertEquals;
import org.testng.Assert;
import org.testng.Reporter;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Kite_App_Test extends BaseClass{
	
	KiteLoginPage login;
	KitePInPage pin;
	KiteHomePage home;
	
	
	@BeforeClass
	public void launchBrowser() throws InterruptedException
	{
		BrowserInitialization();
		login=new KiteLoginPage(driver);
		pin=new KitePInPage(driver);
		home=new KiteHomePage(driver);
		Thread.sleep(2500);
		
		
	}
	@BeforeMethod
	public void LogintoKite() throws EncryptedDocumentException, IOException, InterruptedException
	{
		login.sendUserID(Utility.getDataFromExcel(0, 0));
		login.sendPassword(Utility.getDataFromExcel(0, 1));
		Reporter.log("Entering username and password",true);
		login.clickOnloginButton();
		Thread.sleep(1500);
		pin.sendPin(Utility.getDataFromExcel(0, 2));
		Reporter.log("Entering Pin",true);
		pin.clickonContinue();
		Thread.sleep(2000);
	}
  @Test
  public void validateUserID() throws EncryptedDocumentException, IOException, InterruptedException {
	  
	 int TCID = 10;
	 String ActualUserId = home.userIdvalidation();
	String ExpectedUserID = Utility.getDataFromExcel(0, 0);
	Thread.sleep(2000);
	 Reporter.log("Validating UserID",true);
    Assert.assertEquals(ExpectedUserID, ActualUserId,"ID's not Matching Test Case Failed");
    Reporter.log("ID's are Matched TC "+TCID+" is passed",true);
    Thread.sleep(2000);
    Reporter.log("Taking ScreenShot",true);
    Utility.captureScreenShot(driver, TCID);
  }
  @AfterMethod
  public void LogoutKite() throws InterruptedException
  {
	  Thread.sleep(500);
	  home.clickOnUserID();
	  Thread.sleep(500);
	  home.clickOnLogout();
	  Thread.sleep(2000);
	  Reporter.log("Logging Out",true);
	  
  }
  @AfterClass
  public void CloseBrowser()
  {
	  driver.close();
	  Reporter.log("Closing Browser",true);
  }
}

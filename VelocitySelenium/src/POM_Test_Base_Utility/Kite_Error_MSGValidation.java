package POM_Test_Base_Utility;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Kite_Error_MSGValidation extends BaseClass {
	
	
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
    Reporter.log("Browser Launching",true);
    Thread.sleep(1500);
    
}
@BeforeMethod
public void logIntoKite() throws EncryptedDocumentException, IOException, InterruptedException
{
	Thread.sleep(500);
	login.clickOnloginButton();
	Thread.sleep(500);
	
}
  @Test
  public void validatingErrorMessages() throws InterruptedException, EncryptedDocumentException, IOException {
	  int TCID = 25;
	  Thread.sleep(1500);
	  Reporter.log("Validating Error messages of Username and Password",true);
	  String ExpectedIDerror = Utility.getDataFromExcel(2, 0);
	  String ActualIDerror = login.errMessageID();
	  Thread.sleep(1500);
	  Assert.assertEquals(ExpectedIDerror, ActualIDerror,"Both are not matching Test case Failed");
	  String ExpectedPWDError = Utility.getDataFromExcel(2, 1);
	  String ActualPWDError = login.errMessagePsw();
	  
	  Reporter.log("Both are Matching TC is Passed",true);
	  Reporter.log("Taking ScreenShot",true);
	    Utility.captureScreenShot(driver, TCID);
	
  }
 @AfterClass
 public void CloseBrowser() throws InterruptedException
 {
	 Thread.sleep(1500);
	 driver.close();
	 Reporter.log("Closing Browser",true);
 }
  }


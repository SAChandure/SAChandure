package POM_Test_Base_Utility;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KIte_App_TestONMsg extends BaseClass {
  
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
		login.sendUserID(Utility.getDataFromExcel(1, 0));
		login.sendPassword(Utility.getDataFromExcel(1, 1));
		Thread.sleep(1500);
		  Reporter.log("Entering username and password",true);
		login.clickOnloginButton();
		Thread.sleep(1500);
		
	}
	
	
	
	
	 @Test
	  public void validateerrMsg() throws EncryptedDocumentException, IOException, InterruptedException {
		  int TCID = 15;
		  Thread.sleep(1500);
		  String ExpectedIDerror = Utility.getDataFromExcel(2, 0);
		  String ActualIDerror = login.errMessageID();
		  Thread.sleep(1500);
		  Assert.assertEquals(ExpectedIDerror, ActualIDerror,"Both are not matching Test case Failed");
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

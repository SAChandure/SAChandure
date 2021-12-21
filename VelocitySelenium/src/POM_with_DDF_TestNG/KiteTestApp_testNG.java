package POM_with_DDF_TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class KiteTestApp_testNG {
	
	
	WebDriver driver;
	Sheet Mysheet;
	KiteLogIn Login;
	KitPIN Pin;
	KiteHomePage Home;
	
  
	
@Parameters("BrowserName")	
@BeforeClass
public void launchBrowser(String BrowserName) throws InterruptedException, EncryptedDocumentException, IOException
{
	if(BrowserName.equals("chrome"))
			{
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--disable-notifications");
	 driver=new ChromeDriver(opt);
	
			}
	else if (BrowserName.equals("firefox")){
		
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		  driver=new FirefoxDriver();
		
		}
	Thread.sleep(1500);
	driver.manage().window().maximize();
	driver.get("https://kite.zerodha.com/");
	Thread.sleep(2500);
	Reporter.log("Launching Browser",true);
	FileInputStream file=new FileInputStream("E:\\New Study Materials\\imp document.xlsx");
     Mysheet = WorkbookFactory.create(file).getSheet("Sheet4");
     Login=new KiteLogIn(driver);
     Pin=new KitPIN(driver);
     Home=new KiteHomePage(driver);

}


@BeforeMethod
public void LogintoKite () throws InterruptedException
{

	
	 String UserID = Mysheet.getRow(0).getCell(0).getStringCellValue();
	 String PWD = Mysheet.getRow(0).getCell(1).getStringCellValue();
	 String PIN = Mysheet.getRow(0).getCell(2).getStringCellValue();
	Thread.sleep(2000);
	Login.sendUserID(UserID);
	Login.sendPassword(PWD);
	Reporter.log("Entering username and Password",true);
	
	  Login.clickOnloginButton();
	  Thread.sleep(1800);
     Pin.sendPin(PIN);
      Thread.sleep(1800);
      Reporter.log("Entering Pin",true);
      Pin.clickonContinue();
  	Thread.sleep(1800);
}

	
	
	
@Test
  public void ValidateUserId() throws InterruptedException {
	
	String ExpectedUserID = Mysheet.getRow(0).getCell(0).getStringCellValue();
	Thread.sleep(1800);
	String ActualUserID=Home.userIdvalidation();
	Thread.sleep(1800);
	Reporter.log("Validating UserId ",true);
 	Thread.sleep(1800);
	Assert.assertEquals(ExpectedUserID, ActualUserID,"TC is failed Both Id are not Matching");
	Reporter.log("TC is Passed, ID's are Matching",true);
	Thread.sleep(1800);
  }
@AfterMethod
public void LogoutKite() throws InterruptedException
{
	
Thread.sleep(1200);
 Home.clickOnUserID();
 Thread.sleep(1000);
 Home.clickOnLogout();
 Thread.sleep(1500);
 Reporter.log("Logging Out....",true);
 
}
@AfterClass
public void BrowserClose()
{
	driver.close();
	Reporter.log("Closing Browser",true);
}


}

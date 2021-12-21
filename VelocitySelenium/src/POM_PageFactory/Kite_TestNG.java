package POM_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Kite_TestNG {
  @Test
  @Parameters("BrowserName")
  
  public void KiteAPP(String BrowserName) throws InterruptedException {
	  
	  WebDriver driver=null;
	  if(BrowserName.equals("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  //driver.manage().window().maximize();
	  }
  
	  else if(BrowserName.equals("firefox"))
     {
		  System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		  driver=new FirefoxDriver();
		  //driver.manage().window().maximize();
		  
	  }
	  driver.manage().window().maximize();
	  driver.get("https://kite.zerodha.com/");
	  KiteLogInPage Login=new KiteLogInPage(driver);
	  Reporter.log("login  Credential ",true);
		Login.sendUserId();
         Login.sendPassword();
		Login.clickonLoginButton();
		Thread.sleep(2000);
		 Reporter.log("Pin for Kite App ",true);
		KitePin pin=new KitePin(driver);
		pin.sendPin();
		pin.clickOnContinue();
		 Reporter.log("visiting HomePage ",true);
		Thread.sleep(3000);
		KiteHome Home=new KiteHome(driver);
		Home.clickonDashboard();
		Thread.sleep(1000);
		Home.KiteIdClick();
		Thread.sleep(1000);
		Home.LogoutButton();
		Thread.sleep(1000);
		Reporter.log("Browser Closed ",true);
		driver.close();
	  
	  
	  
	  
  }
}

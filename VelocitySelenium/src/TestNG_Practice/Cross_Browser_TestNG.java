package TestNG_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Cross_Browser_TestNG {
	  
	  @Parameters("BrowserName")
	  @Test

  public void CrossBrowser(String BrowserName) throws InterruptedException 
	  {
		  
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
		  Thread.sleep(2000);
		driver.close();
	
       }
}

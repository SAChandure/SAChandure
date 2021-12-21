package POM_Test_Base_Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass {
	
	WebDriver driver;
	
	public  void BrowserInitialization()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		 driver=new ChromeDriver(opt);
		 driver.manage().window().maximize();
	     driver.get("https://kite.zerodha.com/");
	     
	}

}

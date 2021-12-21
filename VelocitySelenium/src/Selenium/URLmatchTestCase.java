package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class URLmatchTestCase {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		String ExpectedURL="https://www.google.com/";
		
	    String ActualURL=driver.getCurrentUrl();
	    
	
	if(ActualURL.equals(ExpectedURL))
	{
		System.out.println("Url Matched and Test Case Passed");
	}
	else 
	
	System.out.println("Url does not matched and Testcase Failed");
	}

}

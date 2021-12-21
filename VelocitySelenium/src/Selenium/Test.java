package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test {

	public static void main(String[] args) throws InterruptedException  {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
	
		Thread.sleep(1000);
		//driver.close();
		
		//driver.manage().window().maximize();
		
		//driver.getTitle();
		
		//driver.navigate();
		
		driver.getCurrentUrl();
	}

}

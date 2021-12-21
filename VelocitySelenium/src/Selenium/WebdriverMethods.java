package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebdriverMethods {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(400);
		driver.navigate().to("https://www.google.com/");
		
		Thread.sleep(300);
		driver.navigate().back();
		
		Thread.sleep(200);
		driver.navigate().forward();
		
	}

}

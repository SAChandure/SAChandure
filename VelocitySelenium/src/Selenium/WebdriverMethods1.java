package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethods1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
       
		driver.get("https://www.amazon.in/amazonpay/home?ref_=apay_logo_APayDashboard");
		
		Thread.sleep(300);
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh();
		
		String Title=driver.getTitle();
		System.out.println("Title is "+Title);
		
		System.out.println(driver.getCurrentUrl());
		
		String URL=driver.getCurrentUrl();
		System.out.println("The Current Url is "+URL);
		
	}

}

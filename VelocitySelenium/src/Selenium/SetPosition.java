package Selenium;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.google.com/");
	

	System.out.println(driver.manage().window().getPosition());
	
	Thread.sleep(400);
	
	Point p=new Point(150,250);
	
	driver.manage().window().setPosition(p);
	
	System.out.println(driver.manage().window().getPosition());
	
	
	
	

		
		
		
	}

}

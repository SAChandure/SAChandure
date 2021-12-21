package DropDownList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownStudy1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://twitter.com/i/flow/signup");
		Thread.sleep(10000);
		
		//driver.findElement(By.xpath("//span[text()='Sign up']")).click();
		WebElement Month = driver.findElement(By.xpath("//select[@aria-labelledby='SELECTOR_10_LABEL']"));
		Thread.sleep(8000);
		Select s=new Select(Month);
		s.selectByVisibleText("July");


	
	
	
	
	
	}

}

package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkey {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Sanket.chandure@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		

	}

}

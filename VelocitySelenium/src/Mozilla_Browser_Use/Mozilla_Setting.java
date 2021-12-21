package Mozilla_Browser_Use;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Mozilla_Setting {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Mozilla Browser");
		
		
	}

}

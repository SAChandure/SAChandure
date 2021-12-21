package WebelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplyed {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		//driver.manage().window().maximize();
		Thread.sleep(2500);
		
		System.out.println(driver.findElement(By.id("displayed-text")).isDisplayed());
		Thread.sleep(2500);
		driver.findElement(By.id("hide-textbox")).click();
		
		Thread.sleep(2500);
		
		System.out.println(driver.findElement(By.id("displayed-text")).isDisplayed());
		
		driver.findElement(By.id("show-textbox")).click();
		Thread.sleep(2500);
		System.out.println(driver.findElement(By.id("displayed-text")).isDisplayed());
		
		
	}

}

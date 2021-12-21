package IFrame;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameStudy {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		driver.switchTo().frame("iframe-name");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]")).click();
		Thread.sleep(2000);
		//driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		
		System.out.println(driver.findElement(By.xpath("//a[text()='About Us']")).getText());
	}

}
package WebelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement2 {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.icicilombard.com/?gclid=CjwKCAjwn8SLBhAyEiwAHNTJbWgE_KZDRgWvf3-JJXY6vFei00AJz5TvfHjRSDN5r9kYPt-UUJx7NxoCuFMQAvD_BwE");
		
		driver.manage().window().maximize();
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//input[@maxlength='11']")).sendKeys("MH27BV2345");
		driver.findElement(By.xpath("//input[@maxlength='11']")).clear();
		Thread.sleep(1100);
		driver.findElement(By.xpath("(//input[@maxlength='10'])[2]")).sendKeys("9890495410");
		Thread.sleep(1100);
		driver.findElement(By.id("valid-emailid")).sendKeys("na@na.com");
		Thread.sleep(1100);
		driver.findElement(By.xpath("//button[@id='car-get-quote']")).click();
		
		//System.out.println(driver.findElement(By.xpath("//h1[contains(text(),'Over')]")).getText());
		
		
		
		
		
	}
	
	

}

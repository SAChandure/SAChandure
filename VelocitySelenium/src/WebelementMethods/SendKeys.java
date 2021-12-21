package WebelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://secure.yatra.com/social/common/yatra/signin.htm?source=mybookings&returnUrl=https%3A%2F%2Fsecure.yatra.com%2Fmanage-bookings%2Fdashboard");
		
		
		driver.findElement(By.xpath("//input[@name='email-mobile-input']")).sendKeys("Sanket A. Chandure");
		driver.findElement(By.xpath("//input[@id='mb-brn']")).sendKeys("9890495310");

	}

}

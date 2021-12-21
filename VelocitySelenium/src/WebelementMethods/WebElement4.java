package WebelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement4 {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.icicilombard.com/?gclid=CjwKCAjwn8SLBhAyEiwAHNTJbWgE_KZDRgWvf3-JJXY6vFei00AJz5TvfHjRSDN5r9kYPt-UUJx7NxoCuFMQAvD_BwE");
		
		driver.manage().window().maximize();
		Thread.sleep(1500);
		
		//driver.findElement(By.linkText("I don't remember my car registration no.")).click();
		driver.findElement(By.partialLinkText("I don't remember")).click();
		

	}

}

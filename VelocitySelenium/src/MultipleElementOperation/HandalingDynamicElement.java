package MultipleElementOperation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandalingDynamicElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.flipkart.com/");
		
		//Thread.sleep(1200);
         driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
         //Thread.sleep(1200);
		driver.findElement(By.name("q")).sendKeys("iphone13");
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//Thread.sleep(6000);
		WebElement ReviewsandRating = driver.findElement(By.xpath("(//div[@class='gUuXy-'])[1]"));
		//Thread.sleep(6000);
		System.out.println(ReviewsandRating.getText());
		
	}

}

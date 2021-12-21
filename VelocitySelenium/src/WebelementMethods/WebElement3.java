package WebelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement3 {

	public static void main(String[] args) throws InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.icicilombard.com/?gclid=CjwKCAjwn8SLBhAyEiwAHNTJbWgE_KZDRgWvf3-JJXY6vFei00AJz5TvfHjRSDN5r9kYPt-UUJx7NxoCuFMQAvD_BwE");
		
		driver.manage().window().maximize();
		Thread.sleep(1500);
		
		
		String ExpectedTest="Over 4 crore customers have faith in us because we care";
		
		
		
		String ActualText=driver.findElement(By.xpath("//h1[contains(text(),'Over')]")).getText();
		
		if(ActualText.equals(ExpectedTest))
		{
			System.out.println("Test Case is Passed");
		}
		else
			System.out.println("Test case is Failed");
		
	}

}

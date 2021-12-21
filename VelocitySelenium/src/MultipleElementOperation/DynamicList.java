package MultipleElementOperation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicList {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
	
        
		driver.findElement(By.name("q")).sendKeys("Selenium");
		
		List<WebElement> SearchResult = driver.findElements(By.xpath("//ul[@class='G43f7e']//li"));
		
		System.out.println(SearchResult.size());
		
		for(WebElement w:SearchResult)
		{
			System.out.println(w.getText());
		}
		String ExpectedResult = "Selenium ide";
		
		for(WebElement w:SearchResult)
		{
			String ActualResult = w.getText();
			
			if(ActualResult.equalsIgnoreCase(ExpectedResult))
			{
			
				w.click();
			}
			
			
		}
	}

}

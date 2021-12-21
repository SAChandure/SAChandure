package MultipleElementOperation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicListBing {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
		Thread.sleep(1200);
        
		driver.findElement(By.id("sb_form_q")).sendKeys("Selenium");
		Thread.sleep(1200);
		List<WebElement> BingSearch = driver.findElements(By.xpath("//div[@class='sa_tm']"));
		Thread.sleep(2200);
		
		for(WebElement we:BingSearch)
		{
			System.out.println(we.getText());
		}
		Thread.sleep(2200);
        String ExpectedResult = "Selenium ide";
        for(WebElement we:BingSearch)
        {
        	String ActualResult = we.getText();
        	Thread.sleep(1200);
        	if(ActualResult.equalsIgnoreCase(ExpectedResult))
        	{
        		Thread.sleep(1200);
        		we.click();
        	}
        }
       
	}

}

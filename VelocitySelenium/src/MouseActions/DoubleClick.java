package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
	
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		WebElement doubleclick = driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me ')]"));
		
		
		
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		
		act.doubleClick(doubleclick).perform();
		
	
		}

}

package Scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ScrollIntoView {

	public static void main(String[] args) throws InterruptedException {
		
		
		 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		 
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.icicilombard.com/general-insurance-by-icici-lombard-new?gclid=Cj0KCQjw8eOLBhC1ARIsAOzx5cFzTW7GyStNK9neMvnaR44ysZcbWxPNs4rpp5i2VZLb2KIyYNfabRQaApJJEALw_wcB");
          Thread.sleep(2000);
         WebElement Ref = driver.findElement(By.xpath("//h2[text()='Why choose ICICI Lombard?']"));
         Thread.sleep(5000);
         JavascriptExecutor j=((JavascriptExecutor)driver);
         j.executeScript("arguments[0].scrollIntoView(true);",Ref);
		  
		  
		  
		  
		  
		  
	}

}

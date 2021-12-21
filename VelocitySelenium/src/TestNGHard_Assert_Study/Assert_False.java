package TestNGHard_Assert_Study;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_False {
  @Test
  
	 
		  
		  
		  public void Assert_False_study() throws InterruptedException {
			  
			  
			  
			  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				
				driver.get("https://vctcpune.com/selenium/practice.html");
				
				
				driver.findElement(By.xpath("//a[text()='PRACTICE']")).click();
				Thread.sleep(1200);
				//driver.findElement(By.xpath("//input[@name='checkBoxOption1']")).click();
				Thread.sleep(1200);
				boolean radio = driver.findElement(By.xpath("//input[@name='checkBoxOption1']")).isSelected();
				
			Assert.assertFalse("Radio button is  selected", radio);
				Reporter.log("Radio button is not selected",true);
}
}
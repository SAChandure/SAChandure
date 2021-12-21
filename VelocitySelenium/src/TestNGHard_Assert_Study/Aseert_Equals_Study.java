package TestNGHard_Assert_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Aseert_Equals_Study {
  

@Test
  public void Assert_Equals() {
	  
	  
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		String ActualText = "Welcome To Practice Page";
		String ExpectedText = driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']")).getText();
		
		Assert.assertEquals(ActualText, ExpectedText,"Actual and expected are not Matching");
		Reporter.log("Actual and Expected are Matching",true);
  }
}

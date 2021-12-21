package TestNG_Study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
	    driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		System.out.println("TC is passed");
		org.testng.Reporter.log("Test case passed", true);
		
  }
}

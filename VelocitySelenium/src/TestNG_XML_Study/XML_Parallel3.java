package TestNG_XML_Study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class XML_Parallel3 {
  @Test
  public void VisitedtoVCTC() {
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://vctcpune.com/");
	  Reporter.log("Visited to VCTC",true);
	  
	  
  }
  
}

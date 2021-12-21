package WebelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement5 {

	

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://termlife.policybazaar.com/?pb_source=google_brand&pb_medium=ppc&pb_term=Policybazaar&pb_campaign=PolicyBazaar00PolicyBazaar&gclid=CjwKCAjwn8SLBhAyEiwAHNTJbfvIvV18J8CJWk4OUPm0shmoRexZPl8htZVTHhR0O6DUjzZiRUCbcBoCVUgQAvD_BwE&pb_content=home_v10");
         
	    driver.manage().window().maximize();
	    Thread.sleep(1200);
	    driver.findElement(By.id("nameAdd")).sendKeys("Aditya kishor Narayan");
	    
	    driver.findElement(By.xpath("//input[@id='dob']")).sendKeys("12/12/1998");
	   
	    driver.findElement(By.name("mobileNo")).sendKeys("9866665311");
	    
	    driver.findElement(By.xpath("//span[@class='proceed']")).click();
	    
	}

}

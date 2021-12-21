package WebelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://login.upstox.com/");
	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Get OTP']")).click();
		WebElement GetOTP = driver.findElement(By.xpath("//button[text()='Get OTP']"));
        
		System.out.println(GetOTP.isEnabled());
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("9890496556");
	Thread.sleep(2000);
	System.out.println(GetOTP.isEnabled());
	
	boolean result = GetOTP.isEnabled();
	
	if(result==true)
	{
		System.out.println("Button is Enabled");
	}
	else {
		
	 System.out.println("There is Some issue");
	 }

}
}

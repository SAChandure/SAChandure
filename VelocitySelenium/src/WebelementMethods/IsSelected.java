package WebelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.yatra.com/");
		
		Thread.sleep(2000);
	    System.out.println(driver.findElement(By.xpath("//a[@for='BE_flight_non_stop']")).isSelected());		
	    Thread.sleep(3000);
		
	    //driver.findElement(By.xpath("//a[@for='BE_flight_non_stop']")).click();
	    Thread.sleep(4000);
	    System.out.println(driver.findElement(By.xpath("//a[@for='BE_flight_non_stop']")).isSelected());
	

	}

}

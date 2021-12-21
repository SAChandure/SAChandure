package Zerodha;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;


public class ZerodhaUNValidation {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		
		driver.findElement(By.id("userid")).sendKeys("DAA677");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Velocity@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("866918");
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
		String ExpectedId = "DAA677";
		
		String ActualId = driver.findElement(By.className("user-id")).getText();
		Thread.sleep(2000);
		if(ExpectedId.equals(ActualId))
		{
			System.out.println("Test Case is Passed");
		} 
		else
		    System.out.println("Test Case is failed");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		String Random = RandomString.make(4);
	    File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    File destination=new File("C:\\Users\\admin\\Desktop\\Velocity Testing Document\\SeleniumScreenShot\\Screenshot"+Random+".png");
	    FileHandler.copy(source,destination);
	    Thread.sleep(3000);

		driver.findElement(By.className("user-id")).click();
		WebElement LogoutButton = driver.findElement(By.xpath("//a[@target='_self']"));
		
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.moveToElement(LogoutButton).click().build().perform();
		
		
		
		
	}

}

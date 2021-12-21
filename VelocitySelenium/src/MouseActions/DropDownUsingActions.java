package MouseActions;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDownUsingActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(2000);
		 WebElement day = driver.findElement(By.id("day"));
		
		 Actions act=new Actions(driver);
		 Thread.sleep(4000);
		
		 act.moveToElement(day).click().build().perform();
		 Thread.sleep(2000);
		 act.sendKeys(Keys.ARROW_DOWN).perform();
		 Thread.sleep(1000);
		 for(int i=0;i<=7;i++)
		 {
			 act.sendKeys(Keys.ARROW_DOWN).perform();
			 Thread.sleep(100);
		 }
		
		 act.sendKeys(Keys.ENTER).perform();
		
		 WebElement month = driver.findElement(By.id("month"));
		 Thread.sleep(1000);
		 act.moveToElement(month).click().build().perform();
		 act.sendKeys(Keys.ARROW_UP).perform();
		 Thread.sleep(1000);
		 for(int i=0;i<=4;i++)
		 {
			 act.sendKeys(Keys.ARROW_UP).perform();
			 Thread.sleep(100);
		 }
		act.sendKeys(Keys.ENTER).perform();
        WebElement year = driver.findElement(By.id("year"));
        Thread.sleep(1000);
        act.moveToElement(year).click().build().perform();
        Thread.sleep(1000);
        act.sendKeys(Keys.ARROW_DOWN).perform();
        for(int i=0;i<32;i++)
        {
        	act.sendKeys(Keys.ARROW_DOWN).perform();
        	Thread.sleep(100);
        }
        act.sendKeys(Keys.ENTER).perform();
	}

}

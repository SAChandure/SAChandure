package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndHold {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement src = driver.findElement(By.xpath("(//a[contains(@class,'button button-orange')])[2]"));
		
		WebElement dest = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
		WebElement srcBank = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement destAccount = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		WebElement srcSales = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement DestCredit = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		WebElement DestCreditAmt = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		Actions act=new Actions(driver);
		Thread.sleep(2400);
		
		act.clickAndHold(src).moveToElement(dest).release().build().perform();
		Thread.sleep(2400);
		//act.dragAndDrop(src, dest).perform();
		//act.moveToElement(src).clickAndHold().moveToElement(dest).release().build().perform();
		act.dragAndDrop(srcBank, destAccount).perform();
		Thread.sleep(2400);
		act.dragAndDrop(srcSales, DestCredit).perform();
		Thread.sleep(2400);
		act.dragAndDrop(src, DestCreditAmt).perform();
		
	}

}


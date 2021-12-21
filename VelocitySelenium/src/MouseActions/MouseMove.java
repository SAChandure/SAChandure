package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMove {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icicilombard.com/general-insurance-by-icici-lombard-new?gclid=Cj0KCQjwlOmLBhCHARIsAGiJg7knsR8suEgUhJ3pvbbzbcF8YRFiAIFk0S9E_M2Wve3sNpH4YEHeUngaAlLaEALw_wcB");
		
		Thread.sleep(3000);
		
		Actions act=new Actions(driver);
		
		
		//WebElement RenewalButton = driver.findElement(By.xpath("//a[text()='Renewals']"));
		
		WebElement OInsurance = driver.findElement(By.xpath("//a[text()='Other Insurance']"));
		
		
		//act.click(RenewalButton).perform();
		//act.click().perform();
		Thread.sleep(1000);
		
		//act.click(OInsurance).perform();
		act.moveToElement(OInsurance).click().build().perform();
		
		
	}

}

package PopUpStudy;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(1500);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(1500);
		Alert Alt = driver.switchTo().alert();
		
		String Text = Alt.getText();
		System.out.println(Text);
        Thread.sleep(2000);
        
        //Alt.accept();
        Alt.dismiss();
	}

}

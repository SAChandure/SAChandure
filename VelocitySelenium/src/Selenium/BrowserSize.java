package Selenium;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSize {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		
		System.out.println(driver.manage().window().getSize());
		
		Thread.sleep(1000);
		
		
		
		Dimension d= new Dimension(800, 300);//width,height
		
		driver.manage().window().setSize(d);
		
		
		
		System.out.println(driver.manage().window().getSize());
		
		
		
		
	}

}

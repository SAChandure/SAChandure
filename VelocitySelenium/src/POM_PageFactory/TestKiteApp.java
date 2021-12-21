package POM_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestKiteApp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(2000);
		//Create an  object of KiteloginPage class and calling its methods in sequence
		KiteLogInPage Login=new KiteLogInPage(driver);
		Login.sendUserId();
        Login.sendPassword();
		Login.clickonLoginButton();
		Thread.sleep(2000);
		//Create an  object of KitePin class and call methods in sequence
		KitePin pin=new KitePin(driver);
		pin.sendPin();
		pin.clickOnContinue();
		Thread.sleep(3000);
		
		//Create an object of KiteHome class and calling its methods in sequence
		KiteHome Home=new KiteHome(driver);
		Home.clickonDashboard();
		Thread.sleep(100);
		Home.clickonOrders();
		Home.clickonHoldings();
		Home.clickonPositions();
		Home.clickonFunds();
		Home.getKiteID();
		
	}

}

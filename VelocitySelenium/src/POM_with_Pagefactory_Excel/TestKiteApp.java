package POM_with_Pagefactory_Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestKiteApp {

	

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(3000);
		
		FileInputStream file=new FileInputStream("E:\\New Study Materials\\imp document.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet4");
		String UserID = sh.getRow(0).getCell(0).getStringCellValue();
		String PWD = sh.getRow(0).getCell(1).getStringCellValue();
		String Pin = sh.getRow(0).getCell(2).getStringCellValue();
		Thread.sleep(2000);
		
		KiteLoginPage Login=new KiteLoginPage(driver);
		Login.sendUserID(UserID);
		Login.sendPassword(PWD);
		Login.clickOnloginButton();
		Thread.sleep(2000);
		
		KitePin pin=new KitePin(driver);
		pin.sendPin(Pin);
		pin.clickonContinue();
		Thread.sleep(2200);
		
		KiteHome home=new KiteHome(driver);
		home.userIdvalidation(UserID);
		
		
				

	}

}

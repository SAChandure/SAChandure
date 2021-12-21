package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleMatchTestCase {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		String ExpectedTitle="Google";
		String ActualTitle=driver.getTitle();
		
		if(ActualTitle.equals(ExpectedTitle))
		{
			System.out.println("Title Matched Test Case is Passed");
		}
		else
			System.out.println("Title not matching test case failed ");
		
	}

}

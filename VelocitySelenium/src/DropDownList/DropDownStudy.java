package DropDownList;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownStudy {

		public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
					
					WebDriver driver=new ChromeDriver();
					driver.get("https://www.facebook.com/r.php?next=https%3A%2F%2Fwww.facebook.com%2Fpages%2Fcreate%2F%3Fref_type%3Dregistration_form&locale=en_GB&display=page");
					driver.manage().window().maximize();
					Thread.sleep(3000);
					WebElement Day = driver.findElement(By.id("day"));
					Select s=new Select(Day);
					List<WebElement> Days = s.getOptions();
					for(int i=0;i<=Days.size()-1;i++)
					{
						System.out.println(Days.get(i).getText());
					}
					System.out.println("Total days options are "+Days.size());
					
					Thread.sleep(6000);
					s.selectByVisibleText("15");
					Thread.sleep(3000);
					WebElement Month = driver.findElement(By.name("birthday_month"));
					Select s1=new Select(Month);
					Thread.sleep(3000);
					s1.selectByVisibleText("May");
					List<WebElement> Months = s1.getOptions();
					for(int i=0;i<=Months.size()-1;i++)
					{
						System.out.println(Months.get(i).getText());
					}
					System.out.println("Total Months options are "+Months.size());
					WebElement Year = driver.findElement(By.id("year"));
					Select s2=new Select(Year);
					s2.selectByValue("2007");
					List<WebElement> Years = s2.getOptions();
					for(int i=0;i<=Years.size()-1;i++)
					{
						System.out.println(Years.get(i).getText());
					}
					System.out.println("Total Years options are "+Years.size());
					
					
					
					
		}				

}

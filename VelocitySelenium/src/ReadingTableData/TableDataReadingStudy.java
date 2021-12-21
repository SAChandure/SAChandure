package ReadingTableData;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableDataReadingStudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("C:\\Users\\admin\\Desktop\\table1.html");
		Thread.sleep(1000);
		String Text = driver.findElement(By.xpath("(//td[2])[2]")).getText();
		System.out.println(Text);
		for(int i=1;i<=4;i++)
		{
			String Text1 = driver.findElement(By.xpath("(//td[2])["+i+"]")).getText();
			System.out.println(Text1);
			
		}
	
		for(int i=2;i<=5;i++) 
		{
			for(int j=1;j<=3;j++)
			{
				String Text3 = driver.findElement(By.xpath("//table[@id='1234']//tr["+i+"]/td["+j+"]")).getText();
				System.out.print("  "+Text3);
			}
			System.out.println(" ");
		}

	}

}

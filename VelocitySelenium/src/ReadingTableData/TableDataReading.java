package ReadingTableData;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableDataReading {

	private static final boolean WebElement = false;

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
		Thread.sleep(2000);
		
		for(int i=2;i<=4;i++)
		{
			String Text2 = driver.findElement(By.xpath("//table[@id='1234']//tr["+i+"]//td[2]")).getText();
			System.out.print(" "+Text2);
			
		}
		System.out.println(" ");
		
		List<WebElement> TotalRowCount = driver.findElements(By.tagName("tr"));
		System.out.println(" TotalRowCount "+TotalRowCount.size());
	
		for(WebElement w:TotalRowCount)
			{			
			System.out.println(w.getText());
			
			}
		System.out.println("+++++++++++++++++++++++++++++");
		
		for(int i=1;i<=3;i++)
		{
			String Text4 = driver.findElement(By.xpath("//table[@id='1234']//th["+i+"]")).getText();
			System.out.print(" "+Text4);
			
		}
		
		System.out.println(" ");
		
		for(int i=2;i<=5;i++) 
		{
			for(int j=1;j<=3;j++)
			{
				String Text3 = driver.findElement(By.xpath("//table[@id='1234']//tr["+i+"]/td["+j+"]")).getText();
				System.out.print(""+Text3);
			}
			System.out.println(" ");
		}
		
	}

}

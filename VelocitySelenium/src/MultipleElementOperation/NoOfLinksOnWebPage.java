package MultipleElementOperation;


import java.util.Iterator;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class NoOfLinksOnWebPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(2000);
		
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		Thread.sleep(2000);
		System.out.println("TotalNo of Links "+links.size());
		
	
		for(WebElement w:links)
		{
	       System.out.println(w.getText());
		}
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		
		for(int i=0;i<=links.size()-1;i++)
		{
			System.out.println(links.get(i).getText());
			
		}
		System.out.println("///////////////////////////////////////");
		Iterator<WebElement> i=links.iterator();
		while(i.hasNext())
		{
			System.out.println( i.next().getText());
		}
	}

}

package MultipleElementOperation;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleRadioButtons {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html#serviceid");
		driver.manage().window().maximize();
		 Thread.sleep(2000);
		List<WebElement> RadioB = driver.findElements(By.xpath("//input[@name='radio']"));
		List<WebElement> CheckB = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
	Thread.sleep(2000);

	
     System.out.println("Total No of RadioButtons "+RadioB.size());
     System.out.println("Total No of RadioButtons "+CheckB.size());
     Thread.sleep(3000);
     
     System.out.println("/////////////////////////////////");
     Iterator<WebElement> it=RadioB.iterator();
     while(it.hasNext())
     {
    	 Thread.sleep(2000);
    	it.next().click();
    	
     }
     
//     for(WebElement we:RadioB)
//     {
//    	 Thread.sleep(2000);
//    	 we.click();
//    	 
//	}
//     Thread.sleep(2000);
//     for(int i=RadioB.size()-1;i>=0;i--)
//     {
//    	 Thread.sleep(2000);
//    	 RadioB.get(i).click();
//     }
//     Thread.sleep(2000);
//     for(WebElement w:CheckB)
//     {
//    	 Thread.sleep(2000);
//    	 w.click();
//     }
//     Thread.sleep(2000);
//     for(int i=CheckB.size()-1;i>=0;i--)
//     {
//    	 Thread.sleep(2200);
//    	 CheckB.get(i).click();
//     }
}
}
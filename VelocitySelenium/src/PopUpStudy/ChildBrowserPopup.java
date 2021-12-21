package PopUpStudy;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(1000);
		driver.findElement(By.id("windowButton")).click();
		
		//String MainpageId = driver.getWindowHandle();
		//System.out.println(MainpageId);
		Set<String> AllPageIds = driver.getWindowHandles();
		System.out.println(AllPageIds);
		
		LinkedHashSet<String> hs=new LinkedHashSet<String>(AllPageIds);
		
		
		Iterator<String> it=hs.iterator();
		
		String MainPage = it.next();
		String Childpage = it.next();
		//driver.switchTo().window(Childpage);
		//driver.manage().window().maximize();
		//driver.close();
		
		driver.switchTo().window(MainPage);
		Thread.sleep(1500);
		String Text = driver.findElement(By.className("main-header")).getText();
            System.out.println(Text);
	}

}

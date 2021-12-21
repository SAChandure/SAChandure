package Scrolling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling_Study {

	public static void main(String[] args) throws InterruptedException {
		
       System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.booking.com/index.html?aid=378266;label=bdot-Os1*aFx2GVFdW3rxGd0MYQS541115605091:pl:ta:p1:p22,563,000:ac:ap:neg:fi:tikwd-334108349:lp9299869:li:dec:dm:ppccp=UmFuZG9tSVYkc2RlIyh9YYriJK-Ikd_dLBPOo0BdMww;ws=&gclid=CjwKCAjwzt6LBhBeEiwAbPGOgcEKbTJ5Q7iEP4-2R67GT61WpIlmo4h1x2EtER4ajkuEEfGWCkL0xxoCe-cQAvD_BwE");

		JavascriptExecutor j=((JavascriptExecutor)driver);
		j.executeScript("window.scrollBy(100,1000)");
		Thread.sleep(1000);
		j.executeScript("window.scrollBy(100,-500)");
		Thread.sleep(1000);
		j.executeScript("window.scrollBy(-100,700)");
		Thread.sleep(2000);
		j.executeScript("window.scrollBy(-20,-1500)");
		
	}

	

}

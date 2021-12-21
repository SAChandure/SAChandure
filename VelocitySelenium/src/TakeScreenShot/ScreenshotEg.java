package TakeScreenShot;




import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenshotEg {

	public static void main(String[] args) throws IOException, InterruptedException {
		
      System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
       WebDriver driver=new ChromeDriver();
		driver.get("https://www.jiosaavn.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		String Random = RandomString.make(4);
	   File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   File destination=new File("C:\\Users\\admin\\Desktop\\Velocity Testing Document\\SeleniumScreenShot\\Screenshot"+Random+".png");
	   FileHandler.copy(source,destination);
	   
		
	}

}

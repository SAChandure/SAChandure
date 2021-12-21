package WebelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement6 {

	public static void main(String[] args) {
		
		
		
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
	
		driver.get("https://termprequotes.policybazaar.com/sjb?isSJB=true&pb_source=google_brand&pb_medium=ppc&pb_term=Policybazaar&pb_campaign=PolicyBazaar00PolicyBazaar&gclid=CjwKCAjwn8SLBhAyEiwAHNTJbU09BKJki1P48eH3lKCex643MdUMC5SsnY4cdi9sPcF_RYh7ZxZozxoCSrsQAvD_BwE&pb_content=home_v10_sjb");
		
		String ExpectedText="Term Life Insurance ab poore Bharat ke liye!";
		System.out.println(driver.findElement(By.xpath("//p[contains(text(),'Term Life')]")).getText());
		String ActualText=driver.findElement(By.xpath("//p[contains(text(),'Term Life')]")).getText();
		
		if(ActualText.equals(ExpectedText))
				{
			System.out.println("Text is Matched and Test case Passed");
				}
		else
			System.out.println("Text didnt matched Test Case Failed");
		
	}

}

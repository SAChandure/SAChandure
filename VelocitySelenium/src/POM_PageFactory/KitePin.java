package POM_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePin {
	
	
	@FindBy(id="pin") private WebElement PIN;
	@FindBy(xpath="//button[@type='submit']") private WebElement CountinuewithPIN;
	
	public  KitePin(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		}
	
	public void sendPin()
	{
		PIN.sendKeys("866918");
	}
    
	public void clickOnContinue()
  {
		CountinuewithPIN.click();
  }
}

package POM_with_DDF_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitPIN {

	@FindBy(id="pin") private WebElement PIN;
	@FindBy(xpath="//button[@type='submit']") private WebElement CountinuewithPIN;
	
	public KitPIN(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sendPin(String kpin) {
		PIN.sendKeys(kpin);
	}
	
	public void clickonContinue()
	{
		CountinuewithPIN.click();
	}
}

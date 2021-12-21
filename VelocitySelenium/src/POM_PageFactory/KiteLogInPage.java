package POM_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogInPage {
	
	
	@FindBy(id="userid") private WebElement UserId;
	@FindBy(id="password") private WebElement Password;
	@FindBy(xpath="//button[@type='submit']") private WebElement LoginButton;
	
	public KiteLogInPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		}
	public void sendUserId()
	{
		UserId.sendKeys("DAA677");
	}
 
	public void sendPassword()
	{
		Password.sendKeys("Velocity@123");
	}
	public void clickonLoginButton()
	{
		LoginButton.click();
	}
	
}

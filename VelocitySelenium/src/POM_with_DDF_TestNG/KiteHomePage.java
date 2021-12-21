package POM_with_DDF_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {
@FindBy(xpath="//span[@class='user-id']") private WebElement KiteID;
@FindBy(xpath="//span[@class='icon icon-exit']") private WebElement LogoutButton;

	
	
	public KiteHomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
 
	
	public String userIdvalidation()
	{
		String ActualUserId = KiteID.getText();
		return ActualUserId;
		
	}
	public void clickOnUserID()
	{
		KiteID.click();
	}
	public void clickOnLogout()
	{
		LogoutButton.click();
	}
}
package POM_with_Pagefactory_Excel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage {
	
	@FindBy(id="userid") private WebElement UserID;
	@FindBy(id="password") private WebElement Password;
	@FindBy(xpath="//button[@type='submit']") private WebElement LoginButton;

	
	public KiteLoginPage (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void sendUserID(String UID)
	{
		UserID.sendKeys(UID);
	}
	public void sendPassword(String PWD)
	{
		Password.sendKeys(PWD);
	}
	public void clickOnloginButton()
	{
		LoginButton.click();
	}

}

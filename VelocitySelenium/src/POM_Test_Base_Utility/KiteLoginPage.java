package POM_Test_Base_Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage {

	
	
	
		@FindBy(id="userid") private WebElement UserID;
		@FindBy(id="password") private WebElement Password;
		@FindBy(xpath="//button[@type='submit']") private WebElement LoginButton;
		@FindBy(xpath="//p[@class='error text-center']") private WebElement ErrorMsgButton;
        @FindBy(xpath="//span[@class='su-message']") private WebElement ErrMsgPSWField;
        @FindBy(xpath="//span[text()='User ID should be minimum 6 characters.']") private WebElement ErrMsgIDfield;
		
		public  KiteLoginPage (WebDriver driver)
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
		public String errMessageID()
		{
			String ActualIDError = ErrMsgIDfield.getText();
			return ActualIDError;
		}
		public String errMessagePsw()
		{
			String ActualPWDError = ErrMsgPSWField.getText();
			return ActualPWDError;
		}
		public String getErrorMsgButton()
		{
			String ActualErrorMsgB=ErrorMsgButton.getText();
			return ActualErrorMsgB;
		}
		
	}


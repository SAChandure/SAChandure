package POM_with_Pagefactory_Excel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHome {
	@FindBy(xpath="//span[@class='user-id']") private WebElement KiteID;
	
	
	public KiteHome(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
 
	
	public void userIdvalidation(String ExcUserId)
	{
		String ActualUserId = KiteID.getText();
		
		if(ActualUserId.equals(ExcUserId))
		{
			System.out.println("Test Case is Passed");
		}
		else {
			System.out.println("Test case is failed");
		}
	}
}

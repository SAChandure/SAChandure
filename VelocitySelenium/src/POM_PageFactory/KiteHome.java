package POM_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHome {
	
	@FindBy(xpath="//span[text()='Dashboard']") private WebElement Dashboard;
	@FindBy(xpath="//span[text()='Orders']") private WebElement Orders;
	@FindBy(xpath="(//span[text()='Holdings'])[1]") private WebElement Holdings;
	@FindBy(xpath="(//span[text()='Positions'])[1]") private WebElement Positions;
	@FindBy(xpath="(//span[text()='Funds'])[1]") private WebElement Funds;
	@FindBy(xpath="//span[@class='user-id']") private WebElement KiteID;
	@FindBy(xpath="//a[@target='_self']") private WebElement Logout;
	
	public KiteHome(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		}
	
	public void clickonDashboard()
	{
		Dashboard.click();
	}
	public void clickonOrders()
	{
		Orders.click();
	}
	public void clickonHoldings()
	{
		Holdings.click();
	}
	public void clickonPositions()
	{
	Positions.click();
	}
	public void clickonFunds()
	{
	Funds.click();
	}
	public void KiteIdClick()
	{
		KiteID.click();
	}
	public void getKiteID()
	{
		System.out.println(KiteID.getText());
	}
	public void LogoutButton()
	{
		Logout.click();
	}

	

	
}

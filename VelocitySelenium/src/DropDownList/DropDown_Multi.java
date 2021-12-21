package DropDownList;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Multi {

	public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://techcanvass.com/Examples/multi-select.html");
		
		
	   WebElement mselect = driver.findElement(By.id("multiselect"));
	   
	   Select s=new Select(mselect);
	  System.out.println(s.isMultiple());
	  
	  s.selectByValue("volvo");
	
	  s.selectByVisibleText("Maruti Suzuki");
	 
	  s.selectByIndex(2);
	 
	  s.selectByValue("opel");
	  
	  s.selectByIndex(5);
	  
	  //s.deselectAll();
	  s.getFirstSelectedOption();
	  
	  List<WebElement> DropDownList = s.getAllSelectedOptions();
	  for(int i=0;i<=DropDownList.size()-1;i++)
	  {
		  System.out.println(DropDownList.get(i).getText());
	  }
	  System.out.println("Total selected Element in DropDownList are "+DropDownList.size());
	
	
	
	
	}

}

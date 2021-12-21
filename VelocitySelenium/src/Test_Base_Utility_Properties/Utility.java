package Test_Base_Utility_Properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {

	
	WebDriver driver;

	public static  String getDataFromPropertyFile(String driver) throws EncryptedDocumentException, IOException
	{
		Properties obj=new Properties();
		FileInputStream file=new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\VelocitySelenium\\Property.properties");
		obj.load(file);
		String Value = obj.getProperty(driver);
		return Value;
		
		
	}
	
	public static void  captureScreenShot(WebDriver driver,int TCID) throws IOException
	{
		 File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		   File destination=new File("C:\\Users\\admin\\Desktop\\Velocity Testing Document\\SeleniumScreenShot\\Screenshot"+TCID+".png");
		   FileHandler.copy(source,destination);
	}

	}

	


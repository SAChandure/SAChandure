package POM_Test_Base_Utility;

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
	
	
	
	
	public static  String getDataFromExcel(int rownum,int colnum) throws EncryptedDocumentException, IOException
	{
		
		FileInputStream file=new FileInputStream("E:\\New Study Materials\\imp document.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet4");
		String Value = sh.getRow(rownum).getCell(colnum).getStringCellValue();
		return Value ;
		
	}

	
	
	
	public static void  captureScreenShot(WebDriver driver,int TCID) throws IOException
	{
		 File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		   File destination=new File("C:\\Users\\admin\\Desktop\\Velocity Testing Document\\SeleniumScreenShot\\Screenshot"+TCID+".png");
		   FileHandler.copy(source,destination);
	}
}

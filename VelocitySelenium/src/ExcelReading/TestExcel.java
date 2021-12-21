package ExcelReading;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		   
		
		
		FileInputStream Myfile=new FileInputStream("E:\\New Study Materials\\imp document.xlsx");
		//String OutPut = WorkbookFactory .create(Myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	    //System.out.println(OutPut);
	    
	    //double output1 = WorkbookFactory.create(Myfile).getSheet("Sheet1").getRow(1).getCell(2).getNumericCellValue();	
	    //System.out.println(output1);	
	    boolean output1 = WorkbookFactory.create(Myfile).getSheet("Sheet1").getRow(2).getCell(1).getBooleanCellValue();	
	    System.out.println(output1);	
	}

}

package ExcelReading;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FullExcelReading {

	

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream f=new FileInputStream("E:\\\\New Study Materials\\\\imp document.xlsx");
	     Sheet sh = WorkbookFactory.create(f).getSheet("Sheet1");
	     int LastRowIndex = sh.getLastRowNum();
	     for(int i=0;i<=LastRowIndex;i++)
	     {
	    	 int LastColumnIndex = sh.getRow(i).getLastCellNum()-1;
	    	 for(int j=0;j<=LastColumnIndex;j++)
	    	 {
	    		 Cell CellInfo = sh.getRow(i).getCell(j);
	    		 CellType TypeofCell = CellInfo.getCellType();
	    		 
	    		 if(TypeofCell==CellType.STRING)
	    		 {
	    			String Value = CellInfo.getStringCellValue();
	    			System.out.print(Value+" ");
	    		 }
	    		 if(TypeofCell==CellType.NUMERIC)
	    		 {
	    			double Value = CellInfo.getNumericCellValue();
	    			System.out.print(Value+" ");
	    		 } 
	    		 if(TypeofCell==CellType.BOOLEAN)
	    		 {
	    			boolean Value = CellInfo.getBooleanCellValue();
	    			System.out.print(Value+" ");
	    		 }
	    	 }
	    	 System.out.println();
	     }

	}

}

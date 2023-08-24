package genericLibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	private Workbook workbook;
     public void excelInti(String excelpath) {
    	 FileInputStream fis=null;
    	 try {
			 fis= new FileInputStream(excelpath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
    	 try {
			workbook=WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException |IOException e) {
			e.printStackTrace();
		}
     }
	
     public Map<String, String> getData(String sheetname,String expectedTest){
    	 Map<String, String> map=new HashMap<String, String>();
    	 DataFormatter df=new DataFormatter();
    	  Sheet sheet=workbook.getSheet(sheetname);
    	    for(int i=0;i<=sheet.getLastRowNum();i++) {
    	    	if(df.formatCellValue(sheet.getRow(i).getCell(1)).equals(expectedTest)) {
    	    		for(int j=i;j<=sheet.getFirstRowNum();j++) {
    	    			String key=df.formatCellValue(sheet.getRow(j).getCell(2));
    	    			String value=df.formatCellValue(sheet.getRow(j).getCell(3));
    	    			map.put(key, value);
    	    			if(key.equals("####")) {
    	    				break;
    	    			    }
    	    		}
    	    		break;
    	    	}
    	    }
    	  
    	  return map;
    	  
     }
	
	public void writeToExcel(String sheetName ,Object expectedTest,String status,String excelPath) {
		DataFormatter df=new DataFormatter();
		 Sheet sheet=workbook.getSheet(sheetName);
		   for(int i=0;i<=sheet.getLastRowNum();i++) {
			if(df.formatCellValue(sheet.getRow(i).getCell(1)).equals(expectedTest)) {
				   Cell cell=sheet.getRow(i).createCell(4);
				   cell.setCellValue(status);
				   break;
			}
		   }
		   FileOutputStream fos=null;
		   try {
			fos=new FileOutputStream(excelPath);
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		try {
			workbook.write(fos);
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}	
}

    public 	void closeExcel() {
    	try {
			workbook.close();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    }
}
	


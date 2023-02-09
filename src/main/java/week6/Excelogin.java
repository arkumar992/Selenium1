package week6;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
@Test

public class Excelogin {
	
	public void excelLogin() throws IOException
	{
		//open excel from file path
		
		XSSFWorkbook wbook = new XSSFWorkbook("./data/Usernames.xlsx");
		
		// Go to sheet
		
		XSSFSheet sheet = wbook.getSheet("Sheet1");
		
		// Find the row count
		
		int rowcount = sheet.getLastRowNum();
		
		// Find the cell count
		
		int columnCount = sheet.getRow(0).getLastCellNum();
		//Read the Data
		
		for (int i=1;i<=rowcount;i++)
		{
			XSSFRow row = sheet.getRow(i);
			for (int j=0;j<columnCount;j++)
			{
				XSSFCell cell= row.getCell(j);
				String data =cell.getStringCellValue();
				System.out.println(data);
			
	
				
				
				
			}
			
		}
		
		
	}

}

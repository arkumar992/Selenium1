package testNg;

import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Testdatacall {
	static XSSFSheet sheet;
	
	public static ArrayList<Object[]> getTestdata()
	{
		 ArrayList<Object[]> mydata = new  ArrayList<Object[]>();
		 
		 
		 try {
			 
			 XSSFWorkbook wbook = new XSSFWorkbook("D:\\Sel\\Selenium1\\data\\gmiltest.xlsx");
			  sheet = wbook.getSheet("Sheet1");
			 System.out.println(sheet.getLastRowNum());
		
		 }
		 catch (Exception e)
		 {
			 e.printStackTrace();
		 }
		 System.out.println(sheet.getLastRowNum());
		 //int columnCount = sheet.getRow(0).getLastCellNum();
		 
		 for(int i = 1; i<=sheet.getLastRowNum();i++)
		 {
			 
			 XSSFRow row = sheet.getRow(i);
			 
//			 for (int j=1;j<columnCount;j++)
//				{
//			 
			 XSSFCell cell = row.getCell(0);
			 XSSFCell cell1 = row.getCell(1);
			 XSSFCell cell2 = row.getCell(2);
			 String fistname = cell.getStringCellValue();
			 String lastname = cell1.getStringCellValue();
			 String userid = cell2.getStringCellValue();
			 
			 Object obj[] =  {fistname,lastname,userid};
			 mydata.add(obj);
		 }
		 return mydata;
		}
}

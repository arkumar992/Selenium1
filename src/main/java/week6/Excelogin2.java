package week6;




import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelogin2 {
	//@Test
	public Object[][] readXL(String filename) throws IOException
	{
//XSSFWorkbook Obj = new XSSFWorkbook("./data/Login.xlsx");
		//XSSFWorkbook Obj = new XSSFWorkbook("D:\New folder/"+filename+".xlsx");
		XSSFWorkbook Obj = new XSSFWorkbook("./data/"+filename+".xlsx");
XSSFSheet sheet = Obj.getSheetAt(0);
int rowCount = sheet.getLastRowNum();
int columncount = sheet.getRow(0).getLastCellNum();
Object[][] data= new Object [rowCount][columncount]; 
for (int i=1; i<=rowCount; i++) {
	XSSFRow row = sheet.getRow(i);
	for (int j=0; j<columncount; j++) 
	{
		XSSFCell cell = row.getCell(j);
		/*String value = cell.getStringCellValue();
		System.out.println(value);*/
		data[i-1][j]=cell.getStringCellValue();
	}
}
Obj.close();
return data;
}
}
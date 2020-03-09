package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteInExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\HP\\eclipse-workspace\\Automation\\src\\filehandling\\excelfile_testdata.xlsx");

		
		  XSSFWorkbook wb = new XSSFWorkbook(fis); 
		  XSSFSheet sheet =  wb.getSheet("Sheet1");
		 XSSFRow row = sheet.getRow(0);
		 XSSFCell cell = row.getCell(0);
		  cell.setCellValue("shubhangi");
		  FileOutputStream file2 = new FileOutputStream("C:\\Users\\HP\\eclipse-workspace\\Automation\\src\\filehandling\\excelfileoutput.xlsx");
		   
		 // String data = cell.getStringCellValue(); System.out.println(data);
		 

		
	}

	
	// get row count , get column count , get row data , get column data 
}

package filehandling;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

@SuppressWarnings("unused")
public class ReadExcelFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\HP\\eclipse-workspace\\Automation\\src\\filehandling\\excelfile_testdata.xlsx");

		/*
		 * XSSFWorkbook wb = new XSSFWorkbook(fis); XSSFSheet sheet =
		 * wb.getSheet("Sheet1"); XSSFRow row = sheet.getRow(0); XSSFCell cell =
		 * row.getCell(0);
		 * 
		 * String data = cell.getStringCellValue(); System.out.println(data);
		 */

		// alternative way

		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		String data1 = sheet.getRow(0).getCell(0).getStringCellValue();
		//System.out.println(data1);

		int rowcount = sheet.getLastRowNum();
		System.out.println("rowcount : " + rowcount);
		int column = sheet.getRow(0).getLastCellNum();
		System.out.println("column : " + column);

		// excel here file has 16 rows but it returns 15 so here we have to edit the for
		// look for more one as r<=rowcount

		for (int r = 0; r <= rowcount; r++) {
			//String data2 = sheet.getRow(0).getCell(0).getStringCellValue();
			System.out.println(" ");
			for (int c = 0; c < column; c++) {
				String data3 = sheet.getRow(r).getCell(c).getStringCellValue();
				System.out.print(data3 + " ");
			}
			System.out.println(" ");
			
		}

	}

}

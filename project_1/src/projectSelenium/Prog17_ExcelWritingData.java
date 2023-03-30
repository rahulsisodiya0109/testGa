package projectSelenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Prog17_ExcelWritingData {

	public static void main(String[] args) throws Exception {
		
		// Create an object of File class to open xlsx file
		File src = new File("D:\\SELENIUM_AUTOMATION_TESTING\\DemoToTest.xlsx");

		// Create an object of FileInputStream class to read excel file
		FileInputStream fis = new FileInputStream(src);

		// creating workbook instance that refers to .xlsx file
		XSSFWorkbook wb = new XSSFWorkbook(fis);

		// creating a Sheet object using the sheet Name
		XSSFSheet sh = wb.getSheet("Sheet1");
		
		//create a cell object to enter value in it using cell Index
		sh.createRow(8).createCell(2).setCellValue("Sisodiya");
		
		//write the data in excel using output stream
        FileOutputStream fos = new FileOutputStream("D:\\SELENIUM_AUTOMATION_TESTING\\DemoToTest.xlsx");
        wb.write(fos);
        wb.close();
        
        System.out.println("done");


	}

}

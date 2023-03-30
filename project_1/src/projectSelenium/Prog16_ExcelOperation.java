package projectSelenium;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog16_ExcelOperation {

	public static void main(String[] args) throws Exception {

		// Specify the location of excel file
		File src = new File("D:\\SELENIUM_AUTOMATION_TESTING\\DemoToTest.xlsx");

		// Load File
		FileInputStream fis = new FileInputStream(src);

		// Load WorkBook
		XSSFWorkbook wb = new XSSFWorkbook(fis);

		// Load WorkSheet
		XSSFSheet sh = wb.getSheet("Sheet1");

		// Print Loaded Sheet Name
		System.out.println(sh.getSheetName());

		// Print cell data from sheet
		System.out.println(sh.getRow(0).getCell(1).getStringCellValue());

		// Print Number of Rows
		System.out.println((sh.getLastRowNum() + 1)); // this would print total number of rows -1 so will add 1

		// other to way to get number of rows
		System.out.println(sh.getPhysicalNumberOfRows());

		// Print number of columns
		System.out.println(sh.getRow(0).getLastCellNum());

		// other way to get column
		System.out.println(sh.getRow(0).getPhysicalNumberOfCells());

		// Real time usage
		System.setProperty("webdriver.chrome.driver",
				"D:\\SELENIUM_AUTOMATION_TESTING\\SOFTWARE\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://facebook.com/");
		Thread.sleep(3000);
		
		//enter date from excel
		String user= sh.getRow(1).getCell(1).getStringCellValue();
		driver.findElement(By.id("email")).sendKeys(user);
		Thread.sleep(5000);
		driver.close();
		
		wb.close();		//closing the workbook
		
		

	}

}

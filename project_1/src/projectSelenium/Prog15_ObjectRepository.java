package projectSelenium;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog15_ObjectRepository {

	public static void main(String[] args) throws Exception {

		// specify the location of property file
		File src = new File("D:\\SELENIUM_AUTOMATION_TESTING\\data\\eclipse-workspace\\project_1\\Repository\\object_repo.properties");

		// create FileInputStream class object to load the file
		FileInputStream fis = new FileInputStream(src);

		// create properties class object to read the file
		Properties pro = new Properties();
		pro.load(fis);

		// setting CHROME property and launch browser
		System.setProperty("webdriver.chrome.driver",
				"D:\\SELENIUM_AUTOMATION_TESTING\\SOFTWARE\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.get(pro.getProperty("URL"));
		driver.findElement(By.id(pro.getProperty("Email"))).sendKeys(pro.getProperty("username"));
		driver.findElement(By.xpath(pro.getProperty("Pass"))).sendKeys(pro.getProperty("password"));
		
		
	}

}

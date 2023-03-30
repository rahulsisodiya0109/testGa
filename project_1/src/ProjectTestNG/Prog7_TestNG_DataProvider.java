package ProjectTestNG;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Prog7_TestNG_DataProvider {

	WebDriver driver;

	@BeforeClass
	public void setEnv() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"D:\\SELENIUM_AUTOMATION_TESTING\\SOFTWARE\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://facebook.com/");
		Thread.sleep(3000);
	}

	@DataProvider
	public Object[][] dataset() throws Exception {

		// specify the location of property file
		File src = new File(
				"D:\\SELENIUM_AUTOMATION_TESTING\\data\\eclipse-workspace\\project_1\\Repository\\object_repo.properties");

		// create FileInputStream class object to load the file
		FileInputStream fis = new FileInputStream(src);

		// create properties class object to read the file
		Properties pro = new Properties();
		pro.load(fis);

		Object arr[][] = new Object[3][2];

		arr[0][0] = pro.getProperty("username");
		arr[0][1] = pro.getProperty("password");

		arr[1][0] = "user_2";
		arr[1][1] = "pass_2";

		arr[2][0] = "user_3";
		arr[2][1] = "pass_3";

		return arr;
	}

	@Test(dataProvider = "dataset")
	public void enterData(String user, String pass) throws Exception {

		Thread.sleep(3000);
		driver.findElement(By.id("email")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys(user);
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys(pass);
		Thread.sleep(3000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);

	}

}

package projectSelenium;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog15_log4j {

	public static void main(String[] args) {
		
		//create logger instance for which we want to create a log file
		Logger logger= Logger.getLogger("Prog15_log4j");
		
		//configure log4j property file
		PropertyConfigurator.configure("D:\\SELENIUM_AUTOMATION_TESTING\\data\\eclipse-workspace\\project_1\\log4j.properties");
		
		//creating instance of chrome browser
		System.setProperty("webdriver.chrome.driver",
				"D:\\SELENIUM_AUTOMATION_TESTING\\SOFTWARE\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		logger.info("creating instance of chrome browser");
		
		driver.manage().window().maximize();
		logger.info("maximizing the window");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		logger.info("giving implicit wait");
		
		driver.manage().deleteAllCookies();
		logger.info("deleting cookies");
		
		driver.get("https://www.facebook.com/");
		logger.info("open facebook link");
		
		driver.quit();
		logger.info("close all windows");
		

	}

}

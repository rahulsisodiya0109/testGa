package projectSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Prog6_ExplicitWait {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"D:\\SELENIUM_AUTOMATION_TESTING\\SOFTWARE\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");

		// enter username
		driver.findElement(By.id("email")).sendKeys("rahul@abc.com");

		// use explicit wait to check if the password field is visible and enter the password
		WebDriverWait wt = new WebDriverWait(driver, 30); // here driver the webdriver object and 30 is in seconds and will always be in seconds
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass"))).sendKeys("12345");
		/*
		 * here ExpectedConditions is a class and we can use method
		 * visibilityOfElementLocated and like wise other to check if met the condition
		 * in above case it will wait till it get locator as pass
		 */

		
		
	}

}

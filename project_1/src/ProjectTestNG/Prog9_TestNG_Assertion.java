package ProjectTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Prog9_TestNG_Assertion {

	WebDriver driver;

	@Test
	public void testCase1() throws Exception {

		String expected = "Sorry, we don't recognize this email.";

		System.setProperty("webdriver.chrome.driver",
				"D:\\SELENIUM_AUTOMATION_TESTING\\SOFTWARE\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://login.yahoo.com/");

		driver.findElement(By.id("login-signin")).click();
		Thread.sleep(3000);

		String actual = driver.findElement(By.id("username-error")).getText();

		Assert.assertEquals(actual, expected);

		System.out.println("Equal assertion verified...");

		driver.close();
	}

	

}

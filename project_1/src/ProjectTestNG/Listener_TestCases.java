package ProjectTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ProjectTestNG.Listeners.class)

public class Listener_TestCases {

	WebDriver driver;

	@BeforeClass
	public void env() {

		System.setProperty("webdriver.chrome.driver",
				"D:\\SELENIUM_AUTOMATION_TESTING\\SOFTWARE\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	}

	// test to pass as to verify the login
	@Test
	public void Login() {
		driver.findElement(By.id("email")).sendKeys("abc@yahoo.com");
	}

	// Forcefully failed this test as to verify listener.
	@Test
	public void TestToFail() {
		System.out.println("This method to test fail");
		Assert.assertTrue(false);
	}
}

package ProjectTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Prog8_TestNG_TakeScreenshot2 {

	// this is the main program and program to take screenshot is previous one
	//will run this program and in @AfterMethod this would call the previous one
	
	Prog8_TestNG_TakeScreenshot1 t1 = new Prog8_TestNG_TakeScreenshot1();

	@Test
	public void doLogin() throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"D:\\SELENIUM_AUTOMATION_TESTING\\SOFTWARE\\chromedriver_win32 (1)\\chromedriver.exe");
		t1.driver = new ChromeDriver();
		t1.driver.manage().window().maximize();
		t1.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		t1.driver.get("https://www.facebook.com/");
		t1.driver.manage().deleteAllCookies();
		Thread.sleep(3000);
		t1.driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		t1.driver.findElement(By.id("pass")).sendKeys("123456");

		// pass the wrong id so that the test case will fail
		t1.driver.findElement(By.id("wrong_id")).click();

	}
	

	@AfterMethod
	public void takeScreenshot(ITestResult result2) throws Exception {
		t1.captureScreenshot(result2);
	}
	

}

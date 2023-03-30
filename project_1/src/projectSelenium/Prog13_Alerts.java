package projectSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Prog13_Alerts {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"D:\\SELENIUM_AUTOMATION_TESTING\\SOFTWARE\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(3000);
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(2000);
		
		//Verify Alert Text
		System.out.println(driver.switchTo().alert().getText());
		String expResult = "Do you confirm action?";
		Assert.assertEquals(driver.switchTo().alert().getText(), expResult);
		System.out.println("Alert Text is verified");
		
		//Accept the Alert
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		System.out.println("Alert Accepted");
		
		//dismiss the alert
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		System.out.println("Alert Dismissed");
		Thread.sleep(3000);
		driver.close();
		
	}

}

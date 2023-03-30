package project_Garima;

import java.util.concurrent.TimeUnit;

import org.joda.time.Seconds;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pro3_alert {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\panther\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
//		String er = "Do you confirm action?";
//		Assert.assertEquals(driver.switchTo().alert().getText(),er);
//		System.out.println("confirm action is veriffied");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		System.out.println("alertaccepted");
		Thread.sleep(3000);
		 driver.findElement(By.id("confirmButton")).click();
		 Thread.sleep(2000);
		 driver.switchTo().alert().dismiss();
		 System.out.println("alert dismissed");
		 Thread.sleep(2000);
		

	}

}

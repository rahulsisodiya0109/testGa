package projectSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog12_iFrames {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\SELENIUM_AUTOMATION_TESTING\\SOFTWARE\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://paytm.com/");
		Thread.sleep(3000);
		
		//click on Sign in
		driver.findElement(By.xpath("//*[text()='Sign In']")).click();
		
		List<WebElement> allFrames= driver.findElements(By.tagName("iFrame"));
		System.out.println("total number of frames are "+ allFrames.size());
		
		for(int i=0;i<allFrames.size();i++) {
			driver.switchTo().frame(i);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[contains(text(),'Watch Video')]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[text()='close']")).click();
		}
		

	}

}

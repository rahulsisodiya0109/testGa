package projectSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GP2 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM_AUTOMATION_TESTING\\SOFTWARE\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		/*driver.findElement(By.xpath("//*[contains(@id,'email')]")).sendKeys("garima");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(@id,'email')]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(text(),'New')]")).click();
		driver .findElement(By.xpath("//*[contians(text(),'']"));*/
		driver.findElement(By.xpath("//*[contains(@id,'email')]")).sendKeys("garima7880");
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[contains(text(),'New Account')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(text(),'Female')]")).click();
		
				
		

	}

}

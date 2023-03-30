package projectSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog3_RadioButton {

	public static void main(String[] args) throws Exception {


		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM_AUTOMATION_TESTING\\SOFTWARE\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//find the element and perform click action
		driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click(); 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(text(),'Male')]")).click();
		
	}

}

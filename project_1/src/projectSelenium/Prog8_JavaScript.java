package projectSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog8_JavaScript {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"D:\\SELENIUM_AUTOMATION_TESTING\\SOFTWARE\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");

		//type casting of two interfaces to use features of both the interfaces
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		//Locate web element using JavascriptExecutor
		jse.executeScript("document.getElementById('email').value='abc@gmail.com'");
		jse.executeScript("document.getElementById('pass').value='12345'");
		
		//Scroll the webpage via JavaScript
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0, 500)");  // this will scroll down
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0, -500)");  // this will scroll up
	}

}

package projectSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog1_OpenURL {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM_AUTOMATION_TESTING\\SOFTWARE\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/"); 

		// manage() to maximize the window
		driver.manage().window().maximize();

		// for delete all cookies
		driver.manage().deleteAllCookies();

	}

}

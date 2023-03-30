package projectSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog2_Methods {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM_AUTOMATION_TESTING\\SOFTWARE\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		// manage() to maximize the window
		driver.manage().window().maximize();

		// for delete all cookies
		driver.manage().deleteAllCookies();

		// to create the wait
		Thread.sleep(2000);

		// launching application through the navigate method
		driver.navigate().to("https://www.facebook.com/");

		// refresh the webpage
		Thread.sleep(2000);
		driver.navigate().refresh();

		// navigate to back
		Thread.sleep(2000);
		driver.navigate().back();

		// navigate to forward
		Thread.sleep(2000);
		driver.navigate().forward();

		// fetch the current url
		Thread.sleep(2000);
		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);

		// get the title of webpage
		Thread.sleep(2000);
		System.out.println(driver.getTitle());

		// close the current window
		Thread.sleep(2000);
		driver.close();

		// close all the windows opened
		Thread.sleep(2000);
		driver.quit();

	}

}

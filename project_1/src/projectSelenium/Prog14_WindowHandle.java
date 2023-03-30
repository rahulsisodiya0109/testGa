package projectSelenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog14_WindowHandle {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"D:\\SELENIUM_AUTOMATION_TESTING\\SOFTWARE\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(3000);
		driver.findElement(By.id("windowButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("messageWindowButton")).click();

		// print how many windows are open
//use Set interface to store all the windows open its similar to List but Set is used since all window IDs are unique alpha-numeric values
		// will use getWindowHandles() as method to get all windows
		Set<String> allWindowID = driver.getWindowHandles();
		System.out.println(allWindowID);
		System.out.println(allWindowID.size());

		// create reference to Iterator Interface which will indicate all the stored
		// windows
		// .next() method is used to identify the next available window
		Iterator<String> abc = allWindowID.iterator();
		String window1 = abc.next();
		String window2 = abc.next();
		String window3 = abc.next();

		System.out.println(window1 + "    " + window2 + "    " + window3);
		driver.switchTo().window(window3).close();

		// switch to child window and print it's title
		driver.switchTo().window(window2);
		System.out.println(window2);
		System.out.println(driver.getTitle()); // printing title of the window
		Thread.sleep(3000);
		driver.close(); // close the current window

		// switch to parents window
		driver.switchTo().window(window1);
		System.out.println(window1);
		System.out.println(driver.getTitle()); // printing title of the window
		Thread.sleep(3000);

		// driver.quit(); //close the parent window and all it's associated ones

		// Now performing operation at "New Window Message"
		driver.findElement(By.id("messageWindowButton")).click();
		driver.switchTo().window(window3);
		System.out.println(window3);
		System.out.println(driver.getTitle());

		Thread.sleep(3000);
		driver.close();

	}

}

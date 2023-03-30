package projectSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog5_ImplicitWait {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"D:\\SELENIUM_AUTOMATION_TESTING\\SOFTWARE\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // here TimeUnit is enum
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("how stuff works");

		// handling the Auto-Suggestion
		List<WebElement> list1 = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		System.out.println("Total List..." + list1.size());

		for (int i = 0; i < list1.size(); i++) {
			String expected = "how stuff works podcast";
			if (list1.get(i).getText().equalsIgnoreCase(expected)) {
				list1.get(i).click();
				break;
			}
		}

	}

}

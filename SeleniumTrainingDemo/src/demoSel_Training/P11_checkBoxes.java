package demoSel_Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P11_checkBoxes {

	public static void main(String[] args) throws InterruptedException {
		// Check Box

		System.setProperty("webdriver.chrome.driver",
				"D:\\SELENIUM_AUTOMATION_TESTING\\SOFTWARE\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/"); // open amazon.in
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Phone"); // search phones
		driver.findElement(By.cssSelector("#nav-search-submit-button")).click();

		//Thread.sleep(2000);
		// click one plus
		driver.findElement(By.xpath("")).click();
//click not working probably need to switch the control to it and check
	//	Thread.sleep(5000);
//		driver.quit();

	}

}

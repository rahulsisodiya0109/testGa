package projectSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Prog10_MouseSimulation1 {

	public static void main(String[] args) throws Exception {
		// This program to demonstrate mouse drag and drop utility

		System.setProperty("webdriver.chrome.driver",
				"D:\\SELENIUM_AUTOMATION_TESTING\\SOFTWARE\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/droppable/");

		// here we have an iframe on webpage so will switch to frame first
		// find the frames on webpage
		List<WebElement> allFrames = driver.findElements(By.tagName("iFrame"));
		System.out.println("Total number of frames are " + allFrames.size());

		// now switch to frame, in case will have multiple frame we can use for loop for
		// any 'i' frame
		driver.switchTo().frame(0);

		// will find the draggable & droppable web element
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		Thread.sleep(3000);

		// using Action Class to drag and drop Web Element
		Actions act = new Actions(driver);

		// drag and drop
		act.dragAndDrop(drag, drop).build().perform();

	}

}

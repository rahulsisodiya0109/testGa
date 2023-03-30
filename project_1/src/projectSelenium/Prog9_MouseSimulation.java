package projectSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Prog9_MouseSimulation {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"D:\\SELENIUM_AUTOMATION_TESTING\\SOFTWARE\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		Thread.sleep(2000);
		/*
		 * Actions act = new Actions(driver);
		 * act.sendKeys(Keys.ESCAPE).build().perform();
		 */
		
		//Create WebElement reference
		WebElement Electro = driver.findElement(By.xpath("//*[text()='Electronics']"));
		
		//Mouse simulation using Action Class
		//Will create parameterized constructor of Action Class passing WebDriver Object
		Actions act = new Actions(driver);
		
		//Mouse hover to Electronics WebElement
		Thread.sleep(3000);
		act.moveToElement(Electro).build().perform();
	
		//SubMenu operation
		WebElement SubElectro = driver.findElement(By.xpath("//*[text()='Gaming']"));
		act.moveToElement(SubElectro).build().perform();
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//*[text()='Controllers']")).click();
	
		//right click on webpage
		Thread.sleep(3000);
		act.contextClick().build().perform();
		
		//Perform Key Events
		WebElement home=driver.findElement(By.xpath("//*[text()='Home']"));
		Thread.sleep(3000);
		act.sendKeys(home, Keys.ENTER).build().perform();
		//act.sendKeys(Keys.ENTER).build().perform();  // this will simply enter
	}

}

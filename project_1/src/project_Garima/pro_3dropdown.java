package project_Garima;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class pro_3dropdown {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\panther\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(text(),'new account')]")).click();
		
//		List<WebElement> dd = driver.findElements(By.xpath("//select[@id='month']/option"));
//		System.out.println(dd.size());
//		dd.get(4).click();
	Thread.sleep(3000);
		
		WebElement birthmonth= driver.findElement(By.xpath("//select[@id='month']"));
		Select bm=new Select(birthmonth);
		bm.selectByIndex(5);
		bm.selectByVisibleText("Dec");

	}

}

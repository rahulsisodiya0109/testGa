package projectSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GP4_Dropdown {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"D:\\SELENIUM_AUTOMATION_TESTING\\SOFTWARE\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(text(),'New Account')]")).click();
		Thread.sleep(3000);

		// !st way

		List<WebElement> birthmonth = driver.findElements(By.xpath("//select[@id='month']/option"));
		System.out.println(birthmonth.size());
		System.out.println(birthmonth.get(4).isEnabled());
		System.out.println(birthmonth.get(4).isDisplayed());
		birthmonth.get(6).click();
		Thread.sleep(2000);

		// second way

		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select bm = new Select(month);
		bm.selectByIndex(1);
		Thread.sleep(2000);
		bm.selectByValue("2");
		Thread.sleep(2000);
		bm.selectByVisibleText("Dec");
		System.out.println(bm.getFirstSelectedOption().getText());
		driver.close();
		
		// third way
		
		WebElement month1=driver.findElement(By.xpath("//select[@id='month']"));
		Select bm1=new Select(month1);
		List<WebElement> dd = bm1.getOptions();
		System.out.println("size of the dropdown lis=" +dd.size());
		for(int i=0;i<dd.size();i++)
		{
			String dv= dd.get(i).getText();
			if(dv.equalsIgnoreCase("Dec"))
			{
				dd.get(i).click();
			}
		}
		
		
		
		
		
		
		
		
		
	}

}

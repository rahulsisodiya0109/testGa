package project_Garima;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.record.PageBreakRecord.Break;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pro5_webtable {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\panther\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://money.rediff.com/gainers");
		Thread.sleep(2000);
		
		List<WebElement> allCompany = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
		Thread.sleep(2000);
		List<WebElement> price= driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		
		System.out.println("print all the company names " + allCompany.size());
		
		for(int i=0; i< allCompany.size();i++)
		{
			String exp ="Advik Capital";
			if(allCompany.get(i).getText().equalsIgnoreCase(exp))
			{
				System.out.println("company="+allCompany.get(i).getText()+"price="+price.get(i).getText());
				allCompany.get(i).click();
				break;
			}
		}
		
		

	}

}

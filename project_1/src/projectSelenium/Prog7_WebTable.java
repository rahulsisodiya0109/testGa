package projectSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog7_WebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\SELENIUM_AUTOMATION_TESTING\\SOFTWARE\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://money.rediff.com/gainers");

		// lets try to find a particular company
		// Create list of all the companies
		List<WebElement> allCompany = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
		/*
		 * here will use table inside which tbody and then tr(for all row) then td(for
		 * all data) but since we need the first data column so will pass [1] and then
		 * the <a>
		 */
		
		//list all the prices
		List<WebElement> allPrice= driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		
		System.out.println("total number of companies  "+ allCompany.size());
		for(int i=0;i<allCompany.size();i++) {
			String expected="Advik Capital";
			if(allCompany.get(i).getText().equalsIgnoreCase(expected)) {
				System.out.println("Comapany Name : "+ allCompany.get(i).getText() + "===== Current Price : "+ allPrice.get(i).getText());
				allCompany.get(i).click();
				break;
			}
					
		}
	}

}

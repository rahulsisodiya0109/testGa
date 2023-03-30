package projectSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Prog4_DropDown {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"D:\\SELENIUM_AUTOMATION_TESTING\\SOFTWARE\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(5000);

		// 1st way to select from dropdown, create list and use get() method

		List<WebElement> bm = driver.findElements(By.xpath("//select[@id='month']/option"));
		System.out.println("size is " + bm.size());
		bm.get(0).click();
		Thread.sleep(2000);
		bm.get(5).click();
		Thread.sleep(2000);

		// 2nd way to select from dropdown, create object of select class and use select
		// class methods

		WebElement bm1 = driver.findElement(By.xpath("//select[@id='month']"));
		Select month = new Select(bm1); // select class parameterized constructor
		month.selectByVisibleText("Dec");
		Thread.sleep(2000);
		month.selectByValue("3");
		Thread.sleep(2000);
		month.selectByIndex(4);
		System.out.println(month.getFirstSelectedOption().getText());

		// 3rd way - will run the loop and store option in list

		WebElement bm2 = driver.findElement(By.xpath("//select[@id='month']"));
		Select month1 = new Select(bm2); // select class parameterized constructor
		List<WebElement> mList = month1.getOptions(); // to demonstrate getOption() method
		System.out.println("way 3 size would be      " + mList.size()); // here it should be 12

		for (int i = 0; i < mList.size(); i++) {
			String dropdownvalues = mList.get(i).getText();
			if (dropdownvalues.equalsIgnoreCase("Aug")) {
				mList.get(i).click();

			}

		}

		// 4th way for selecting multiple text
		System.out.println("4th way..................");

		System.out.println(month1.isMultiple()); // would be false
//		month1.selectByIndex(3);
//		month1.selectByVisibleText("Dec");
//
//		// to deselect
//		month1.deselectByIndex(0);
//
//		// to deselect all
//		month1.deselectAll();

		// 5th way
		System.out.println("5th way..................");
		bm2.sendKeys("Feb");

		// 6th way
		System.out.println("5th way..................");

		driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Mar");

		Thread.sleep(5000);
		driver.close();

	}

}

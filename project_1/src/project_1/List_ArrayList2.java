package project_1;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class List_ArrayList2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//have to set the property and pass the URL
		   //to catch all web elements into list
    List<WebElement> myList=driver.findElements(By.className("accordion-toggle"));

    //myList contains all the web elements
    //if you want to get all elements text into array list
    List<String> all_elements_text=new ArrayList<>();

    for(int i=0; i<myList.size(); i++){

        //loading text of each element in to array all_elements_text
        all_elements_text.add(myList.get(i).getText());

        //to print directly
        System.out.println(myList.get(i).getText());

    }
		
		

	}

}

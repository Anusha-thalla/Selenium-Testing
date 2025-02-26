package WebdriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GetMethods {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		//get method is used to laumch the application it wont return anything it is a void
		driver.get("https://demo.opencart.com");
		
		//returns the title of the web page
		System.out.println(driver.getTitle());

	//returns the current url of the web page
		System.out.println(driver.getCurrentUrl());
	
	//returns the entire page source of the web page
	System.out.println(driver.getPageSource());
	
	//return the id of single browser window
	String window= driver.getWindowHandle();
	System.out.println("id "+window);   //3E46678765BD567E5A755C9D93E924B9
	
	driver.findElement(By.linkText("Tablets")).click();
	Set<String> ids= driver.getWindowHandles(); //set doesnt allow duplicate values
	System.out.println("The ids are :"+ids);
	
	}

}

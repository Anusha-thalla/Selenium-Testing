package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class locators {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
    // locating name element
		
		
	//driver.findElement(By.name("search")).sendKeys("Anu");
 
		// locating id element
		
		boolean logoDisplayedStatus= driver.findElement(By.id("logo")).isDisplayed();
		System.out.println(logoDisplayedStatus);
		
		//locating linktext element & partial linktext element 
		
		driver.findElement(By.linkText("Tablets")).click(); // we can locate elememt uniquely
		driver.findElement(By.partialLinkText("Tablet")).click(); // we will give just some portion in the link so 
		 //it may not identify an elemnt uniquely
		
		// tag name and class (used to locate group of elements)
		 List<WebElement> headerLinks = driver.findElements(By.className("list-inline-item"));
		 System.out.println(headerLinks.size());
		
		 //tagname                                                                  

		 List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		 List<WebElement> images = driver.findElements(By.tagName("img"));
		 System.out.println(images.size());
		 
	}

}

package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AssignmentLocators {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		List<WebElement> links= driver.findElements(By.tagName("a"));
System.out.println("The total number of links are : "+links.size());
List<WebElement> images= driver.findElements(By.tagName("img"));
System.out.println("The total number of links are : "+images.size());
    
     //driver.findElement(By.linkText("Monitors")).click();
     driver.findElement(By.partialLinkText("Monitor")).click();
     
	}

}

package HandleWebElements;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class CheckBoxes {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//select one checkbox
		driver.findElement(By.xpath("//input[@id ='sunday']")).click();
		
		//to handle multiple checkboxes
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class ='form-check-input' and @type = 'checkbox']"));
	
	for(int i =0 ; i<checkboxes.size();i++) {
		
		checkboxes.get(i).click(); 
		
	}
		
		for(WebElement checkbox : checkboxes) {
			checkbox.click();
		}
		
		//select last 3 checkboxes (no of cb - how many want to select) 7-3 = 4 (so index starts from 4) 
		for(int i =4 ; i<checkboxes.size();i++) {
		
	checkboxes.get(i).click(); 
		
}
		
		//select first 3 checkboxes
		
		for(int i =0 ; i<3;i++) {
			
			checkboxes.get(i).click(); 
			
		}
		
		
		
	}

}

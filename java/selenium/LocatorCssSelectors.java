package selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LocatorCssSelectors {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//tag id combination  tag#id
		
		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");

		//tag class combination tag.classname
		
		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-Shirts");
		
		//tag att   tag[att = "value"]
		
		driver.findElement(By.cssSelector("[name='q']")).sendKeys("T=Shirts");
		
		//tag class attribute   tag.class[att="value"] // when you have same classes for the inputs the you 
		//can seggregate them by using attribute and value
		
		driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("T-shirts");
		
		
		//selectorhub install and add to chrome it contains all the css selectors
		
	}

}

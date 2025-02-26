package TestNGDay1;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

/* open application 
 * test logo presence
 * login
 * close
 * */

public class OrangeHRM {
	
	WebDriver driver;
	@Test(priority=1)
	void openapp() {
		
		 driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com");
		driver.manage().window().maximize();
	}
	@Test(priority=3)
	void logopresence() {
		//driver.findElement(By.xpath(""));
		
	}
	@Test(priority=2)
	void login() {
		
	}
	@Test(priority=4)
	void close() {
		
	}
	
	
}

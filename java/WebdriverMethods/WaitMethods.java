package WebdriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class WaitMethods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //it works for entire the automation
		
		//unlike sleep it declared only once and if the stmt is executed in less time it wont effect that
		// if any stmt taking more time it will pass and after it will through an exception
		
		driver.get("https://demo.opencart.com");
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='search']")).sendKeys("Admin");
		driver.close();
	}

}

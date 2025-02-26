package HandleWebElements;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class HandleAlertsWithExplicitWait 
{

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		WebDriverWait mywait= new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		// simple js alert 
	    driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
	    Thread.sleep(3000);
		Alert myalert= mywait.until(ExpectedConditions.alertIsPresent());
		myalert.accept();
		
		//js confirm alert
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		Thread.sleep(3000);
		Alert myalerts= mywait.until(ExpectedConditions.alertIsPresent());
		myalerts.dismiss();
		
		// js prompt alert
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Thread.sleep(3000);
		Alert myalerte= mywait.until(ExpectedConditions.alertIsPresent());
		myalerte.sendKeys("baunnara andi");
		//myalert.dismiss(); //to close alert using cancel 
		myalerte.accept(); // to close alert using ok 
		driver.quit();
		
		
		
		
	}

}

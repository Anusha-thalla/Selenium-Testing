package WebdriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.TimeoutException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class ExplicitWait {

	public static void main(String[] args) {
		
		
		WebDriver driver= new ChromeDriver();
		
		WebDriverWait myWait= new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/register");
		
		WebElement firstName = myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='FirstName']")));
	firstName.sendKeys("Anusha");
	WebElement lastName = myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='LastName']")));
	lastName.sendKeys("Thalla");
	
	WebElement btn = myWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@name='register-button']")));
	btn.click();
	}

}

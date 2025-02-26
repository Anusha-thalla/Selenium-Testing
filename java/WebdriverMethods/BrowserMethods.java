package WebdriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {

	public static void main(String[] args)throws InterruptedException {
WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://demo.opencart.com");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Tablets")).click();
		Thread.sleep(5000);
		driver.quit();
	}

}

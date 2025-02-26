package WebdriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
public class NavigationalMethods {

	public static void main(String[] args) throws MalformedURLException {
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://demo.nopcommerce.com/"); 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		

		// url is passed as a string or a url object
		
	//	URL myUrl = new URL("https://demo.nopcommerce.com/");
		//driver.navigate().to(myUrl);
		
		driver.navigate().to("https://demo.nopcommerce.com/"); // as a string
		driver.navigate().to("https://demo.opencart.com"); // as a string
		
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().refresh();
	}

}

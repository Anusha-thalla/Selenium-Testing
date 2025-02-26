package WebdriverMethods;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindow {

	public static void main(String[] args) {
		
WebDriver driver = new ChromeDriver();

   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		driver.get("https://demo.opencart.com/"); 
		
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Tablets']")).click();
		Set<String> windowIds=driver.getWindowHandles();
//Approach 1
		List<String> windowList = new ArrayList(windowIds);
		String parentId = windowList.get(0);
		String childId = windowList.get(1);
		driver.switchTo().window(childId);
		System.out.println(driver.getTitle());
		}

}

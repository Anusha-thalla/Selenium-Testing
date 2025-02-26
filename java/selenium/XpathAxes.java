package selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class XpathAxes {

	public static void main(String[] args) {
		
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().window().maximize();
		
		//locating a self node
		
		String text = driver.findElement(By.xpath("//a[contains(text(), 'Apollo Tyres')]/self :: a")).getText();
		System.out.println("Self : " + text);
		
		//parent - selects the parent of the current node
		
		text = driver.findElement(By.xpath("//a[contains(text(), 'Apollo Tyres')]/parent ::td")).getText();
		System.out.println("the parent element is :" +text);
		
		//Ancestor - selects the parent of parent
		
		text = driver.findElement(By.xpath("//a[contains(text(), 'Apollo Tyres')]/ancestor :: tr")).getText();
		System.out.println(" The ancestor of the node is :" +text);
		
		driver.quit();
		
		/*methods 
		 * text()
		 * contains()
		 * starts-with()
		 * first() last()
		 */
	}

}

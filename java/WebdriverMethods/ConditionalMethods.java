package WebdriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium. WebDriver;
import org.openqa.selenium.WebElement;
public class ConditionalMethods{

	public static void main(String[] args) {
		
  WebDriver driver = new ChromeDriver(); 
   driver.get("https://demo.nopcommerce.com/register"); 
 driver.manage().window().maximize();
  //WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
	//System.out.println("The display status is :"+logo.isDisplayed());
 
 //isDisplayed()
 boolean status = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
 System.out.println("The display status is " +status);
 
 //isEnabled ---> checkboxes, radio buttons, dropdowns
 
 boolean name=driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
 System.out.println("The checkbox is status is :"+name);
 
 //isSelected()---> radio button , check boxes
 
 WebElement male = driver.findElement(By.xpath("//input[@id='gender-male']"));
 System.out.println("Before selected");
 System.out.println("The status is : "+male.isSelected());
 male.click();
 System.out.println("After selected");
 System.out.println("The status is : "+male.isSelected());
	}

}

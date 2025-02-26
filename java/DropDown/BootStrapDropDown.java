package DropDown;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class BootStrapDropDown {

	public static void main(String[] args) {

WebDriver driver= new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
driver.manage().window().maximize();


//select single option
driver.findElement(By.xpath("//button[contains(@class,'multiselect ')]")).click();
driver.findElement(By.xpath("//input[@value='Java']")).click();

//selecting multiple or all option
  List<WebElement> options=driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
System.out.println("The number of options :"+options.size());
//printing options 
for(WebElement op:options) {
	System.out.println(op.getText());
}

//multiple options
for(WebElement ops:options) {
	if(ops.getText().equals("Oracle")|| ops.getText().equals("Python")) {
		ops.click();
	}
}

	}

}

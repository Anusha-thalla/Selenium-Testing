package HandleWebElements;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException  {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
      driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        Thread.sleep(5000);
        
        //we need to switch to alert and to close alert accept() is used
       driver.switchTo().alert().accept();
        
        //to store the alert 
      Alert myalert=  driver.switchTo().alert();
      
      // so we can perform multiple operations on alert
      System.out.println(myalert.getText());
      myalert.accept(); 
        //confirmation alert
      driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
      Thread.sleep(5000);
       driver.switchTo().alert().dismiss();  //close alert by cancel button
      
	//prompt alert
       driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
       Thread.sleep(5000);
      Alert myalerted= driver.switchTo().alert();
      myalerted.sendKeys("Welcome bro");
      myalerted.accept();
       
	}

}

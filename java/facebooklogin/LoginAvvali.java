package facebooklogin;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LoginAvvali {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("thallaanusha2002@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Anu@2002");
		//driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
	driver.findElement(By.xpath("//a[text()='Forgotten account?']")).click();
	driver.findElement(By.xpath("//buton[@name='reset_action']")).click();
	driver.findElement(By.xpath("//input[@id='identify_email']")).sendKeys("6309435965");
	}

}

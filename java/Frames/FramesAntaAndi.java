package Frames;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class FramesAntaAndi {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		
		//accessing frame cause we can't access it directly so we need to switch to frame
		WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		
		driver.switchTo().frame(frame1);
		  driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("aayyy baunnara andi");
		
		  //accessing frame2
		  
		  driver.switchTo().defaultContent(); // we can't switch from one frame to another so again we need to go the page 

		  WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		  driver.switchTo().frame(frame2);
		  driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("maadhi sikakulam andi");
		  
		  //accessing inner frame (frame within frame)---->frame3
		  driver.switchTo().defaultContent();
		  WebElement frame3= driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		  driver.switchTo().frame(frame3);
		  driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("shaminchandi babu thappaipoindhi");
		  
		  driver.switchTo().frame(0); // if there is only one frame we can use index method
		  driver.findElement(By.xpath("")).click();
		  
	}

}

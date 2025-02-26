package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ropDownSir {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement DropEle=driver.findElement(By.xpath("//select[@id='country']"));

	Select dropdown=new Select(DropEle); //it is a class used to access drop downs
	
	dropdown.selectByVisibleText("France"); //used access dropdown with visible text
	dropdown.selectByValue("japan");   //it is used only when value attr their with option tag
	dropdown.selectByIndex(2);    //by manually counting indexes we can pass 	
	
	//capture options from dropdown
	List<WebElement>dropy=dropdown.getOptions();
	System.out.println("The total number of options :"+dropy.size()); //returns total items
	
	 /*for(int i=0;i<dropy.size();i++) {
		
		
		System.out.println(dropy.get(i).getText());
	}*/
	
	//enhanced for loop
	for(WebElement op:dropy) {
		System.out.println(op.getText());
	}
	}

}

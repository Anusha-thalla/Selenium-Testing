package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class firsttestcase {
	
	/* testcases 1 launch browser (chrome)
	 2 open url https://demo.opencart.com
	 3 validate title should be "your store"
	 4 close browser*/

	public static void main(String[] args) {
		 //1 launch browser (chrome)
		ChromeDriver driver = new ChromeDriver();
		
		//2 open url https://demo.opencart.com
		driver.get("https://demo.opencart.com");
		
		//3 validate title should be "your store"
		String act_title =driver.getTitle();	
	  
		if(act_title.equals("Your Store"))
		{
			System.out.println("Testcase passed");
		}
		else {
			System.out.println(" testcase failed");
		}
		
		// 4 close browser
		
		//driver.close()
		driver.quit();
		//driver.close();
		}

}

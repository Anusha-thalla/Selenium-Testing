package Annotations;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class AnnotationsClass {
  
	@Test
	void search() {
		System.out.println("This is a search method");
	}
	@Test
	void adv_search() {
		System.out.println("This is a adv_search method");
	}
	@AfterMethod
	void logout() {
		System.out.println("This is a logout method");
	}
	@BeforeMethod
	void login() {
		System.out.println("This is a login method");
	}

	
	
}

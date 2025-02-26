package Annotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnotations1 {
	@Test
	void searches() {
		System.out.println("This is a searches test");
	}
	@Test
	void adv_searches() {
		System.out.println("This is a adv_searches test");
	}
	@AfterTest
	void logout() {
		System.out.println("This is a logout test");
	}
	@BeforeTest
	void login() {
		System.out.println("This is a login test");
	}
}

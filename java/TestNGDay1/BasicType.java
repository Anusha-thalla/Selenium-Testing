package TestNGDay1;

import org.testng.annotations.Test;

// 1) open app
// 2) login
// 3) logout


public class BasicType {
	
	@Test(priority=1) //priority is considered at the runtime
	void openapp() {
	System.out.println("opening application");	
	}
	@Test(priority=2)
	void login() {
		System.out.println("login to application");
	}
	@Test(priority=3)
	void logout() {
		System.out.println("logout from application");
	}

}

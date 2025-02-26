
package Annotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnotations {
  @Test
  public void search() {
	  System.out.println("this is a search Test");
  }
  @Test
  public void adv_search() {
	  System.out.println("this is a adv_search Test");
  }
  @BeforeTest
  public void login() {
	  System.out.println("this is a login Test");
  }
  @AfterTest
  public void logout() {
	  System.out.println("this is a logout Test");
  }
}
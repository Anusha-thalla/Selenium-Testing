package Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClassAnnotations {
  @Test
  public void search() {
	  System.out.println("this is a search class");
  }
  @Test
  public void adv_search() {
	  System.out.println("this is a adv_search class");
  }
  @BeforeClass
  public void login() {
	  System.out.println("this is a login class");
  }
  @AfterClass
  public void logout() {
	  System.out.println("this is a logout class");
  }
}

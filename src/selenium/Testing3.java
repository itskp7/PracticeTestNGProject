package selenium;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testing3 {
	
	SoftAssert krunal = new SoftAssert();  // object created for using soft assert
	
  @Test (priority=1)
  public void homeTest() {   // This is hard assert bcz when line 15 will fail it will skip 16 and 17 line (but will continue to next test) so to overcome this we use soft assert
	  System.out.println("I am in home test");
	  System.out.println("Before assertion");
	  Assert.assertTrue(2>3, "Verifying Element");
	  System.out.println("After assertion");
	  Assert.assertEquals("abc", "abc");
  }
  
  @Test (priority=2, dependsOnMethods="homeTest", groups= {"smoke", "sanity"}) // adding depends on will skip the test if the previous test fails
  public void mainTest() {
	  System.out.println("I am in main test");
	  System.out.println("Before assertion");
	  krunal.assertTrue(2>3, "Verifying element");
	  System.out.println("After assertion");
	  krunal.assertAll();   // if we dont write this it wont report the test failure
  }
  @Test (priority=3, groups= {"smoke","krunal"})
  public void endTest() {
	  System.out.println("I am in end test");
	  System.out.println("Before assertion");
	  krunal.assertTrue(2>3, "Verifying element");  // even though test fails here, it will proceed to the next line bcz soft assert
	  System.out.println("After assertion");
	  krunal.assertEquals("abc", "abc1");
	  System.out.println("After second assertion");
	  krunal.assertAll();
	  
	  
  }
  
}

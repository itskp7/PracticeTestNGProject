package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Testing1 {
  @Test(dataProvider = "dp")
  public void Krunal(Integer n, String s, String r) {  // three arguments passed bcz three columned data in data provider
	  System.out.println(n+s+r);  // will print row wise in the console
  }
  
  @Test(dataProvider = "ashish")
  public void test1(Integer m, String p) {
	  System.out.println("test1");  // will be printed three times bcz three rows in the data provider array
  }
  
  @Test
  public void test2() {
	  System.out.println("test2");
  }
  
  @Test
  public void test3() {
	  System.out.println("test3");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after method");
  }


  @DataProvider
  public Object[][] dp() {                // the method return type is a 2D object, and method name is dp
    return new Object[][] {
      new Object[] { 1, "Krunal", "a" },   // this whole line is considered as a method // or one row of an array is considered as one method
      new Object[] { 2, "Ashish", "b" },
    };
  }
  
  @DataProvider
  public Object[][] ashish() {
    return new Object[][] {
      new Object[] { 3, "c" },
      new Object[] { 4, "d" },
      new Object[] { 5, "e" },
    };
  }
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("after test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("after suite");
  }

}

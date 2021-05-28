package TestNgNew;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  
  @BeforeTest
  void m1()
  {
	  System.out.println("Before Test");
  }
  
  @AfterTest
  void m2()
  {
	  System.out.println("After Test");
  }
  
  @Test
  void m3()
  {
	  System.out.println("Test");
  }
  
  @Test
  void m4()
  {
	  System.out.println("Test 2");
  }
  
  @Test
  void m5()
  {
	  System.out.println("Test 3");
  }
  
  @Test
  void m6()
  {
	  System.out.println("Test 4");
  }

}

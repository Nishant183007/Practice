package TestNgNew;

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

public class TestNgGroups {
  
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }


  @Test(groups= {"Sanity"})
  public void m1() {
	  System.out.println("Sanity");
  }
  
  @Test(groups= {"Regression"})
  public void m2() {
	  System.out.println("Resgression");
  }
  
  @Test(groups= {"Sanity","Regression"})
  public void m3() {
	  System.out.println("Sanity and Resgression");
  }

  

}

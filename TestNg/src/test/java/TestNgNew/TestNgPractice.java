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
import org.testng.annotations.Parameters; 

public class TestNgPractice {
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This is Before Method...");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is After Method...");
  }


 
//  @BeforeClass
//  public void beforeClass() {
//  }
//
//  @AfterClass
//  public void afterClass() {
//  }

  @Test
  public void Test1() {
	  System.out.println("This is Test1...");
  }

  @Test
  @Parameters({"userName","firstName","lastName","password"})
  public void Test2(String name,String a,String b,int c) {
	  System.out.println("This is Test2..."+name+"..."+a+"..."+b+"..."+c);	  
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}

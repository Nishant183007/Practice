package TestNgNew;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(TestNgNew.ListnerTest.class)
public class TestNGInvocationCount {
	 int count=0;
  @Test(invocationCount=4)
  public void m1() {
	  
	  System.out.println(count);
	  count++;
  }
}

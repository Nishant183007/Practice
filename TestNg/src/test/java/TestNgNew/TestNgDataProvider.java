package TestNgNew;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNgDataProvider {
  
	@Test(dataProvider="data")
	public void m1(String str1,String str2)
	{
		System.out.println(str1+"   "+str2);
	}
	
	
	
	
	@DataProvider(name="data")
	public Object dataProvidingMethod()
	{
		Object a[][]= {{"User1","Password1"},{"User2","Password2"}};
		return a;
	}
}

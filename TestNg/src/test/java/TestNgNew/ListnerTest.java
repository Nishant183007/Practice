package TestNgNew;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerTest implements ITestListener{

	public void OnTestStart(ITestResult Result)
	{
		System.out.println("Listner got called, test is started "+Result.getName());
	}
	
	public void OnTestSuccess(ITestResult Result)
	{
		System.out.println("Listner got called, test is success "+Result.getName());
	}
}

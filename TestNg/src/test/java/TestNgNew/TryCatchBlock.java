//package TestNgNew;

public class TryCatchBlock {

	public static void main(String args[])
	{
		try {
			System.out.println(1/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e+"First Catch");
		}
		catch(Exception e)
		{
			System.out.println("Second Catch");
		}
		
	}
}

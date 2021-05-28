package TestNgNew;

public class UseInterface implements InterfacePractice{

	public void m1() {
		System.out.println("Hiii m1...");
	}

	public void m2() {
		System.out.println("Hiii m2...");
	}

	public static void main(String[] args)
	{
		UseInterface u=new UseInterface();
		
	u.m1();
	u.m2();
	
	}

}

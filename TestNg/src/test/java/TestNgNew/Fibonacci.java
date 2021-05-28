package TestNgNew;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
     int a=0,b=1;
Scanner s= new Scanner(System.in);		
		int r=s.nextInt();
		System.out.println(a);
		System.out.println(b);
		for(int i=1;i<=r;i++)
		{
			int c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
	}

}

package TestNgNew;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
int a = 1;
Scanner s= new Scanner(System.in);
int r= s.nextInt();
		for(int i=r;i>0;i--)
		{
			a=a*i;
		}
		System.out.println(a);
	}

}

package TestNgNew;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String args[])
	{
		int a[]= {44,32,52};
		System.out.println(Arrays.toString(a));
		int b[] = new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
				int temp=0;
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
			}
			}
//			System.out.println(a[i]);
			
			for(int k=0;k<a.length;k++)
			{
				b[k]=a[k];
			}
		}
		System.out.println(Arrays.toString(b));
		
		
	}
	
	
	
	
}

package TestNgNew;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class PracticeForInterview {
	public static void main(String[] args)
	{
//		//reverse of a string
//		String str = "Nishant";
//		String str1 = "";
//		for (int i = str.length() - 1; i >= 0; i--) {
//			str1 = str1 + str.charAt(i);
//		}
//		System.out.println(str1);
		
		
		
//		//Swapping numbers without 3rd variable
//		int a=10,b=20;
//		System.out.println("a-->"+a+" b-->"+b);
//		a=a+b;  //30
//		b=a-b;  //10
//		a=a-b;  //20
//		System.out.println("a-->"+a+" b-->"+b);
		
		
		
//		//Swapping of Strings without 3rd variable
//		String string1="Nishant";
//		String string2="Naidana.";
//		string1=string1+string2;
//		System.out.println(string1);
//		string2=string1.substring(0,string1.length()-string2.length());
//		System.out.println(string2);
//		string1=string1.substring(string2.length());
//		System.out.println(string1);
		
		
	
//		//Print words separately from a string
//		String sentence="My Name is Nishant";
//		String n[]=sentence.split(" ");
//		for(String s:n)
//		{
//			System.out.println(s);
//		}
		
		
//		//Remove spaces from a string
//		String sentence="My Name is Nishant";
//		String str=sentence.replace(" ", "");
//		System.out.println(str);
		
		
		//HashMap
		HashMap<String,String> h=new HashMap();
		h.put("FirstName", "Nishant");
		h.put("LastName ", "Naidana");
		System.out.println(h);
		for(Map.Entry m: h.entrySet())
		{
			System.out.println(m.getKey()+"    "+m.getValue());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}

package TestNgNew;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "Hi this is new is old is new";
		int len=s.length();
		String[] s1=s.split(" ");
for(int i=0;i<s1.length;i++)
{
	int count=0;

	for(int j=0;j<s1.length;j++)
	{
		if(s1[i].equals(s1[j]))
		{
			count++;
		}

	}
	System.out.println(s1[i]+"   "+count);
}
	}

}

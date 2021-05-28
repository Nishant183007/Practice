package TestNgNew;

public class StringPractice {

	public static void main(String[] args) {

		// Count number of repeated words in a sentence
		
		String str="My Name is Nishant";
		String newStr=str.replaceAll(" ","");
		int count=0;
		for(int i=0;i<=newStr.length()-1;i++)
		{
			
			if(newStr.charAt(0)==(newStr.charAt(i)))
			{
				count=count++;
				
					}
			if(newStr.length()==newStr.lastIndexOf(newStr)+1)	
			{
			System.out.println("Number of "+newStr.charAt(0)+" is "+count);
			newStr.replace(Character.toString(newStr.charAt(0)),"");
			}

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

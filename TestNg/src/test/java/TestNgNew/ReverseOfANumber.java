package TestNgNew;

public class ReverseOfANumber {

	public static void main(String[] args) {
    int n=1234;
    int reversed=0;
    while(n>0)
    {
    	int lastDigit=n%10;
    	reversed=reversed*10+lastDigit;
    	n=n/10;
    }
		System.out.println(reversed);
		
		
	}

}

package Programs;

public class ReverseNumber {
	public static void main(String[] args )
	{
		int num = 1234;
		int rem = 0;
		int rev = 0;
		while(num>0)
		{
			rem = num % 10;
			num /=10;
			rev = rev*10 + rem;
			
		}
		System.out.println("Reverese of Given number:" + rev );
	}

}

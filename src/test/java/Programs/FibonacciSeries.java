package Programs;

public class FibonacciSeries {
	public static void main(String[] args)
	{
		int num = 5;
		int a = 0;
		int b = 1;
		
		for (int i = 1; i<=num; i++)
		{
			System.out.print(a +",");
			int c = a + b;
			a = b;
			b = c;	
		}
	}

}

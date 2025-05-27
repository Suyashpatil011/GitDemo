package Programs;

// ArmStrong - Armstrong number (also known as a narcissistic number) is a number that is equal to the sum of its own digits each raised to the power of the number of digits.

import java.util.Scanner;

public class ArmStrong {
	public static void main(String[] arg)
	{
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the Number");
//		int num = sc.nextInt();
		
		int num = 153 ;
		
		int tem = num;
		int r,sum =0;
		
		while (num>0)
		{
			r =num %10;
			num /= 10;
			sum = sum + r*r*r;
		}
		
		if (tem == sum)
		{
			System.out.println("Armstrong");
		} else
		{
			System.out.println("Not Armstrong");
		}
		
	}
}

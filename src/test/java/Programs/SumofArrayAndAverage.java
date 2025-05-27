package Programs;

public class SumofArrayAndAverage 
{
	public static void main (String[] args)
			{
			int arr[] = {1,2,3,4,5,6,7,8};
			int sum = 0;
			float avg;
			for (int i =0; i<arr.length; i++)
			{
				sum = sum + arr[i];
			}
			
			avg = (float) sum/arr.length;
			
			System.out.println("Sum of Array is : " + sum);
			System.out.println("Average of the Array : "+ avg);
			}
}

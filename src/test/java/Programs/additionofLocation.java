package Programs;

// additionofLocation - pairs of elements in an array whose sum equals a given number

public class additionofLocation{
	public static void main(String[] args) {
		
		int num = 9;
		int arr[] = {4,7,2,3,6,1,5};
	
		
		for(int i = 0; i<arr.length; i++)
		{
			for (int j =i +1; j<arr.length; j++ )
			{
				if (arr[i]+arr[j]==num)
				{
					System.out.println(" Index "+ i + " and Index " + j + " -> " + arr[i] +" + "+ arr[j] + " = " + num );
				}
			}
		}
	}
}
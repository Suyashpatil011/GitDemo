package Programs;

public class MinNumberInArray {
	public static void main(String[] args)
	{
		int arr[] = {23,10,22,65,75,30, 9};
		int min = arr[0];
		for(int i = 0; i>arr.length; i++ )
		{
			if(arr[i]<min)
			{
				min = arr[i];
			}
		}
		System.out.print("Minimun value : " + min );
	}

}

package Programs;

public class AscendingOrder {
	public static void main(String[] args)
		{
		 int arr[] = {2,54,56,22,97,3,55};
		 
		 int tem;
		 
		 for(int i =0; i<arr.length; i++)
		 {
			 for (int j= i+1; j<arr.length; j++)
			 {
				 if (arr[i]>arr[j])
				 {
					  tem = arr[i];
					 arr[i] =arr[j];
					 arr[j] =tem;
				 }
			 }
			 
		 }
		 
		 System.out.println("Array in Ascending order:");
		 for (int i =0; i<arr.length; i++)
		 {
			 System.out.print(arr[i]+ " ");
		 }
		 
		
		}
	}


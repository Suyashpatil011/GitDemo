package Programs;

import java.util.ArrayList;
public class UniqueArray {
	public static void main(String args[]) {
		int arr[] = { 1,2,3,4,5,6,7,8,9,9,8,7,6,5,5,4,2,1};

		ArrayList < Integer > al = new ArrayList < > ();

		for (int i = 0; i < arr.length; i++) 
		{
			int k = 0;
			if (!al.contains(arr[i])) 
			{
				al.add(arr[i]);
				k++;
				
				//new

				//if item is not added to the al list the we adding item & incrementing the remp to 1 from 0
				for (int j = i + 1; j < arr.length; j++) 
				{
					if (arr[i] == arr[j]) 
					{
						k++;
						//if element is duplicate the again we incremneting the temp to 2
					}
				}
				if (k == 1)  // k = 1 Means all uniqe & 2 mens duplicate {
					System.out.println("the unique number is " + arr[i]);
			}
		}
	}
}
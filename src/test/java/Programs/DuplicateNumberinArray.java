package Programs;

public class DuplicateNumberinArray {
	
  public static void main(String args[]) {
    int arr[] = {2,5,2,6,9,8,8};
    System.out.println("The duplicate numbers are:");
    for (int i = 0; i < arr.length; i++) 
    {
      for (int j = i + 1; j < arr.length; j++) 
      {
        if (arr[i] == arr[j]) 
        {
          System.out.println(arr[i]);
        }
      }
    }
  }
}

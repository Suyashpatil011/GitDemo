package Programs;

import java.util.ArrayList;

public class EvenOddNumber{
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,5,6};
        
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        
        for (int i= 0; i<arr.length; i++)
        {
            if(arr[i]%2 == 0)
            {
                System.out.println(arr[i]+ " is Even number");
                even.add(arr[i]);
            }else 
            {
                System.out.println(arr[i]+ " is Odd number");
                odd.add(arr[i]);
            }
        }
        System.out.println("Even Number: " + even);
        System.out.println("Even Number: " + odd);
        
    }
}
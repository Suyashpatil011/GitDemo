package Programs;

public class SegragateArrayNegativeANDPositive {
  public static void main(String args[]) {
    int arr[] = { 4, 0, -20, 32, 89, -4, -1, 1, 16, -15, 132, -35};
    int tem[] = new int[arr.length];
    
    int f = 0;
    int l = arr.length -1;
    
    
    for(int i = 0; i<arr.length; i++)
    {
    	if (arr[i]<0)
    	{
    		tem[f] = arr[i];
    		f++;
    	}
    	else 
    	{
    		tem[l] = arr[i];
    		l--;
    	}
    	
    
    }
    System.out.println("Segregated Array list is : ");
    for (int i1 = 0; i1< tem.length; i1++)
	{
    	System.out.print(tem[i1] + ",");	
	}
    for (int i = 0; i<tem.length; i++)
    {
    	for(int j= i+1; j<tem.length; j++ )
    	{
    		if(tem[i]>tem[j])
    		{
    			int t = tem[i];
    			tem[i] = tem[j];
    			tem[j] = t;
    		}
    	}
    }

    System.out.println("\nNew Sorted Array list is : ");
    for (int i = 0; i< tem.length; i++)
	{
    	System.out.print(tem[i] + ",");	
	}
  }
}

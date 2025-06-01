package Programs;

public class ASCII {
	public static void main(String[] args) {
		
		
		//pritn ascii value for given character
		char c1= 'a';
		System.out.println(" ascii vaule is : " + (int)c1);
		
		
		
		
		//Print ascii value for string 
		String s = "Akshay";
		
		for (int i =0; i<s.length(); i++)
		{
			char c= s.charAt(i);
			int ascii = (int) c;
			System.out.println(" ascii vaule is : " + ascii);
		}
		
		
		
		//Print all ascii keys
		for (int i =0; i<=127; i++)
		{
			
			System.out.printf("%d : %c | \n" , i , i);
		}
	}

}

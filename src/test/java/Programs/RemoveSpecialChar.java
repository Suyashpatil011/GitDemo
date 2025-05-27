package Programs;

public class RemoveSpecialChar {
	public static void main(String[] args)
	{
		String name = "A K S H A Y P A U S K A R";
		String newname = name.replaceAll(" ", "");
		
		System.out.println("The Stirng without space is: "+ newname);
	}

}

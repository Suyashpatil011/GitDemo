package Programs;

public class ReverseString{
    public static void main(String[] args)
    {
        String str = "Akshay";
        
        System.out.println("Characters in string:");
        for (int i = 0; i<str.length(); i++)
        {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.print("\n");
        for (int i = str.length()-1 ; i>=0; i--)
        {
            System.out.print(str.charAt(i));
        }
    }
}

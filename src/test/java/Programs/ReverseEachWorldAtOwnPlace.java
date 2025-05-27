package Programs;

public class ReverseEachWorldAtOwnPlace {
    public static void main(String[] args)
    {
        String str = "Akshay Loves Coding";
        String[] words = str.split(" ");
        
        
        for (String word : words)
        {
            for (int i = word.length()-1; i>=0;i--)
            {
                System.out.print(word.charAt(i));
            }
            System.out.print(" ");
        }
    
    }
}

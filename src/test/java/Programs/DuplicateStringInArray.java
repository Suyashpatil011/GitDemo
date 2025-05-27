package Programs;

public class DuplicateStringInArray
{
    public static void main(String[] args)
    {
        String[] str = {"Akshay", "Suraj", "Akshay"};
        
        for (int i =0; i < str.length; i++)
        {
            for(int j= i+1; j < str.length; j++)
            {
                if(str[i].equals(str[j]))
                {
                    System.out.print(str[i]);
                }
            }
        }
    }
}

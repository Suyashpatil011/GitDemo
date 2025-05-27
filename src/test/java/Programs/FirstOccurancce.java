package Programs;
public class FirstOccurancce {
	public static void main(String args[]) 
	{
		String str = "alskdjfhgasldkfjh";
		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length; i++) 
		{
			boolean un = true;
			for (int j = i + 1; j < ch.length; j++) 
			{
				if (ch[i] == ch[j]) 
				{
					un = false;
					break;
				}
			}
			if (un) 
			{
				System.out.println(ch[i]);
				break;
			}
		}
	}
}
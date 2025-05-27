package Programs;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacterinArray {
    public static void main(String[] args) {
    		String str = "akshay pauskar";
    		HashMap<Character,  Integer> map = new HashMap<>();
    		
    		 for(char c : str.toCharArray())
    		 {
    			 if(c != ' ') 
    			 {
        			 map.put(c, map.getOrDefault(c, 0) +1);				 
    			 }
    		 }
    		 
    		 System.out.println(" Character that occur once:");
    		 for(Map.Entry<Character,  Integer> emap : map.entrySet())
    		 {
    			 if(emap.getValue() == 1)
    			 {
    				 System.out.println(emap.getKey() +" -> " +emap.getValue());
    			 } 
    			
    		 }
    		 System.out.println(" Character that occur multiple times:");
     		
    		 for(Map.Entry<Character,  Integer> emap : map.entrySet())
    		 {
    			 if(emap.getValue() > 1)
    			 {
    				 System.out.println(emap.getKey() +" -> " +emap.getValue());
    			 } 
    		 }
    			 
    }
}

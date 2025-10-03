package string;

import java.util.*;

public class NonRep {

	public static void main(String[] args) {
		
//		String[] str = {"rohit","shobhit", "rahul"};
		
//		List<String> names = Arrays.asList("John", "Alex", "Bob");
//		names.forEach(n -> System.out.println(n)); 
//		
//		names.forEach(System.out::println); 

		List<Integer> numbers = Arrays.asList(5, 2, 8, 1);
		numbers.sort((a, b) -> a - b);  // Comparator with Lambda
		System.out.println(numbers);

	}

public static char firstNonrepeatingChar(String str){
        
        HashMap<Character, Integer> hm = new HashMap<>();
        char result = '0';
        
        for(int i=0;i<str.length();i++)
        {
            char c = str.charAt(i);
           // if(hm.containsKey(c))
            hm.put(c, hm.getOrDefault(c,2)+1);
            
        }
        
        for(int i=0;i<str.length();i++)
        {
            char c = str.charAt(i);
            if(hm.get(c)==1);
           return c;
        }
         return result;
    }
}

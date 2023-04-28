import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class RepeatWord {

	public static void main(String[] args) {
		
		
	String a = "mississippi";	
	
    Map<Character, Integer> m = new LinkedHashMap<>();
    
    char[] ch = a.toCharArray();
		
		for (char d : ch) {
			
			if (m.containsKey(d)) {
				
				Integer count = m.get(d);
				m.put(d, count+1);
				
			} else {

				m.put(d, 1);
				
			}
			}
		//	System.out.println(m);
			
		
			
			Set<Entry<Character, Integer>> rep = m.entrySet();	
			
			for (Entry<Character, Integer> repchar : rep) {
				
				if (repchar.getValue()>1) {
					
					System.out.println(repchar);
					
				}
				
			}
			
			
	
		}
		
		
		
		
		
		
		
		
		
	} 
	
	
	
	
	
	
	
	


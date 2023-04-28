import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repeat {

	public static void main(String[] args) {
		
	String s = "hi bye hi bye hi boy bye hi day boy boy";
	
	String[] splitwords = s.split(" ");
	
	Map<String, Integer> m= new LinkedHashMap<>();
	
	for (String words : splitwords) {
		
		//System.out.println(words);
		
	if (m.containsKey(words)) {
		
		Integer count = m.get(words);
		m.put(words, count+1);
		
	} else {
		
		m.put(words, 1);

	}
	}
	//System.out.println(m);
	
	//key+value =entry
	
	
	Set<Entry<String, Integer>> entrySet = m.entrySet();
	
	for (Entry<String, Integer> entry : entrySet) {
		
		if (entry.getValue()>1) {
			
			System.out.println(entry);
			
		}
		
	}
	
	
	}
}

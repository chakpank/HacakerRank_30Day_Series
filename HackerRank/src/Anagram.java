import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Anagram {

	public static void main(String[] args) {

		String s1 = "anagram";
		String s2 = "margana";
		
		Set<Character> s1_set = new HashSet<Character>();
		Set<Character> s2_set = new HashSet<Character>();		
		Map<Character, Integer> hm = new HashMap<Character,Integer>();
		Map<Character, Integer> hm1 = new HashMap<Character,Integer>();
		
		String s1_lower = s1.toLowerCase();
		String s2_lower = s2.toLowerCase();
		
		for(int i = 0; i<s1.length();i++) {
			s1_set.add(s1_lower.charAt(i));
			
		}
		
		for(int i = 0; i<s2.length();i++) {
			s2_set.add(s2_lower.charAt(i));
			
		}
		
		if(s1_set.size() != s2_set.size()) {
			System.out.println("False");
		}else {
			
			for(Character c : s1_set) {
				int cnt = 0;
				for(int ic = 0; ic < s1_lower.length(); ic++) {
					
					if (c.equals(s1_lower.charAt(ic))){
						cnt = cnt+1;
					}	
			}
				
				//System.out.println(c.toString()+" : "+cnt);
				hm.put(c, cnt);
				
			}
			
			//System.out.println("---------------------------------");
			
			for(Character c : s2_set) {
				int cnt = 0;
				for(int ic = 0; ic < s2_lower.length(); ic++) {
					
					if (c.equals(s2_lower.charAt(ic))){
						cnt = cnt+1;
					}	
			}
				
				//System.out.println(c.toString()+" : "+cnt);
				hm1.put(c, cnt);
				
			}
			
			Set<Character> keys = hm.keySet();
			
			int result = 0;
			
			for(Character cKey : keys) {
				if(hm.get(cKey) != hm1.get(cKey)) {
					result = result + 1;
				}
			}
			
			if(result == 0) {
				System.out.println("Anagram");
			}else {
				System.out.println("Not Anagram");
			}
			
			

		}
		

	}

}

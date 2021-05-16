package Day8;

import java.util.HashMap;
import java.util.Set;

public class Day8 {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String,Integer>();
		
		hm.put("Sam", 9923456);
		hm.put("Ed", 934566);
		hm.put("Jay", 3343466);
		
		String [] keyArr = {"Sam","Jaya","Ed","Eddy"};

		for(String key:keyArr){
			if(hm.get(key) == null) {
				System.out.println("Not Found");
			}else {
				System.out.println(key+"="+hm.get(key));
			}
		}
		
		

	}

}

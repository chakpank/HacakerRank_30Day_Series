import java.util.HashSet;
import java.util.Set;

import javax.xml.stream.events.Characters;

public class GemStones {

	public static void main(String[] args) {
		
		String [] array = {"abcdde","baccd","eeabg"};
		
		Set<Character> minerals = new HashSet<>();
		
		for(String s : array)
		{
			for(int i=0; i<= s.length() - 1; i++)
			{
				Character c =  Character.valueOf(s.charAt(i)) ;
				minerals.add(c);
			}
		}
		

		int count = 0;
		
		
		for(Character composition : minerals) {
			
			int tempCount = 0;
			
			for(String s : array)
			{
								
				CharSequence a = composition.toString();
				
				if(s.contains(a)) {
					tempCount += 1; 
				}
				
				
				if(tempCount == array.length) {
					count += 1;
				}
			}
			
				
		}
		
		System.out.println("Gem Count : "+count);
		

	}

}

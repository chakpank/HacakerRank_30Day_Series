import java.awt.List;
import java.util.ArrayList;

import javax.xml.stream.events.Characters;

public class panagram {

	public static void main(String[] args) {
		String panagram = "abcdefghijklmnopqrstuvwxyz";
		
		System.out.println(panagram.length());
		
		String input = "We promptly judged antique ivory buckles for the next prize";
		
		//String input ="All of the letters of the alphabet are present in the string";
		String [] inputArray = input.trim().split(" ");
		
		StringBuffer sb = new StringBuffer();
		
		for(String j : inputArray) {
			sb.append(j.trim().toLowerCase());
		}
		
		System.out.println(sb);
		boolean flag = true;
		
		for(int k = 0; k<panagram.length(); k++) {
			Character c = Character.valueOf(panagram.toLowerCase().charAt(k));
			CharSequence c1 = c.toString();
			if(!sb.toString().contains(c1)) {
				flag = false;
			}
			
		}
		
		
		if(flag) {
			System.out.println("Panagram");
		}else {
			System.out.println("Not Panagram");
		}	

	}

}

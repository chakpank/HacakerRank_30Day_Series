import java.util.ArrayList;
import java.util.Arrays;

public class FunnyString {

	public static void main(String[] args) {
		//String s = "acxz";
		String s = "bcxz";	
		int length = s.length() - 1;
		
		//Forward String 		
		ArrayList<Integer> fwdList = new ArrayList<Integer>();
		ArrayList<Integer> fwdDiff = new ArrayList<Integer>();
		
		for(int j = 0; j<=length; j++) {
			char c = s.charAt(j);
			fwdList.add((int)c);
				
		}		
		System.out.println(fwdList);
	
		//FWD String List Difference

		for(int a = 0; a<fwdList.size() - 1; a++) {
			fwdDiff.add(Math.abs(fwdList.get(a) - fwdList.get(a+1)));			
		}
		System.out.println(fwdDiff);
		
		// Reverse String
		
		ArrayList<Integer> reverseList = new ArrayList<Integer>();
		ArrayList<Integer> reverseDiff = new ArrayList<Integer>();
		
		StringBuffer sb = new StringBuffer();
		for(int i = length; i >= 0; i--) {
			sb.append(Character.valueOf(s.charAt(i)));
		}
		
		System.out.println(sb);
		for(int k = 0; k<=length; k++) {
			char c = sb.charAt(k);
			reverseList.add((int)c);				
		}	
		
		System.out.println(reverseList);
		
		//Reverse String List Difference

			for(int b = 0; b<reverseList.size() - 1; b++) {
				reverseDiff.add(Math.abs(reverseList.get(b) - reverseList.get(b+1)));			
			}
			System.out.println(reverseDiff);
			boolean flag = true;
			
		//Comparison of fwdDiff and reverseDiff
			if(fwdDiff.size() == reverseDiff.size()) {
				for(int c = 0; c<fwdDiff.size(); c++) {
					if(fwdDiff.get(c) != reverseDiff.get(c)) {
						System.out.println("Not Funny String");
						flag = false;
						break;
					}
				}
			}
			
			if(flag) {
				System.out.println("Funny String");
			}

	}

}

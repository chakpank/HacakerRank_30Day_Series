import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Snippet {
	public static void main(String[] args) {
		
		//String str1 = "abcdefghhgfedeecba";
		String str1 = "aabbccddeefghi";
			
		char [] charArr = str1.toCharArray();
		
		HashSet <Character> hs = new HashSet<Character>();
		HashSet <Integer> occuranceSet = new HashSet<Integer>();

		int cnt = 0;
		int diff = 0;
		String returnStr = "YES";
		
		for(char c : charArr) {
			hs.add(c);
		}
		
				
		for(char c1 : hs) {
			
			for(int i = 0; i<charArr.length; i++) {
				if(c1 == charArr[i]) {
					cnt++;
				}
			}
			
			System.out.println("Char : "+c1+" Count : "+cnt);
			occuranceSet.add(cnt);
			
			cnt = 0;
		}
		
		System.out.println("--------------------------");
		for(int a : occuranceSet) {
			System.out.println(a);
		}
		
		if(occuranceSet.size() > 1) {
			ArrayList<Integer> arrList = new ArrayList<Integer>(occuranceSet);
			
			for(int k=0; k<arrList.size() - 1; k++) {
				if(arrList.get(k) != arrList.get(k+1)) {
					diff = Math.abs(arrList.get(k) - arrList.get(k+1));
					if(diff > 1) {
						//System.out.println(returnStr);
						
						returnStr = "NO";
					}
					
					diff = 0;
				}
			}
			
		}
		
		System.out.println(returnStr);
		
		/*if(occuranceSet.size() > 1) {
			System.out.println("NO");
		}else {
			System.out.println("YES");
		}*/
			
		
	}
}
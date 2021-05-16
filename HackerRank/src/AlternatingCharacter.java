
public class AlternatingCharacter {

	public static void main(String[] args) {
		
		String str = "BBBBB";		
		int cnt = 0;
		
		System.out.println(str.length());
		
		for(int i=0; i<str.length()-1; i++) {
			
			if(str.charAt(i) == str.charAt(i+1)) {
				cnt+=1;
			}			
		}
		
		System.out.println("Count : "+ cnt);

	}

}

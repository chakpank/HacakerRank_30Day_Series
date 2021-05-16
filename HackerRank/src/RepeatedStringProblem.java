
public class RepeatedStringProblem {

	public static void main(String[] args) {
		//String s = "aabca";
		String s = "a";
		String finalString = "";
		int aCount = 0;
		long n = 100L; 
		
		if(s.length() > 1) {
			int divisor = s.length();
			int remainder = (int)n%divisor;
			int repeatCount =(int) n/divisor;
			
			System.out.println(divisor);
			System.out.println(remainder);
			System.out.println(repeatCount);
			
			String subString = s.substring(0, remainder);
			System.out.println("SubString : "+ subString);
			
			for(int i = 0; i<repeatCount; i++ ) {
				finalString = finalString + s;
			}
			
			finalString = finalString+subString;
			
			System.out.println(finalString);
		
			char [] charArr = finalString.toCharArray();
			
			for(char c : charArr) {
				if(c == 'a') {
					aCount +=1;
				}
			}
						
			System.out.println(aCount);
			
		} else if ((s.length() == 1) & (s.equals("a"))) {
			aCount = (int)n;
			System.out.println(aCount);
		}
	}

}

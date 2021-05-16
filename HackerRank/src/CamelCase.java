
public class CamelCase {

	public static void main(String[] args) {
		
		String str = "i am a boy";
		StringBuffer sb = new StringBuffer();
		
		
		
		String [] arr = str.split(" ");
		
		for(String s : arr) {
			
			if(s.length() == 1) {
				s = s.toUpperCase();
				//System.out.println(s);
				
				sb.append(s);
				sb.append(" ");
				
			}
			else {
				char c = s.toUpperCase().charAt(0);
				String sFirst = Character.toString(c);
				String sUpdate = s.substring(1);
				StringBuffer sb1 = new StringBuffer();
				sb1.append(sFirst);
				sb1.append(sUpdate);		
				sb.append(sb1);
				sb.append(" ");			
				
			}				
			
		}
		
		String finalString = sb.toString();
		finalString = finalString.trim();
		System.out.println(finalString);
		
		
		
	}
}

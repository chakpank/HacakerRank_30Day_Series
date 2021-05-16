package Day6;

public class Day6 {

	public static void main(String[] args) {
		
		String str = "An Hacker Rank";
		String [] splitArr = str.split(" ");
		
		StringBuffer SB = new StringBuffer();

		
		for(int i = 0; i<splitArr.length; i++) {
			
			String splitS = splitString(splitArr[i]);
			SB.append(splitS);
			SB.append(" ");
			
		}
		
		System.out.println(SB.toString().trim());			

	}
	
	public static String splitString(String nonSplitStr) {
		
		StringBuffer sbOdd = new StringBuffer();
		StringBuffer sbEven = new StringBuffer();
		
		if(nonSplitStr.length()>=2) {
			
			for(int i = 0; i<nonSplitStr.length(); i=i+2) {
				sbOdd.append(nonSplitStr.charAt(i));
			}
			
			for(int i = 1; i<nonSplitStr.length(); i=i+2) {
				sbEven.append(nonSplitStr.charAt(i));
			}
			
			return sbOdd.toString()+" "+sbEven.toString();
			
		}else {
			return nonSplitStr;
		}
		
	}

}

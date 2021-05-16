
public class CountingValleys {

	public static void main(String[] args) {
		
		
		int n = 8;
		String s = "UDDDUDUU";
		//String s = "UDDDUDUU";
		
		int stepCount = 0;
		int valleyCount = 0;

		
		char [] charArr = s.toCharArray();
		
		for(char c : charArr) {
			
			switch (c) {
				case 'U':
					stepCount = stepCount + 1;
						if(stepCount == 0 ) {
							valleyCount = valleyCount + 1;
						}
					break;
				case 'D':
					stepCount = stepCount - 1;						
					break;
				default:
					break;
			
			}		
			
		}
		
		System.out.println("Final Step Count : "+ (valleyCount));


	}

}

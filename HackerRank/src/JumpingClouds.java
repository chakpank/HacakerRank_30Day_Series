import java.util.ArrayList;

public class JumpingClouds {

	public static void main(String[] args) {
		//int [] arr = {0,1,0,0,0,1,0};
		int [] arr = {0,0,1,0,0,0,0,1,0,0};
		
		
		
		int jumpCount = 0;
		
		ArrayList<Integer> zeroArr = new ArrayList<Integer>();
		for(int i : arr) {
			if(i == 0) {
				zeroArr.add(i);
			}
		}
		
		System.out.println(zeroArr.size());
		
		for(int j=0; j<arr.length; j++) {
			
			int midZeroCount = 0;
			
			if(arr[j] == 0) {
				System.out.println(" J : "+j);
				
				for(int k = j+1; k<arr.length; k++) {
					if(arr[k] == 0) {
						midZeroCount = midZeroCount+1;
					}else {
						break;
					}
				}
				
				if(midZeroCount > 1) {
					jumpCount = jumpCount + 1;
				}
				
				//System.out.println("Mid Zero Count : "+ midZeroCount);
			}
		}
		
		System.out.println("Final Jump Count : "+ jumpCount);
		
		int shortestPath = (zeroArr.size() - jumpCount - 1);
		
		System.out.println("Shortest Path : "+ shortestPath);

	}

}

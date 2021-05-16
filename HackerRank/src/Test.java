import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
	
		int position = 0;
		int bribeCount = 0;
		boolean flag = true;
		
		//int [] arr = {2,1,5,3,4};
		//int [] arr = {5,1,2,3,7,8,6,4};
		int [] arr = {1,2,5,3,7,8,6,4};
		
		System.out.println(arr.length);
		
		
		for(int i=0; i<arr.length; i++) {
			
			position = i+1;
			int diff = 0;
			
			if(arr[i] != position) {
				diff = arr[i] - position;
			}
			
			System.out.println("For position : "+position+" Diff = "+diff);
			
			if(diff > 0 && diff <= 2) {
				bribeCount += diff;
			}else if (diff < 0 && Math.abs(diff) <= 2) {
				if((i+1)<arr.length && arr[i]>arr[i+1] ) {
					if(arr[i-1]> arr[i]) {
						bribeCount = bribeCount +(-diff);
					}
					
				}
			}else if (diff > 2) {
				System.out.println("Too Chaotic");
				flag = false;
				i=i+arr.length;
			}
			
			
		}
		if(flag == true) {
			System.out.println("Bribe Count : "+ bribeCount);
		}
		
		
	}
}



import java.util.ArrayList;

public class Jumping {

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
					
					if (arr[j] == 0)
							 
					{
						if(((j+1) < arr.length) & (j+2) < arr.length ){
							
							if(((arr[j] == arr[j+1]) & (arr[j+1] == arr[j+2]))) {
								jumpCount = jumpCount + 1;
							}
							
						}
						
							
					}
					
					}
				
				if(jumpCount > 1) {
					jumpCount = jumpCount/2 ;
				}
				
				
				System.out.println("JumpCount : "+ jumpCount);
				System.out.println("Final Count : "+(zeroArr.size() - jumpCount -1));
				

	}

}

package Day11;

public class Day11 {

	public static void main(String[] args) {
		int [][] arr = {{1, 1, 1, 0, 0, 0 },{0, 1, 0, 0, 0, 0},{1, 1, 1, 0, 0, 0},{0, 0, 2, 4, 4, 0 },{0, 0, 0, 2, 0, 0 },{0, 0, 1, 2, 4, 0}};
		
		int sum = 0;
		int max = 0;
		int cnt = 0;
		
		for(int i= 0; i<4; i++) {
			for(int j=0; j<4;j++) {

				sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];				
				if(sum > max) {
					max = sum;
				}
				
				cnt += 1;
			}
		}
		
		System.out.println("Max Sum : "+ max);
		System.out.println("Hour Glass Count : "+cnt);

	}

}

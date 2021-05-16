import java.util.Scanner;

public class Solution {

	private static int H = 0;
	private static int B = 0;

	static {
		Scanner sc = new Scanner(System.in);
		B = sc.nextInt();
		H = sc.nextInt();
		
		if(B<0 || H<0) {
			System.out.println("java.lang.Exception: Breadth and height must be positive");
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
			int area=Solution.B *Solution.H;
			System.out.print(area);

	}

}

package Day9;

import java.util.Scanner;

public class Day9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int fact = sc.nextInt();
		
		int result = factorial(fact);
		
		System.out.println("Factorial Result of "+ fact + " is "+result);


	}
	
	public static int factorial(int i) {
		
		if(i==0 || i==1) {
			return 1;
		}else {
			return i*factorial(i-1);
		}

	}

}

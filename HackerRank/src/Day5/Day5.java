package Day5;

import java.util.Scanner;

public class Day5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if (n>=2 && n< 21) {
			for(int i = 1; i<11; i++) {
				System.out.println(n+"*"+i+" = "+n*i);
			}
		}else {
			System.out.println(n+" is beyond the expected range.");
		}

	}

}

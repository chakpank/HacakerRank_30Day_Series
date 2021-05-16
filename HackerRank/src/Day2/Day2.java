package Day2;

import java.util.Scanner;

public class Day2 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		if(i%2 == 1) {
			System.out.println("Weird");
		}else {
			
			if(i>=2 && i<= 5) {
				System.out.println("Not Weird");
			}else if (i>=6 && i<= 20) {
				System.out.println("Weird");
			}else if (i>20) {
				System.out.println("Not Weird");
			}
			
		}

	}

}

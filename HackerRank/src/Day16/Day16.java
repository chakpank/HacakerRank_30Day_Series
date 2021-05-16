package Day16;

import java.util.Scanner;

public class Day16 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		try {
			Integer i = Integer.parseInt(s);
			System.out.println(i);
		}catch(NumberFormatException e) {
			
			//e.printStackTrace();
			System.out.println("Bad String");
			
		}
		

	}

}

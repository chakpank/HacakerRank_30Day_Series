import java.math.BigInteger;
import java.util.Scanner;

public class PowerDigitSum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Test: ");
		
		int tests = Integer.parseInt(sc.nextLine());
		
		for(int i=0; i<tests; i++) {
			
			System.out.println("Enter the Power (N) : ");
			int n = Integer.parseInt(sc.nextLine());
			
			BigInteger bigNumber = new BigInteger("2");
			BigInteger result = bigNumber.pow(n);
			
			String str = String.valueOf(result);
		
			int sum = 0;
			
			for(int j=0; j<str.length(); j++) {				
				char c = str.charAt(j);
				sum = sum + Character.getNumericValue(c);				
			}
			
			System.out.println(sum);
		}

	}
//
//	private static char[] Long(BigInteger result) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}

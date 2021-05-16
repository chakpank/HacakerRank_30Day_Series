import java.util.Scanner;

public class convertIntegertoString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			int i = sc.nextInt();
			if(i<=100 && i>=(-100)) {
				System.out.println("Good Job");
			}else {
				System.out.println("Incorrect Input");
			}
		}catch(Exception e) {
			
			e.printStackTrace();
			System.out.println("Bad Job");
			
		}

	}

}

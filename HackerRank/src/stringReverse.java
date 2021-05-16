import java.util.Scanner;

public class stringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next(); 
		
		StringBuffer sb = new StringBuffer(s);
		
		System.out.println(sb.reverse().toString());
		
		if(sb.reverse().toString().equals(s)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		

	}

}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Morgan {

	private static int midVal;

	public static void main(String[] args)  {
		
	int a = 5;
	int b = 3;
	int n = 5; 
	
	//List<Integer> arr = new ArrayList<Integer>();

	
	for(int i = 1; i<=n; i++) {
		int midVal = 0;
		int finalVal = 0;
		for(int j=0; j<i;j++) {
			
			midVal = midVal+(int)Math.pow(2, j)*b;
			
		}
		
		finalVal = a+midVal;
		System.out.print(finalVal+" ");
		//arr.add(finalVal);
	}
			

	}

}

package Day0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Day0_Part1 {

	public static void main(String[] args) throws IOException {
		
		/*String row0 = "java 100";
		String row1 = "cpp 65";
		String row2	= "python 5";
		
		String [] arr = {row0, row1, row2};*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		String [] splitArr = s.split(" ");
		
		String s1 = String.format("%-15s", splitArr[0].trim());
		String s2;
		
		Integer j = Integer.parseInt(splitArr[1].trim());
		
		if(j<100) {
			s2 = String.format("%03d", (int)j);
		}else {
			s2 = j.toString();
		}
		
		System.out.println(s1+s2);
		
	}
}
		




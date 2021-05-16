import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
	
		int [] a = {-1, -2, -3};
		
		ArrayList al  = new ArrayList();
		
		for(int i = 0; i<a.length; i++) {
			al.add(a[i]);
		}
		
		Collections.sort(al);
		
		System.out.println(al);
		
		int lastElement = (int) al.get(al.size()-1);
		int secondlastElement = (int) al.get(al.size()-2);
		
		System.out.println(lastElement);
		System.out.println(secondlastElement);
		if(lastElement > 0) {
			
			if((lastElement - secondlastElement) > 1) {
				System.out.println(lastElement - 1);
			}else {
				System.out.println(lastElement +1);
			}
			
			
		}else {
			System.out.println(1);
		}
		
		
		
	}

	

}

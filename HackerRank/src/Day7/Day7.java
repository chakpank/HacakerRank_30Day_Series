package Day7;

import java.util.Iterator;
import java.util.LinkedList;

public class Day7 {

	public static void main(String[] args) {
		
		int [] arr = {4,3,2,1};		
		StringBuffer sb = new StringBuffer();
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		int i;
		
		for(i = arr.length - 1; i>=0; i--) {

			sb.append(arr[i]);
			sb.append(" ");
		}
		
		System.out.println(sb.toString().trim());
		

	}

}

package Day14;

import java.util.Arrays;

public class Difference {

	protected int [] arr;
	
	Difference(int [] arr){
		this.arr = arr;
	}

	public static void main(String[] args) {
		
		int [] inputArr = {6,12,5,1};
		
		Difference d = new Difference(inputArr);
		
		Arrays.sort(d.arr);
		int absDiff = d.arr[0] - d.arr[d.arr.length - 1];
		
		if(absDiff<0) {
			System.out.println(absDiff*(-1));
		}else{
			System.out.println(absDiff);
		}

	}

}

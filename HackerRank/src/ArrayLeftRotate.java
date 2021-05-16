import java.util.Arrays;

public class ArrayLeftRotate {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5};
		int d = 2;
		int j = 0;
		
		int [] rotArr = new int [arr.length];
		for(int i=0;i<arr.length;i++)
		{
         if(i<arr.length - d) {
        	 rotArr[i] = arr[i+2]; 
         }else {
        	 rotArr[i] = arr[j];
        	 j++;
         }
		
		}
		
		System.out.println(Arrays.toString(rotArr));
		
		

	}

}

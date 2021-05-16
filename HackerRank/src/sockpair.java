import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class sockpair{
	
	public static void main(String [] args) {
		
		int sockPairCnt = 0;
		int tempCnt = 0;
		
		int [] arr = {10, 20, 20, 10, 10, 30, 50, 10, 20};
		
		Set hs = new HashSet();
		for(int i : arr) {
			hs.add(i);
		}
		
		System.out.println(hs.size());
		
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			int j = (int) it.next();
			tempCnt = 0;
			
			for(int k : arr) {

				if(j == k) {
					tempCnt = tempCnt + 1;
				}
				
				System.out.println("temp Count for "+ j +" : "+tempCnt);
				
			}		
			
			
			if((tempCnt / 2) > 0) {
				sockPairCnt = sockPairCnt + (tempCnt / 2);
			}
			
		}
		
		System.out.println("Sock Pair Count = "+ sockPairCnt);
	}
	
}
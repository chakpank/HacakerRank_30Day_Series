
public class ms_01 {

	public static void main(String[] args) {

		String s = "882344";
		System.out.println(s.length());
		
		int zeroCnt = 0;
		int oneCnt = 0;
		int twoCnt = 0;
		int threeCnt = 0;
		int fourCnt = 0;
		int fiveCnt = 0;
		int sixCnt = 0;
		int sevenCnt = 0;
		int eightCnt = 0;
		int nineCnt = 0;
		
		
		for(int i=0;i<s.length();i++) {
			int a = Integer.parseInt(String.valueOf(s.charAt(i)));

			if(a == 0) {
				zeroCnt+=1;
			}else if (a == 1) {
				oneCnt+=1;
			}else if (a == 2) {
				twoCnt+=1;
			}else if (a == 3) {
				threeCnt+=1;
			}else if (a == 4) {
				fourCnt+=1;
			}else if (a == 5) {
				fiveCnt+=1;
			}else if (a == 6) {
				sixCnt+=1;
			}else if (a == 7) {
				sevenCnt+=1;
			}else if (a == 8) {
				eightCnt+=1;
			}else if (a == 9) {
				nineCnt+=1;
			}
			
		}

		System.out.println("0  "+zeroCnt);
		System.out.println("1  "+oneCnt);
		System.out.println("2  "+twoCnt);
		System.out.println("3  "+threeCnt);
		System.out.println("4  "+fourCnt);
		System.out.println("5  "+fiveCnt);
		System.out.println("6  "+sixCnt);
		System.out.println("7  "+sevenCnt);
		System.out.println("8  "+eightCnt);
		System.out.println("9  "+nineCnt);

	}

}

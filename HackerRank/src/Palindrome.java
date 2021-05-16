
public class Palindrome {

	public static void main(String []args){
		
		boolean flag = true;
        String str = "malayam"; // length = 5
        
        for(int i = 0; i< str.length(); i++){
            if(str.charAt(i) != str.charAt(str.length() - 1 - i)){
                flag = false;
                System.out.println(flag);
                break;
            }
        }
        
        System.out.println(flag);
         
     }

}

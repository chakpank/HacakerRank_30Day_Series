import java.util.Scanner;

public class Staircase 
{
    public static void main(String[] args) 
    {
        Scanner stdin = new Scanner(System.in);
        System.out.println("Enter the Height: ");
        int height = Integer.parseInt(stdin.nextLine());
        
        String str = "#";
		
		StringBuilder sb = new StringBuilder();
		sb = sb.append("");
		
		for(int i = 1; i<=height; i++)
		{
			for(int j=height; j>i; j--)
			{
				System.out.print(" ");				
			}
			System.out.println(sb.append("#"));
		}
    }
}
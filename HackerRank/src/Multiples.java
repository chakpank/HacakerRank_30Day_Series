import java.util.Scanner;

public class Multiples {

	public static void main(String[] args) {
		System.out.println("Enter Value of Tests: ");
		Scanner scanner = new Scanner(System.in);
		int tests = Integer.parseInt(scanner.nextLine());
		for (int i = 0; i < tests; i++)
		{
			System.out.println("Enter Value of Number: ");
			long number = Long.parseLong(scanner.nextLine());
			long result = sumOfMultiples(number);
			System.out.println(result);
		}

		scanner.close();

	}
	
	private static long sumOfMultiples(long number)
	{
		long result = 0;
		if (number > 3)
		{
			long min = 3;
			long count = (number - 1) / 3;
			long max = number - 1;
			System.out.println("1. Max : "+max);
			while (max % 3 != 0)
			{
				max--;
			}
			long tempResult = count * (min + max) / 2;
			System.out.println("1. TempResult: "+tempResult);
			result += tempResult;
		}
		if (number > 5)
		{
			long min = 5;
			long count = (number - 1) / 5;
			long max = number - 1;
			System.out.println("2. Max : "+max);
			while (max % 5 != 0)
			{
				max--;
			}
			long tempResult = count * (min + max) / 2;
			System.out.println("2. TempResult: "+tempResult);
			result += tempResult;
		}
		if (number > 15)
		{
			long min = 15;
			long count = (number - 1) / 15;
			long max = number - 1;
			while (max % 15 != 0)
			{
				max--;
			}
			long tempResult = count * (min + max) / 2;
			result -= tempResult;
		}

		return result;
	}

}

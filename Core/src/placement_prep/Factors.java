package placement_prep;

import java.util.Scanner;

public class Factors
{
	public static void main(String[] args)
	{
		System.out.println("Enter a number:");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		System.out.println("Factors of " + number + " are:");
		for (int i = 1; i <= number; i++)
		{
			if (number % i == 0)
			{
				System.out.println(i);
			}
		}
		input.close();
	}
}
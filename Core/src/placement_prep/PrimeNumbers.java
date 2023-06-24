package placement_prep;

import java.util.Scanner;

public class PrimeNumbers
{
	public static void main (String[] args)
	{
		System.out.println("Enter a number:");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		for(int i=1;i<=number;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
					count++;
			}
			if(count==2)
				System.out.println(i);
			input.close();
		}
	}
}
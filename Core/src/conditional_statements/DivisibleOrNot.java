package conditional_statements;

import java.util.Scanner;

public class DivisibleOrNot
{
	Scanner input = new Scanner(System.in);
	void find()
	{
		System.out.println("Enter a number:");
		int num=input.nextInt();
		if(num%15==0)
		{
			System.out.println(num+" is divisible by 15");
		}
		else
			System.out.println(num+" is not divisible by 15");
	}
	public static void main(String[] args)
	{
		new DivisibleOrNot().find();
	}
}

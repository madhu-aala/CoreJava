package practice;

import java.util.Scanner;

public class Sum_and_Diff_of_2Nums
{
	Scanner input = new Scanner(System.in);
	void getSumDiff()
	{
		System.out.println("Enter values: ");
		int a = input.nextInt();
		int b = input.nextInt();
		float c = input.nextInt();
		float d = input.nextInt();
		System.out.println("a value: "+(a+b));
		System.out.println("b value: "+(a-b));
		System.out.println("c value: "+(c+d));
		System.out.println("d value: "+(c-d));
	}
	public static void main(String[] args)
	{
		new Sum_and_Diff_of_2Nums().getSumDiff();
	}
}
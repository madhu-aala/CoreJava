package placement_prep;

import java.util.Scanner;

public class DigitCount
{
	Scanner sc=new Scanner(System.in);
	void getDigitCount()
	{
		long count=0;
		System.out.println("Enter any number:");
		long n=sc.nextLong();
		while(n!=0)
		{
			n=n/10;
			++count;
		}
		System.out.println("No.of digits are " + count);
	}
	public static void main(String[] args)
	{
		new DigitCount().getDigitCount();
	}
}
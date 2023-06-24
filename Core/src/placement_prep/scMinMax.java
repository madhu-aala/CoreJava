package placement_prep;

import java.util.Scanner;

public class scMinMax
{
	Scanner sc = new Scanner(System.in);
	void meth1()
	{
		System.out.println("Enter 1st number: ");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number: ");
		int b = sc.nextInt();
		System.out.println("Enter 3rd number: ");
		int c = sc.nextInt();
		if (a>b && a>c )
		{
			System.out.println("Largest is "+a);
		}
		else if(b>a && b>c)
		{
			System.out.println("Largest is "+b);
		}
		else
			System.out.println("Largest is "+c);
	}
	public static void main(String[] args)
	{
		new scMinMax().meth1();
	}
}
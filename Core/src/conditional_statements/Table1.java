package conditional_statements;

import java.util.Scanner;

public class Table1
{
	Scanner input = new Scanner(System.in);
	void m1()
	{
		System.out.println("Enter number: ");
		int num=input.nextInt();
		for(int i=1; i<=10; i++)
		{
			System.out.println(num+" * "+i+" = "+num*i);
		}
	}
	public static void main(String[] args)
	{
		new Table1().m1();
	}
}

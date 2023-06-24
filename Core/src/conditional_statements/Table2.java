package conditional_statements;

import java.util.Scanner;

public class Table2
{
	Scanner input = new Scanner(System.in);
	void m1()
	{
		System.out.println("Enter number: ");
		int i=1;
		int num=input.nextInt();
		while(i<=10)
		{
			System.out.println(num+" * "+i+" = "+num*i);
			i++;
		}
	}
	public static void main(String[] args)
	{
		new Table2().m1();
	}
}
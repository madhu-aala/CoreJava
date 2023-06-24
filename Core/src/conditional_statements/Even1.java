package conditional_statements;

import java.util.Scanner;

public class Even1
{
	Scanner input = new Scanner(System.in);
	void m1()
	{
		System.out.println("Enter a number: ");
		int num=input.nextInt();
		if(num%2==0) {
			System.out.println(num+" is a Even Number");
		}
		else
			System.out.println(num+" is not a Even number");
	}
	public static void main(String[] args) throws InstantiationException, IllegalAccessException
	{
		new Even1().m1();
	}
}
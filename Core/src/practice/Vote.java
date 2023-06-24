package practice;

import java.util.Scanner;

public class Vote
{
	Scanner sc=new Scanner(System.in);
	int meth(int age)
	{
		if(age>=18)
		{
			System.out.println("You're eligible to vote.");
		}
		else
		{
			System.out.println("Kid! Go watch POGO, you're not eligible.");
		}
		return age;
	}
	public static void main(String[] args)
	{
		System.out.println("Enter your age: ");
		Vote obj=new Vote();
		obj.meth(obj.sc.nextInt());
	}
}
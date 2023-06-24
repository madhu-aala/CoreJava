package placement_prep;

import java.util.Scanner;

public class A
{
	Scanner input = new Scanner(System.in);
	int number = input.nextInt();
	void checkEvenOdd()
	{
		if(number%2==0)
			System.out.println(number+" is Even");
		else
			System.out.println(number+" is Odd");
	}
	void getFactors()
	{
		System.out.println("Factors of "+number);
		for (int i = 1; i <= number; i++)
		{
			if (number % i == 0)
			{
				System.out.println(i);
			}
		}
	}
	void getFactorial()
	{
		long fact = 1;
		for (int i=1; i<= number; i++ )
		{
			fact = fact *i;
		}
		System.out.println("Factorial of "+number+" is: "+fact);
	}
	void checkPrime()
	{
		int count=0;
		for(int i=1; i<=number; i++)
		{
			if(number%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println(number+" is a Prime Number");
		}
		else
		{
			System.out.println(number+" is not a Prime Number");
		}
	}
	void getPrime()
	{
		System.out.println("Prime numbers upto "+number);
		for(int i=1;i<=number;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
					count++;
			}
			if(count==2)
				System.out.print(i+" ");

		}
	}
	public void digitSum()
	{
		int x,y,z,v;
		if(number<100)
		{
			x=number%10;
			y=number/10;
			System.out.println(x+y);
		}
		else if(number<1000)
		{
			x=number%10;
			y=(number%100)/10;
			z=number/100;
			System.out.println(x+y+z);
		}
		else if(number<10000)
		{
			x=number%10;
			y=(number%100)/10;
			z=(number%1000)/100;
			v=number/1000;
			System.out.println("Sum of digits"+x+y+z+v);
		}
	}
	public static void main(String[] args)
	{
		System.out.println("Enter a number:");
		A a = new A();
		a.checkEvenOdd();
		a.getFactors();
		a.getFactorial();
		a.digitSum();
		a.checkPrime();
		a.getPrime();
	}
}
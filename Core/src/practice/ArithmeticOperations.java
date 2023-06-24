/*
int meth1 (3 parameters) --> Addition(2)
int meth2 (2 parameters) --> Subtraction(4)
1 default constructor --> Division(3)
1 parameterized constructor --> Multiplication(1)

With the help of parameterized constructor call meth1
From meth1 call default constructor and meth2
 */
package practice;

public class ArithmeticOperations
{
	void meth1(int a, int b, int c)
	{
		System.out.println("Addition = "+(a+b+c));
		ArithmeticOperations obj=new ArithmeticOperations();
		obj.meth2(4,3);
	}
	void meth2(int a, int b)
	{
		System.out.println("Subtraction = "+(a-b));
	}
	ArithmeticOperations() //Default Constructor
	{
		System.out.println("Division = "+(10/2));
	}
	ArithmeticOperations(int a) //Parameterized Constructor
	{
		System.out.println("Multiplication = " +(a*a));
	}
	public static void main(String[] args)
	{
		new ArithmeticOperations(10).meth1(1, 2, 3);
	}
}

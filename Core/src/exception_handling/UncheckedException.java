package exception_handling;

public class UncheckedException
{
	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		//int a=2, b=0, c;
		//c=a/b;
		try
		{
			int a=2, b=0, c;
			c=a/b;
		}
		catch (ArithmeticException e)
		{
			System.out.println("Cannot divide by zero");
		}
		finally
		{
			System.out.println("Finally block");
		}
	}
}
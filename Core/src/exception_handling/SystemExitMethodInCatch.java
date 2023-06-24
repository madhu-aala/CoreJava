package exception_handling;

public class SystemExitMethodInCatch
{
	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		try
		{
			int a=2, b=0, c;
			c=a/b; //exception raised
		}
		catch (ArithmeticException e)
		{
			System.out.println("Cannot divide by zero");
			System.out.println("Before exit()");
			System.exit(0); //execution terminates here
			System.out.println("After exit()");
		}
		finally
		{
			//finally block will not be executed
			System.out.println("finally block");
		}
	}
}
package exception_handling;

public class SystemExitMethodInTry
{
	public static void main(String[] args)
	{
		try
		{
//all the statements will executed which are there before system.exit()
			System.out.println("Execution started");
			System.out.println("Before exit()");
			System.exit(0); //execution terminates here
			System.out.println("After exit()");
		}
		catch (Exception e)
		{
			System.out.println("catch block");
		}
		finally
		{
			//finally block will not be executed
			System.out.println("finally block");
		}
	}
}
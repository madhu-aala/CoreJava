package conditional_statements;

public class SwitchCase
{
	void meth(int x, int y, char c)
	{
		switch(c)
		{
		case '+':
			System.out.println("Addition: "+(x+y));
			break;
		case '-':
			System.out.println("Substraction: "+(x-y));
			break;
		case '*':
			System.out.println("Multiplication: "+(x*y));
			break;
		case '/':
			System.out.println("Division: "+(x/y));
			break;
		}
	}
	public static void main(String[] args)
	{
		new SwitchCase().meth(10, 20, '+');
	}
}
package lambda_expressions;

public class ClassA
{
	void display()
	{
		System.out.println("Implementing Lambda Expressions");
		InterfaceA x = ()-> System.out.println("Hello");
		x.method1();
		InterfaceB y = (int m, int n)-> System.out.println("Addition: "+(m+n));
		y.method2(10, 20);
		InterfaceC z = (int r, int s) ->
		{
			if(r>=s)
				return r+10;
			return s-10;
		};
		System.out.println("->"+z.method3(5,10));
	}
	public static void main(String[] args)
	{
		new ClassA().display();
	}
}
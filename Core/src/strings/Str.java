package strings;

public class Str
{
	public static void method(Object o)
	{
		System.out.println("Object");
	}
	public static void method(String s)
	{
		System.out.println("String");
	}
	public static void main(String[] args)
	{
		method(null);
	}
}
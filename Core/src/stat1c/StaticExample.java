package stat1c;

public class StaticExample
{ 
	static 
	{
		m1();
		System.out.println("Static block");
	}
	public static void m1()
	{
		m2();
		System.out.println("Static method m1()");
	}
	public static void m2()
	{
		System.out.println("Static method m2()");
	}
	public static int m3()
	{
		return 10;
	}
	public void m4()
	{
		m3();
	} 
	public static void main(String[] str)
	{
		m1();
		m2();
		m3();
		System.out.println("main() method");
	}
}
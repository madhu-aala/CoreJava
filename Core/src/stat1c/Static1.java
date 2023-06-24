package stat1c;

public class Static1
{
	int a=10; //instance variable
	static int b=20; //static instance variable
	static
	{
		System.out.println("static block1");
	}
	void m1() //non static or concrete method
	{
		int a=100; //local variable
		m3();
		System.out.println(a);
		System.out.println(b);
		System.out.println("concrete method");
	}
	static
	{
		System.out.println("static block2");
	}
	static void m2() //static method
	{
		//static int b=5; //cannot declare a local variable as static
		System.out.println("static method2");
		System.out.println(new Static1().a);
		System.out.println(b);
	}
	static void m3()
	{
		System.out.println("static m3");
	}
	@SuppressWarnings("static-access")
	public static void main(String[] args) 
	{
		Static1 a = new Static1();
		a.m1(); // object
		a.m2(); //object
		m2(); //identifier
		Static1.m2(); //class
	}
	static
	{
		System.out.println("static block3");
	}
}
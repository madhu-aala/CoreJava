package oops;

public class A2 extends A1
{
	protected void m1()
	{
		System.out.println("child");
	}
	public static void main(String[] args)
	{
		A2 obj = new A2();
		obj.m1();
		A1 o = new A2();
		o.m1();
	}
}
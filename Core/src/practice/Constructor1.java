package practice;

public class Constructor1
{
	Constructor1() //Default non-parameterized constructor
	{
		System.out.println("Non-parameterized constructor");
		new Constructor1(500).meth2();
	}
	public Constructor1(int a) //Parameterized constructor
	{
		System.out.println("Parameterized constructor");
	}
	void meth1()
	{
		System.out.println("meth1 called");
	}
	void meth2()
	{
		System.out.println("meth2 called");
	}
	public static void main(String[] args)
	{
		Constructor1 obj=new Constructor1();
		obj.meth1();
	}
}

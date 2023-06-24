package practice;

public class ClassC
{
	public void meth1()
	{
		System.out.println(10);
		ClassC obj = new ClassC();
		obj.meth2();
		System.out.println(20);
	}
	void meth2()
	{
		System.out.println(30);
		System.out.println(40);
	}
	public static void main(String[] args)
	{
		System.out.println("Start");
		ClassC obj = new ClassC();
		obj.meth1();
		System.out.println("End");
	}
}

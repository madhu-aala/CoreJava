package practice;

public class ClassB
{
	void meth1(int a,int b)
	{
		ClassB bobj = new ClassB();
		System.out.println(a-1);
		System.out.println(b);
		bobj.meth4(10,2,2);
	}
	void meth2(int x)
	{
		ClassB bobj = new ClassB();
		System.out.println(x);
		bobj.meth1(10, 10);
		System.out.println(x+9);
	}
	void meth3(int x,int y)
	{
		System.out.println(x*y);
		ClassB bobj = new ClassB();
		System.out.println(y);
		bobj.meth2(1);
	}
	void meth4(int a,int b,int c)
	{
		System.out.println(a+b);
		System.out.println(a/c);
		System.out.println(a-b);
		System.out.println(a*b);
	}

	public static void main(String[] args)
	{
		ClassB bobj = new ClassB();
		bobj.meth3(5, 2);
		System.out.println("End");
	}
}
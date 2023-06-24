package practice;

public class Constructor3
{
	int a=10;
	public String meth1()
	{
		new Constructor3(100,200,"JAVA");
		System.out.println(40);
		return new Constructor3().meth3(new Constructor3(50).meth2())
				+new Constructor3().meth4("HI");
	}
	Constructor3()
	{
		System.out.println("HI");
	}
	public int meth2()
	{
		System.out.println(50);
		return 10+15;
	}
	Constructor3(int a)
	{
		System.out.println("JAVA IS AWESOME");
	}
	public String meth3(int a)
	{
		System.out.println(18);
		return " IS";
	}
	Constructor3(int a, int b, String s)
	{
		System.out.println(a+b);
		System.out.println(s);
	}
	public String meth4(String s)
	{
		System.out.println(100);
		return " GOOD";
	}
	public static void main(String[] args)
	{
		Constructor3 obj1=new Constructor3();
		obj1.a=10;
		Constructor3 obj2=new Constructor3();
		obj2.a=30;
		System.out.println("JAVA"+obj1.meth1()+ " " +(obj1.a+obj2.a-30));
	}
}
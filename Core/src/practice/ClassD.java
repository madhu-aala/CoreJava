package practice;

public class ClassD
{
	void meth1()//meth3
	{
		ClassD obj = new ClassD();
		obj.meth5();
		int a = 10;
		System.out.println(10);
		System.out.println(54+a);
	}
	void meth2()//meth5
	{
		int a=20;
		System.out.println(78-a);
	}
	void meth3()//main
	{
		int a=30;
		ClassD obj = new ClassD();
		System.out.println(89+1);
		obj.meth1();
		System.out.println(10+a);
	}
	void meth4()
	{
		int a=10;
		System.out.println(89);
		System.out.println(85+a);
		System.out.println(44);
	}
	void meth5()//meth1
	{
		System.out.println(77);
		ClassD obj = new ClassD();
		obj.meth2();
		System.out.println(99);
	}

	public static void main(String[] args)
	{
		System.out.println("start");
		ClassD obj = new ClassD();
		obj.meth3();
		System.out.println("end");
	}

}
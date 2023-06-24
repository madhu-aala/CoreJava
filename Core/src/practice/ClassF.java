package practice;

public class ClassF {
	void meth1()
	{
		System.out.println("meth1 called");
	}
	int meth2(int a)
	{
		System.out.println("meth2 called");
		return a-1;
	}

	public static void main(String[] args)
	{
		ClassF obj = new ClassF();
		obj.meth1();
		System.out.println(obj.meth2(100));

	}

}

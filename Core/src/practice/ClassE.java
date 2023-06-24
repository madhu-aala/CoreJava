package practice;

public class ClassE
{
	void meth1(int a,int b)
	{
		System.out.println("meth1() called");
		System.out.println("a value: "+a);
		System.out.println("b value: "+b);
	}
	void meth2(int a)
	{
		System.out.println("meth2 called");
		System.out.println("Addition: "+(a+10));
		ClassE obj = new ClassE();
		obj.meth3(5,"java is awesome");
	}
	void meth3(int a, String s)
	{
		System.out.println("method3 called");
		System.out.println("sub: "+(a-5));
		System.out.println(s);
	}

	public static void main(String[] args)
	 {
		ClassE obj = new ClassE();
		obj.meth1(10, 20);
		obj.meth2(90);

	}

}
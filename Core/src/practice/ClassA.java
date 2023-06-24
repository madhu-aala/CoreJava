package practice;

public class ClassA
{
	void meth1(int a, int b)
	{
		System.out.println("meth1()executed");
		System.out.println("a value: "+a);
		System.out.println("b value: "+b);
		System.out.println("Addition: "+(a+b));
	}
	public static void main(String[] args)
	{
		System.out.println("Java is Awesome");
		ClassA aobj=new ClassA();
		aobj.meth1(99,1);
	}
}
	
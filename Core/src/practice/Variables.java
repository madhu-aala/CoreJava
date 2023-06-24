package practice;

public class Variables
{
	int a; //instance variable
	static int b; //static variable
	@SuppressWarnings({ "unused", "static-access" })
	void meth1()
	{
		int c=300; //local variable
		int a=100;
		int b=200;
		int x;
		System.out.println("Instance variable a: "+new Variables().a);
		System.out.println("Local variable a: "+a);
		System.out.println("Static variable b: "+new Variables().b);
		System.out.println("Static variable b: "+Variables.b);
		System.out.println("Local variable b: "+b);
		System.out.println("Local variable c: "+c);
		//System.out.println("Local variable x: "+x); //Compile time error
	}
	void meth2()
	{
		System.out.println("----------------------");
		System.out.println("Instance variable: "+a);
		System.out.println("Static variable: "+b);
		//System.out.println("Local variable: "+c); //Scope of local variable is only upto that method only.
	}
	public static void main(String[] args)
	{
		Variables obj=new Variables();
		obj.meth1();
		obj.meth2();
	}

}
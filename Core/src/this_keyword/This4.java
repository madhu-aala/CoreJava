//'this' keyword is used as a constructor call
package this_keyword;

public class This4
{
	void meth1()
	{
		System.out.println("meth1() called");
	}
	void meth2()
	{
		System.out.println("meth2() called");
	}
	This4()
	{
		this("Awesome");
		this.meth1();
		this.meth2();
		System.out.println("Default constructor called");
		//new This4("Awesome").meth1();
	}
	This4(String s)
	{
		System.out.println("Java is "+s);
	}
	public static void main(String[] args)
	{
		new This4();
	}
}

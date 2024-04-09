//'this' keyword is used to return the instance of a class
package this_keyword;

public class This3
{
	This3 meth1()
	{
		System.out.println("meth1() called");	
		return this;
	}
	This3 meth2()
	{
		System.out.println("meth2() called");
		return this;
	}
	void meth3()
	{
		System.out.println("meth3() called");
	}
	public static void main(String[] args)
	{
		new This3().meth1().meth2().meth3();	
	}
}

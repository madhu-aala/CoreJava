//It is used to call present class methods
package this_keyword;

public class This2
{
	void meth1()
	{
		System.out.println("meth1() called");
		this.meth2(95,5);
	}
	void meth2(int a, int b)
	{
		System.out.println("meth2() called: "+(a+b));
		System.out.println(this.meth3());
	}
	int meth3()
	{
		System.out.println("meth3() called");
		return 1;
	}
	public static void main(String[] args)
	{
		new This2().meth1();
	}
}

//'this' keyword is used to resolve the ambiguity between the instance variables and local variables.
package this_keyword;

public class This1
{
	int a=10;
	static int b=20;
	void meth1()
	{
		@SuppressWarnings("unused")
		int a=999;
		int b=1;
		//System.out.println("Instance variable: "+new This1().a); //Not RECOMMENDED
		System.out.println("Instance variable: "+this.a);
		System.out.println("Static variable: "+This1.b);
		System.out.println("Local variable: "+b);
	}
	public static void main(String[] args)
	{
		new This1().meth1();
	}
}

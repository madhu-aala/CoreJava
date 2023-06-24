package practice;

public class CopyConstructor
{
	int a;
	String b;
	CopyConstructor()
	{
		a=1;
		b="one";
		System.out.println(a+" "+b);
	}
	CopyConstructor(CopyConstructor cc2)
	{
		a=cc2.a;
		b=cc2.b;
		System.out.println(a+" "+b);
	}
	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		CopyConstructor cc1 = new CopyConstructor();
		CopyConstructor cc2 = new CopyConstructor(cc1);
	}
}
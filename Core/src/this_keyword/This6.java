package this_keyword;

public class This6
{
	int a = 1;
	int b = 2;
	int x = 22;
	int y = 33;
	void meth1(int a, int b)
	{
		a = this.x;
		a = this.a;
		b = this.y;
		b = this.b;
		System.out.println(x);
		System.out.println(y);
		System.out.println(a);
		System.out.println(b);
	}
	void meth2(int m, int n)
	{
		this.x = m;
		this.y = n;
		System.out.println(x);
		System.out.println(y);
		System.out.println(m);
		System.out.println(n);
	}
	public static void main(String[] args)
	{
		new This6().meth1(100, 200);
		new This6().meth2(1, 2);
	}
}
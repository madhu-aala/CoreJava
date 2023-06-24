package task;

public class A
{
	@SuppressWarnings({ "rawtypes", "unchecked" })
	void m()
	{
		int [] num = {1,2,3};
		//int [] copy = {};
		for(int i = num.length; i>0; i--)
		{
			System.out.print(i + " ");
		}
		
	}
	public static void main(String [] args)
	{
		A a = new A();
		a.m();
	}
}
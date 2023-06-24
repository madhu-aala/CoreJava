package practice;

public class Discount
{
	void meth1(int q) //q=quantity
	{
		int t=q*100; //t=total
		if (t>=1000)
		{
			int d=t*10/100; //d=discount
			System.out.println("Discount="+d);

			t=t*90/100;
			System.out.println("Net Amount="+t);
		}
		else
			System.out.println("Net Amount without discount="+t);
	}
	public static void main(String[] args)
	{
		Discount obj=new Discount();
		obj.meth1(10);
	}
}

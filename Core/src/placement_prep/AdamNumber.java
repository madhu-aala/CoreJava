package placement_prep;

public class AdamNumber
{
	void getAdamNumber(int x, int y)
	{
		x=x*x;
		y=y*y;
		int r,s=0;
		while(x!=0)
		{
			r=x%10; //169%10=9/6/1
			s=s*10+r; //0*10+9=9/9*10+6=96/96*10+1=961
			x=x/10; //169/10=16/1/0
		}
		if(s==y)
		{
			System.out.println("Adam Number");
		}
		else
			System.out.println("Not a adam number");
	}

	public static void main(String[] args)
	{
		AdamNumber obj=new AdamNumber();
		obj.getAdamNumber(13, 31);
	}
}
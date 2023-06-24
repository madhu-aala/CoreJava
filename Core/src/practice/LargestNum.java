package practice;

public class LargestNum
{
	int getLargestNum(int a, int b, int c)
	{
		if(a>b && a>c)
		{
			System.out.println("Largest number is "+a);
		}
		else if(b>c && b>a)
		{
			System.out.println("Largest number is "+b);
		}
		else
		{
			System.out.println("Largest number is "+c);
		}
		return 0;
	}
	public static void main(String[] args)
	{
		new LargestNum().getLargestNum(11, 11, 11);
	}
}

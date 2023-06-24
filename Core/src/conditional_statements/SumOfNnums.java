package conditional_statements;

//write a program to print sum of natural numbers

public class SumOfNnums
{
	void getSum()
	{
		int n=10,sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("Sum of 1 to "+n+" numbers is "+sum);
	}
	public static void main(String[] args)
	{
		new SumOfNnums().getSum();
	}
}

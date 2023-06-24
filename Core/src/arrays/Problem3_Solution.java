package arrays;

public class Problem3_Solution
{
	int numPresent(int[] num, int num1, int num2)
	{
		int count = 0;
		for(int n:num)
		{
			if(n>num1 && n<=num2)
				count++;
		}
		return count;
	}
	public static void main(String[] args)
	{
		int num[]= {0,1,5,8,14,18,44,81,89,99,102};
		System.out.println(new Problem3_Solution().numPresent(num, 10, 20));
	}
}
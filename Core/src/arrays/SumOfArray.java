package arrays;

public class SumOfArray
{
	public static void main(String[] args)
	{
		int sum=0;
		int arr[] = {1, 1, 1, 1, 1};
		for(int i=0; i<arr.length; i++)
		{
			sum = arr[i]+sum;
		}
		System.out.println(sum);
	}
}
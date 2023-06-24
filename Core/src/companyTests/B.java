package companyTests;

public class B
{
	public static void main(String[] args)
	{
		int arr[]= {2,7,9,11,19};
		int sum=11;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length; j++)
			{
				if(arr[j]==sum-arr[i])
				{
					System.out.println(arr[i]+","+arr[j]);
				}
			}
		}
	}
}
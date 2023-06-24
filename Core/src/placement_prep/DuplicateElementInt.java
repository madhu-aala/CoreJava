package placement_prep;

public class DuplicateElementInt
{
	public static void main(String[] args)
	{
		int arr[]=new int [] {1,2,2,1,6,8,8,1,1,1,3};
		int count;
		for(int i =0;i<arr.length; i++)
		{
			count = 1;
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					arr[j]=0;
				}
			}
			if(count>1 && arr[i]!=0)
			{
				System.out.println(arr[i]);
			}
		}
	}
}
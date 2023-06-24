package placement_prep;

public class ArraySorting
{
	public static void main(String[] args)
	{
		int arr[] = {2,1,6,10,5,3,7,9};
		int temp;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				//if(arr[i]<arr[j]) //descending order
				if(arr[i]>arr[j]) //ascending order
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.print(arr[i] + " ");
		}
	}
}
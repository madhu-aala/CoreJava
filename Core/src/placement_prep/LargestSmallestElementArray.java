package placement_prep;

public class LargestSmallestElementArray
{
	public static void main(String[] args)
	{
		int arr[]= {0,2,9,5,6,3,7,4,1,8,6};
		int temp;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i] > arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nSmallest element: "+arr[0]);
		System.out.println("Largest element: "+arr[arr.length-1]);
	}
}
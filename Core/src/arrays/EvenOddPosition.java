package arrays;

public class EvenOddPosition
{
	int arr[]= {3,5,12,7,16,13,14,23,56};
	void getEvenIndex()
	{
		System.out.println("Elements at Even Position:");
		for(int i=0;i<arr.length;i=i+2)
		{
			System.out.println(arr[i]);
		}
	}
	void getOddIndex()
	{
		System.out.println("Elements at Odd Position:");
		for(int i=1;i<arr.length;i=i+2)
		{
			System.out.println(arr[i]);
		}
	}
	void getEvenNums()
	{
		System.out.println("Even elements are:");
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]);
			}
		}
	}
	public static void main(String[] args) 
	{
		EvenOddPosition obj = new EvenOddPosition();
		obj.getEvenIndex();
		obj.getOddIndex();
		obj.getEvenNums();
	}
}
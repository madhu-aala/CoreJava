package arrays;

public class ReturnIndex
{
	public static void main(String[] args)
	{
		int[] numbers = {4, 9, 7, 3, 2, 8}; 
		int element = 2;
		int index = -1;

		for(int i = 0; i < numbers.length; i++)
		{
			if(numbers[i] == element)
			{
				index = i;
				break;
			}
		}

		System.out.println("Index of "+element+" is : "+index);
	}
}
package arrays;

import java.util.Arrays;

public class PutZerosToEnd
{
	int[] arr = {6, 0, 8, 0, 2, 3, 0, 4, 0, 1};
	int k;
	void reorder()
	{
		for (int g: arr)
		{
			if (g != 0)
			{
				arr[k++] = g;
			}
		}
		for (int i = k; i < arr.length; i++)
		{
			arr[i] = 0;
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args)
	{
		new PutZerosToEnd().reorder();
	}
}
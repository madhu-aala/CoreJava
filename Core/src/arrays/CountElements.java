package arrays; 
public class CountElements
{
	public static void main(String args[])   
	{  
		int arr[] = {9,2,1};
		int count=0;
		for(int i=0; i<arr.length; i++)
		//for(int i:arr)
		{
			count++;
		}
		System.out.println(count);
	}
}
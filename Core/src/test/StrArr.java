package test;

public class StrArr
{
	public static void main(String[] args)
	{
		String [] arr = {"C#", "C++","Java","Python","HTML"};
		String s = "Java";
		for(int i=0; i<arr.length; i++)
		{
			if(s.equals(arr[i]))
			{
				arr[i]="Python";
				break;
			}
			System.out.println(arr[i]);
		}
	}
}
package arrays;

public class FirstLastMiddleElement
{
	public static void main(String[] args)
	{
		int arr[]= {1,2,3,4,5};
		//int mid = arr.length/2;
		System.out.println(arr[0]);
		System.out.println(arr.length);
		
		String s = "jahva";
		int m = s.length()/2;
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(s.length()-1));
		System.out.println(s.charAt(m));
	}
}
package placement_prep;

public class SwapWithout3rdVar
{
	public static void main(String[] args)
	{
		int a = 15;
		int b = 10;
		System.out.println("Before swapping a: "+a+", b: "+b);
		a = a + b; //15+10=25
		b = a - b; //25-10=15
		a = a - b; //25-15=10
		System.out.println("After swapping a: "+a+", b: "+b);
	}
}

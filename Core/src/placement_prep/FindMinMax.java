package placement_prep;

public class FindMinMax 
{
	public static void main(String[] args)
	{
		int a = 10;
		int b = 15;
		int c = 20;
		System.out.println("The Numbers are a= "+a+" b= "+b+" c= "+c);
		int max = (a>b ? (a>c ? a : c): (b>c ? b : c));
		System.out.println("Max= "+max);
		int min = (a<b ? (a<c ? a : c): (b<c ? b : c));
		System.out.println("Min= "+min);
	}
}
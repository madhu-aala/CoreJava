package strings;

public class EvenPositionString
{
	public static void main(String[] args)
	{
		String[] s = {"J", "A", "V", "A"};
		for(int i=1; i<s.length; i=i+2)
		{
			System.out.print(s[i] + " ");
		}
	}
}
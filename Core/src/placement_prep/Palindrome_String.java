package placement_prep;

public class Palindrome_String
{
	void stringPalindrome()
	{
		String str = "Madam";
		str=str.toLowerCase(); 
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		if(rev.equals(str))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
	}
	public static void main(String[] args)
	{
		new Palindrome_String().stringPalindrome();
	}
}
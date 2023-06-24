package placement_prep;

public class Palindrome_Number
{
	public static void main(String[] args)
	{
		int num = 121, rem, rev=0,temp=num;
		while (num > 0)
		{
			rem = num % 10;
			rev = rev * 10 +rem;
			num = num /10;
		}
		if (temp==rev)
		{
			System.out.println(temp+" is a Palindrome number");
		}
		else
			System.out.println(temp+" is not a Palindrome number");
	}
}
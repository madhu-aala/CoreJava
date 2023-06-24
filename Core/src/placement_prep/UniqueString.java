package placement_prep;

import java.util.Scanner;

public class UniqueString
{
	boolean checkUnique(String s)
	{
		for(int i=0; i<s.length(); i++)
		{
			for(int j=i+1; j<s.length(); j++)
			{
				if(s.charAt(i)==s.charAt(j))
					return false;
			}
		}
		return true;
	}
	public static void main(String[] args)
	{
		UniqueString u = new UniqueString();
		System.out.println("Enter a string:");
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		if (u.checkUnique(s))
		{
			System.out.println(s+" contains UNIQUE characters");
		}
		else
		{
			System.out.println(s+" contins DUPLICATE characters");
		}
		input.close();
	}
}
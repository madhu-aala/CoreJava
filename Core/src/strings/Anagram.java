package strings;

import java.util.Arrays;

public class Anagram
{
	public static void main(String[] args)
	{
		String s1="Listen";
		String s2="Silent";

		s1=s1.toLowerCase();
		s2=s2.toLowerCase();

		char c1[]=s1.toCharArray(); //{'l','i','s','t','e','n'}
		char c2[]=s2.toCharArray(); //{'s','i','l','e','n','t'}

		Arrays.sort(c1);		   //{'e','i','l','n','s','t'}
		Arrays.sort(c2);		   //{'e','i','l','n','s','t'}

		if(Arrays.equals(c1,c2)==true)
		{
			System.out.println("Given Strings are anagram");
		}
		else
		{
			System.out.println("Given Strings are not anagram");
		}
	}	
}
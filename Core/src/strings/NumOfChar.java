package strings;

import java.util.Scanner;

public class NumOfChar
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		int count = 0;
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i) !=' ')
			{
				count++;
			}
		}
		System.out.println(count);
		input.close();
	}
}
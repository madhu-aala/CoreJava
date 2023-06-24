package placement_prep;

import java.util.Scanner;

public class ReverseString
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name:");
		String rev = sc.nextLine();
		for (int i = rev.length() - 1; i >= 0; i--)
		{
			System.out.print(rev.charAt(i));
		}
		sc.close();
	}
}
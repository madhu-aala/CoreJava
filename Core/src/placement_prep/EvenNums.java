package placement_prep;

import java.util.Scanner;

public class EvenNums
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n1 = sc.nextInt();
		System.out.println("Enter another number:");
		int n2 = sc.nextInt();
		
		for(int i=n1;i<n2; i++)
		{
			if(i%2!=0)
			System.out.print(i+1+" ");
		}
		sc.close();
	}
}
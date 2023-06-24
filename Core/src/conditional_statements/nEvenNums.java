package conditional_statements;

//Program to print even numbers upto n numbers.
import java.util.Scanner;

public class nEvenNums
{
	int n;
	Scanner sc = new Scanner(System.in);
	void getEvenNums()
	{
		System.out.println("Enter a number: ");
		n = sc.nextInt();
		for(int i=0; i<n; i++)
		{
			System.out.println(2*(i+1));
		}
	}
	public static void main(String[] args)
	{
		new nEvenNums().getEvenNums();
	}
}
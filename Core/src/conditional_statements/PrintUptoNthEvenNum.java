package conditional_statements;
//Program to print even numbers upto nth number.
import java.util.Scanner;

public class PrintUptoNthEvenNum
{
	int n;
	int i;
	Scanner sc = new Scanner(System.in);
	void getEvenNums()
	{
		System.out.println("Enter a number : ");
		n = sc.nextInt();
		for(int i=0; i<n; i++)
		if(i%2==0)
		{
			System.out.println(i);
		}
	}
	public static void main(String[] args)
	{
		new PrintUptoNthEvenNum().getEvenNums();
	}
}
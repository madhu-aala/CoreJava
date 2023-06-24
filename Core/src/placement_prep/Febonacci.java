package placement_prep;

import java.util.Scanner;

public class Febonacci
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int count = sc.nextInt();
		int n1=0,n2=1,n3;    
		System.out.print(n1+" "+n2);    
		for(int i=2;i<count;i++)
			//loop starts from 2 because 0 and 1 are already printed    
		{    
			n3=n1+n2;    
			System.out.print(" "+n3);    
			n1=n2;
			n2=n3;    
		} 
		sc.close();
	}
}
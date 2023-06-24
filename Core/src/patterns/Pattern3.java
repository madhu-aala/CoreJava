package patterns;

public class Pattern3
{
	public static void main(String args[])  
	{  
		int row=11;  
		for (int i= row; i>= 1; i--)  
		{  
			for (int j=row; j>i;j--)  
			{  
				System.out.print(" ");  
			}  
			for (int k=1;k<=i;k++)  
			{  
				System.out.print("9");
			}  
			System.out.println("");  
		}
	}
}
package placement_prep;

//printing first fibonacci series in reverse order

public class ReverseFebonacci
{
	public static void main(String args[]) 
	{
		int n1=34,n2=21,n3;
		System.out.print(n1+" "+n2);
		for(int i=0;i<8;i++)
		{
			n3=n1-n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
	}
}
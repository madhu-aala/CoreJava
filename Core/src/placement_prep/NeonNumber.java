package placement_prep;

/*A neon number is a number where the sum of digits
 of square of the number is equal to the number.
Example: Input = 9
         Input square = 9*9=81
         Square digit sum = 8+1=9
*/
public class NeonNumber
{
	public static void main(String[] args)
	{
		int n=9,sum=0,square,rem;
		square=n*n;     		 //81
		while(square>0)
		{
			rem=square%10;   	 //1//8
			sum=sum+rem;     	 //0+1=1//1+8=9
			square=square/10;
		}
		if(n==sum)            	 //9==9
		{
			System.out.println(n+" is a neon number");
		}
		else
			System.out.println(n+" is not a neon number");
	}
}
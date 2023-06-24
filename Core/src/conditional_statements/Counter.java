package conditional_statements;
//write a program to count digits,lower letters,upper letters,special characters in a given string
public class Counter
{
	void getCount()
	{
		String s1="abc123xyz68554252682@#$%^&SWEXBTYN*(){}?><";
		int count=0,upper=0,lower=0,special=0;

		for(int i=0;i<=s1.length()-1;i++)
		{
			char ch=s1.charAt(i);

			if(ch >= '0' && ch <= '9')
			{
				++count;
			}
			else if(ch >= 'a' && ch <= 'z')
			{
				++lower;		
			}
			else if(ch >= 'A' && ch <= 'Z')
			{
				++upper;		
			}
			else
			{
				++special;
			}
		}
		System.out.println("Digit count: "+count);
		System.out.println("Lower case count: "+lower);
		System.out.println("Upper case count: "+upper);
		System.out.println("Special character count: "+special);
	}
	public static void main(String[] args) throws InstantiationException, IllegalAccessException
	{
		new Counter().getCount();
	}
}

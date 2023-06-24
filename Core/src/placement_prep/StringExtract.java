package placement_prep;

public class StringExtract
{
	public static void main(String[] args) 
	{
		String str="m9n8t3A9A7";
		for(int i=0;i<str.length();i++)
		{
			if((str.charAt(i)>='A' && str.charAt(i)<='Z' ||
					str.charAt(i)>='a' && str.charAt(i)<='z'))
			{
				System.out.print(str.charAt(i));
			}
			else
			{
				int num = str.charAt(i)-48;
				for(int j=1;j<num;j++)
					System.out.print(str.charAt(i-1));
			}
		}
	}
}
package companyTests;

public class A
{
	public static void main(String[] args)
	{
		String temp;
		String s[] = {"flower, flow"};
		for(int i=0;i<s.length;i++)
		{
			for(int j=0; j<s.length; j++)
			{
				if(s[i]==s[j])
				{
					temp=s[i];
					System.out.println(temp);
				}
			}
		}
	}
}
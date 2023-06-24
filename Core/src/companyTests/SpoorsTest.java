package companyTests;

public class SpoorsTest
{
	public static void main(String[] args)
	{
		String [] values = {"a","b","c","a","c","a","b"};
		for(int i=0; i<values.length; ++i)
		{
			for(int j=i+1; j<values.length; ++j)
			{
				if(values[i].compareTo(values[j])==0)
				{
					System.out.println(values[j]);
				}
			}
		}
	}
}
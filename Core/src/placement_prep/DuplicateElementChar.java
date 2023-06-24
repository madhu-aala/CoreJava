package placement_prep;

public class DuplicateElementChar
{
	public static void main(String[] args)
	{
		String s = "COFFEE tea";
		s=s.toLowerCase();
		char [] arr=s.toCharArray();
		int count;
		for(int i =0;i<arr.length; i++)
		{
			count = 1;
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					arr[j]='0';
				}
			}
			if(count>1 && arr[i]!='0')
			{
				System.out.print(arr[i]);
			}
		}
	}
}
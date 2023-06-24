package placement_prep;

public class DuplicateElementString
{
	public static void main(String[] args)
	{
		String arr[] = {"Java","C#","C","Python","C","Java"};
		int count;
		for(int i =0;i<arr.length; i++)
		{
			count = 1;
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i].equals(arr[j]))
				{
					count++;
					arr[j]="0";
				}
			}
			if(count>1 && arr[i]!="0")
			{
				System.out.println(arr[i]);
			}
		}
	}
}
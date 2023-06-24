package conditional_statements;

public class Print001To100
{
	void PrintNums()
	{
		int i;
		for(i=1;i<=100;i++)
		{
			if(i<10)
				System.out.println("00"+i);
			else if (i<100)
				System.out.println("0"+i);
			else
				System.out.println(""+i);
		}
	}
	public static void main(String[] args)
	{
		new Print001To100().PrintNums();
	}
}
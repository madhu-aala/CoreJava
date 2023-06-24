package lab_tasks;

public class BooleanCount
{
	boolean countBoolean(boolean b1, boolean b2, boolean b3)
	{
		if(b1==true && b2==true || b3==true)
		{
			return true;
		}
		else if(b1==true || b2==true && b3==false)
		{
			return true;
		}
		else if(b1==true || b2==false && b3==false)
		{
		return false;
		}
		
		
		return b1;
	}
	public static void main(String[] args)
	{
		System.out.println(new BooleanCount().countBoolean(true,false,false));
	}
}
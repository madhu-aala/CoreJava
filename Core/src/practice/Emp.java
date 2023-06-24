 package practice;

public class Emp
{
	void meth(int exp, float sal)
	{
		float increment;
		if(exp>=2 && exp<4)
		{
			increment=sal*10/100;
			sal=increment+sal;
			System.out.println("Experience : "+exp);
			System.out.println("Increment : "+increment);
			System.out.println("Total salary : "+sal);
		}
		else if(exp>=4 && exp<10)
		{
			increment=sal*30/100;
			sal=increment+sal;
			System.out.println("Experience : "+exp);
			System.out.println("Increment : "+increment);
			System.out.println("Total salary : "+sal);
		}
		else
		{
			increment=sal*75/100;
			sal=increment+sal;
			System.out.println("Experience : "+exp);
			System.out.println("Increment : "+increment);
			System.out.println("Total salary : "+sal);
		}	
	}
	public static void main(String[] args)
	{
		Emp aobj=new Emp();
		aobj.meth(4, 50000);
	}
}

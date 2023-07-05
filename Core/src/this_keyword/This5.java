package this_keyword;

public class This5
{
	String name;
	String names;
	This5()
	{
		this.name="EJB";
		this.names="POJO";
	}
	public String swap(String name, String names)
	{
		String temp=name;
		name=names;
		names=temp;
		return name+" "+names;
	}
	public static void main(String[] args)
	{
		This5 p=new This5();
		p.swap(p.name, p.names);
		System.out.print(p.name+" "+p.names);
	}
}
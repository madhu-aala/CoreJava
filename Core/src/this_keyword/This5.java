package this_keyword;

class Program
{
	String name;
	String names;
	Program()
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
		Program p=new Program();
		p.swap(p.name, p.names);
		System.out.print(p.name+" "+p.names);
	}
}
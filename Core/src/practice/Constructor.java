package practice;

public class Constructor
{
	String name;
	Constructor()
	{
		this("Python");
		this.display();
		System.out.println("C#");
	}
	Constructor(String name)
	{
		this.name=name;
		System.out.println("Java");
	}
	void display()
	{
		System.out.println("I Love "+name+", because it is awesome");
	}
	public static void main(String[] args)
	{
		@SuppressWarnings("unused")
		Constructor c=new Constructor();
		//c.display();
	}
}

package practice;

public class Constructor2
{
	public Constructor2() //main
	{
		System.out.println("Sunday");
		Constructor2 obj=new Constructor2(10);
		System.out.println("Tuesday");
		String s=obj.display("Challenge Accepted");
		System.out.println(s);
	}
	public Constructor2(int temp)
	{
		System.out.println("Saturday");
		new Constructor2(10,20);
		System.out.println("Monday");
	}
	String display(String s)
	{
		System.out.println("In the next statement I'm returning string value");
		return s;
	}
	public Constructor2(int data, int temp)
	{
		System.out.println("Thrusday");
	}
	public static void main(String[] args)
	{
		@SuppressWarnings("unused")
		Constructor2 obj=new Constructor2();
		System.out.println("Output verified");
	}

}

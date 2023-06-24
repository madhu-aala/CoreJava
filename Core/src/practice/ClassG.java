package practice;

public class ClassG {
	

	public static void main(String[] args)
	{
		 
		 System.out.println(new ClassG().meth1(1,5)+100);	
	}
	int meth1(int a,int b)
	{
		System.out.println(85+a);
		System.out.println(a+b);
		return new ClassG().meth3(2);
	}
	String meth2(int a,String s)
	{
		System.out.println(s);
		System.out.println(a);
		return s;
	}
	int meth3(int a)
	{
		String val = new ClassG().meth2(10, "hi");
		System.out.println(val);
		System.out.println("java is awesome");
		return a*2;
	}

}
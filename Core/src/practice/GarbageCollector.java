package practice;

public class GarbageCollector
{
	void meth1()
	{
		System.out.println("Hi");
	}
	protected void finalize()
	{
		System.out.println("Garbage has been collected");
	}
	public static void main(String[] args)
	{
		GarbageCollector jobj1 = new GarbageCollector();
		jobj1.meth1();

		jobj1=null;
		System.gc();
	}

}

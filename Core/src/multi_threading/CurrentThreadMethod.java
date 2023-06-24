package multi_threading;

public class CurrentThreadMethod
{
	public static void main(String[] args)
	{
		//System.out.println(Thread.currentThread());
		Thread t = Thread.currentThread();
		System.out.println("Thread Name: "+ t.getName());
		System.out.println("Thread Priority: "+ t.getPriority());
	}
}

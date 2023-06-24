package multi_threading;

public class ThreadByRunnable
{
	public static void main(String[] args)
	{
		myThread p = new myThread();
		Thread t = new Thread(p);
		t.start();
	}
}
class myThread implements Runnable
{
	@Override
	public void run()
	{
		System.out.println("Created Thread by using runnable interface");
		System.out.println(Thread.currentThread());
	}
}
package multi_threading;

public class MultiThreading2 extends Thread
{
	public void run()
	{
		String name=Thread.currentThread().getName();
		int priority=Thread.currentThread().getPriority();
		for(int i=1; i<=5; i++)
		{
			System.out.println(name+"("+priority+")"+" has executed run():"+i);
		}
		System.out.println("------------------------------");
	}
	public static void main(String[] args)
	{
		MultiThreading2 mt=new MultiThreading2();
		Thread t1=new Thread(mt);
		Thread t2=new Thread(mt);
		Thread t3=new Thread(mt);
		//t1.setPriority(MIN_PRIORITY);
		t1.setPriority(1);
		t2.setPriority(10);
		t1.setName("Thread t1");
		t2.setName("Thread t2");
		t3.setName("Thread t3");
		t1.start();
		t2.start();
		//t3.start();
		t3.run();
	}
}
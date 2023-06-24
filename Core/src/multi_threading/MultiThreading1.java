package multi_threading;

public class MultiThreading1 extends Thread
{
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println("run method executed: "+i);
			System.out.println("Inside loop statement");
		}
		System.out.println("---run method execution completed---");
		System.out.println("------------------------------------");
	}
	public static void main(String[] args)
	{
		//new MultiTasking1().run();
		MultiThreading1 mt=new MultiThreading1();
		Thread t1=new Thread(mt);
		t1.start();
		//t1.run();
		Thread t2=new Thread(mt);
		//t2.start();
		t2.run();

	}
}

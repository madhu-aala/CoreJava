package multi_threading;

public class MultiTaskingJoin1 extends Thread
{
	public static void main(String[] args) throws InterruptedException
	{
		MultiThreadingJoin mtj=new MultiThreadingJoin();
		Thread t1=new Thread(mtj);
		//mtj.start();
		mtj.join();
		t1.start();
		for(int i=5; i<=10; i++)
		{
			System.out.println("I'm from main()"+i);
		}
	}
}
package multi_threading;

public class MultiThreadingJoin extends Thread
{
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println("I'm from join() "+i);
		}
	}
}

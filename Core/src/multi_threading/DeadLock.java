package multi_threading;

public class DeadLock
{
	public static void main(String[] args)
	{  
		String A = "Java";  
		String B = "Python";
		Thread t1 = new Thread()
		{  
			public void run()
			{  
				synchronized (A) //Java is held by Thread 1
				{  
					System.out.println("Thread 1: locked A");
					try
					{
						Thread.sleep(1000);
					}
					catch (Exception e)
					{
						e.printStackTrace();
					}  
					synchronized (B) //Thread 1 will be waiting for Python
					{  
						System.out.println("Thread 1: locked B");  
					}  
				}  
			}  
		}; 
		Thread t2 = new Thread()
		{  
			public void run()
			{  
				synchronized (B) //Python is held by Thread 2
				{  
					System.out.println("Thread 2: locked B");  

					try
					{
						Thread.sleep(1000);
					}
					catch (Exception e)
					{
						e.printStackTrace();
					}  

					synchronized (A) //Thread 1 will be waiting for Java
					{  
						System.out.println("Thread 2: locked A");  
					}  
				}  
			}  
		};  
		t1.start();  
		t2.start();
	}
}
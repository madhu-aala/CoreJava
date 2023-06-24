package multi_threading;

import java.util.Scanner;

public class MultiThreadingSleep
{
	public static void main(String[] args) throws InterruptedException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name=sc.nextLine();
		System.out.println(name+" you are..");
		Thread.sleep(3000);
		System.out.println("Please Wait...");
		Thread.sleep(3000);
		System.out.println("Keep wait....");
		Thread.sleep(3000);
		System.out.println("Appreciate for your patience.....");
		Thread.sleep(3000);
		System.out.println("Here we go......");
		Thread.sleep(3000);
		System.out.println("----------------");
		Thread.sleep(3000);
		System.out.println(name+ " you are Awesome");
		sc.close();
	}
}

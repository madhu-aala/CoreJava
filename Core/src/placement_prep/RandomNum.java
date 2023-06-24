package placement_prep;

import java.util.Random;

public class RandomNum
{
	public static void main(String[] args)
	{
		Random random = new Random();   
		// Generates random integers 0 to 49  
		int x = random.nextInt(50);   
		// Generates random integers 0 to 999  
		int y = random.nextInt(1000);   
		System.out.println("Randomly Generated Integers Values");  
		System.out.println(x);   
		System.out.println(y);
	}
}
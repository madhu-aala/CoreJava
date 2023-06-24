package companyTests;

import java.util.ArrayList;

public class Merge_Lists //EngageBay
{
	void meth() 
	{ 
		ArrayList<Integer> al2= new ArrayList<>(); 
		al2.add(1); 
		al2.add(2); 
		al2.add(3); 
		System.out.println(al2); 

		ArrayList<Integer> al3= new ArrayList<>(); 
		al3.add(4); 
		al3.add(5); 
		al3.add(6); 
		System.out.println(al3); 

		ArrayList<Integer> merge= new ArrayList<>(); 
		merge.addAll(al2); 
		merge.addAll(al3); 

		System.out.println(merge); 
	} 
	public static void main(String[] args)  
	{ 
		new Merge_Lists().meth(); 
	} 
}
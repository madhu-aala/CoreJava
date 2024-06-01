package collections;

import java.util.ArrayList;

public class MergeList
{
	public static void main(String[] args) { 
		ArrayList<Integer> list1= new ArrayList<>(); 
		list1.add(1); 
		list1.add(2); 
		list1.add(3); 
		System.out.println(list1); 

		ArrayList<Integer> list2= new ArrayList<>(); 
		list2.add(4); 
		list2.add(5); 
		list2.add(6); 
		System.out.println(list2); 

		ArrayList<Integer> merge= new ArrayList<>(); 
		merge.addAll(list1); 
		merge.addAll(list2); 

		System.out.println(merge);
	}
}
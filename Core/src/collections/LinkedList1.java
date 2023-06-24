package collections;

import java.util.LinkedList;

public class LinkedList1
{
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args)
	{
		LinkedList ll = new LinkedList();
		ll.add(1);
		ll.add("3");
		ll.add(2);
		ll.add("4");
		ll.remove(2);
		System.out.println(ll);
		for(int i=ll.size()-1; i>=0; i--)
		{
			System.out.print(ll.get(i)+" ");
		}
	}
}
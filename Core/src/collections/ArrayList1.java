package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1
{
	@SuppressWarnings({ "unchecked", "rawtypes" })
	void getArrayList()
	{
		System.out.println("Implementing ArrayList");
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(null);
		al.add(10);
		al.add("java");
		al.add('a');
		al.add(50);
		al.add(2);
		System.out.println(al);
		System.out.println("Size of ArrayList : "+al.size());
		System.out.println("Data present at 3rd index is "+al.get(3));
		/*al.remove(1);
		System.out.println(al);*/

		System.out.println();

		System.out.println("Retriving data using for loop");
		for(int i=0; i<al.size(); i++)
		{
			System.out.print(al.get(i)+" ");
		}
		
		System.out.println(); System.out.println();

		System.out.println("Retriving data in reverse order by using for loop");
		for(int i=al.size()-1; i>0; i--)
		{
			System.out.print(al.get(i)+ " ");
		}

		System.out.println("Retriving data using for each loop");
		for(Object o:al)
		{
			System.out.println(o);
		}

		System.out.println();
		System.out.println();

		System.out.println("Retriving data using forEach loop and lambda expression");
		al.forEach(obj ->
		{
			System.out.print(obj+" ");
		});

		System.out.println();
		System.out.println();

		System.out.println("Retriving data using Iterator Interface");
		Iterator i = al.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next()+ " ");
		}

		System.out.println(); System.out.println();

		System.out.println("isEmpty(): "+al.isEmpty());
		System.out.println("remove(): "+al.remove(1));
		System.out.println(al);
		System.out.println("remove(): "+al.remove((Object)10));
		System.out.println(al);
		System.out.println("contains(): "+al.contains(10));
		System.out.println("contains(): "+al.contains(10));
		System.out.println(al.size());
		System.out.println("contains(): "+al.contains(al.size()-1));
		System.out.println(al);
	}
	public static void main(String[] args)
	{
		new ArrayList1().getArrayList();
	}
}
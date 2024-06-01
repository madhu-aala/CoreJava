package collections;

import java.util.LinkedList;

public class LinkedListExample
{
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		LinkedList list1 = new LinkedList();
		list1.add(1);
		list1.add("3");
		list1.add(2);
		list1.addLast("Last"); //Adding an element at the last position
		list1.add("4");
		list1.remove(2); //Removing element on the basis of specific index position
		list1.add("List");
		list1.remove("List"); //Removing specific element from the list
		list1.add(2, "9");
		list1.addFirst("First"); //Adding an element at the first position
		System.out.println("List: " + list1);
		
		LinkedList list2 = new LinkedList();
		list2.add("One");
		list2.add("Two");
		list2.add("Three");
		
		list1.addAll(list2);
		System.out.println("Updated list" + list1);
		
		list2.clear(); //Removing all the elements in the list
		System.out.println("list2: " + list2);
		
		list1.clone();
		System.out.println("Cloned list: " + list1);
		
		System.out.println("Iterating in reverse order through for loop");
		for(int i=list1.size()-1; i>=0; i--) {
			System.out.print(list1.get(i)+" ");
		}
	}
}
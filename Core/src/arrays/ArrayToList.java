package arrays;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToList
{
	public static void main(String[] args)
	{
		String arr[]= {"naga","sridhar","madhu","purush"};
		ArrayList <String>list=new ArrayList<String>(Arrays.asList(arr));
		list.add("rajkumar");
		list.add("praveen");
		System.out.println(list);
		System.out.println("---------------");
		for(String s:list)
		{
			System.out.println(s);
		}
	}
}
package com.example.corejava.arrays;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToList
{
	public static void main(String[] args) {
		System.out.println("*** String Array ***");
		String arr[]= {"naga","sridhar","madhu","purushotham"};
		ArrayList <String>list=new ArrayList<String>(Arrays.asList(arr));
		list.add("rajkumar");
		list.add("praveen");
		System.out.println(list);
		System.out.println("*** List ***");
		for(String s:list) {
			System.out.println(s);
		}
	}
}
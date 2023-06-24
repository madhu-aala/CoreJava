package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Arr1
{
	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		int[][]arr1=new int[5][5];      //valid
		int[][] arr2=new int[5][5];     //valid
		//int arr3[][]=new int[][5];    //invalid
		int[][]arr4=new int[5][];       //valid

		int []arr5;
		arr5=new int[5];

		int []arr6=new int[5];

		int []arr7=new int[]{9,1,3,5,4,2,7,8,6,10};

		int []arr8={50,30,20,10,40};

		System.out.println(arr7.length-2);
		
		System.out.println(Arrays.equals(arr7, arr8)); //equals()

		Arrays.sort(arr7); //sort()
		for (int num : arr7)
		{
			System.out.print(num + " ");
		}
		String[] arr= {"java","python","c#"};
		ArrayList <String>list=new ArrayList<>(Arrays.asList(arr)); //asList()
		list.add("solidity");
		list.add("c++");
		System.out.println(list);
		for(String s:list)
		{
			System.out.println(s);
		}
	}
}
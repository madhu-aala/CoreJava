package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayOperations {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int[][] arr1 = new int[5][5]; // valid declaration
		int[][] arr2 = new int[5][5]; // valid declaration
		// int arr3[][]=new int[][5]; // invalid declaration (Doesn't specify the size of the first dimension.)
		int[][] arr4 = new int[5][]; // valid declaration

		int[] arr5;
		arr5 = new int[5];

		int[] arr6 = new int[5];

		int[] arr7 = new int[]{9, 1, 3, 5, 4, 2, 7, 8, 6, 10};

		int[] arr8 = {50, 30, 20, 10, 40};

		System.out.println("Length of arr7 minus 2: " + (arr7.length - 2));

		// Comparison of arr7 and arr8
		boolean isEqual = Arrays.equals(arr7, arr8);
		System.out.println("Are arr7 and arr8 equal? " + isEqual);

		// Sorting arr7
		Arrays.sort(arr7);
		System.out.print("Sorted arr7: ");
		for (int num : arr7) {
			System.out.print(num + " ");
		}
		System.out.println();

		// ArrayList operations
		String[] arr = {"java", "python", "c#"};
		ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
		list.add("solidity");
		list.add("c++");
		System.out.println("ArrayList after additions: " + list);
		System.out.println("Elements of ArrayList:");
		for (String s : list) {
			System.out.println(s);
		}
	}
}

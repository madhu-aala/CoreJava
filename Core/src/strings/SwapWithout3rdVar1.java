package strings;

import java.util.Scanner;

//Swapping strings without using 3rd Variable

public class SwapWithout3rdVar1
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String s1 = sc.nextLine();
		System.out.println("Enter another string:");
		String s2 = sc.nextLine();
		System.out.println("Before swapping s1= "+s1+", s2= "+s2);
		s1=s1+s2;
		s2=s1.substring(0,(s1.length()-s2.length()));
		s1=s1.substring(s2.length());
		System.out.println("After swapping s1= "+s1+", s2= "+s2);
		sc.close();

		/*
		s1=s1.replaceAll("ABC", "XYZ");
		s2=s2.replaceAll("XYZ", "ABC");
		 */
	}
}
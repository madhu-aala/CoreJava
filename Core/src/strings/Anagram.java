package strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String s1 = input.nextLine();

        System.out.println("Enter the second string:");
        String s2 = input.nextLine();

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        char c1[] = s1.toCharArray();
        char c2[] = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        if (Arrays.equals(c1, c2)) {
            System.out.println("The given strings are anagrams.");
        } else {
            System.out.println("The given strings are not anagrams.");
        }

        input.close();
    }
}

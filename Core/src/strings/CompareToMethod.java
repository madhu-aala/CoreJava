package strings;

public class CompareToMethod
/* ASCII Values of A-Z(65-90), a-z(97-122), 0-9(48-57)
 * compareTo()
 * if first word > second word, it returns positive number
 * if first word < second word, it returns negative number
 * if first word == second word, it returns 0 
 */
{
	public static void main(String[] args)
	{
		String s1="java"; String s2="java";
		System.out.println(s1.compareTo(s2)); // returns (0) because both are equal
		
		String s3="java"; String s4="JAVA";
		System.out.println(s3.compareTo(s4)); // returns (32) ASCII of j is 106 & J is 74 diff is 32
		
		String s5="java"; String s6="javaDeveloper";  
		System.out.println(s5.compareTo(s6)); //returns (-9) s5 < s6 by 9 letters
		System.out.println(s6.compareTo(s5)); //returns (9) s6 > s5 by 9 letters
		
		String s7="Developer"; String s8="developer";
		System.out.println(s7.compareTo(s8)); //returns (32) ASCII of D is 68 & d is 100 diff is 32
		
		String s9="java"; String s10=""; String s11="c++";  
		System.out.println(s9.compareTo(s10)); //returns (4) because s9 > s10 by 4 letters 
		System.out.println(s10.compareTo(s11)); //returns (-3) because s10 < s11 by 3 letters
		
		String s12="apple"; String s13="zebra";
		System.out.println(s12.compareTo(s13)); //returns (-25) ASCII of a is 97 & z is 122 diff is -25
	}
}
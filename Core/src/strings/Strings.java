package strings;

public class Strings
{
	public static void main(String args[]) {
		String str1 = new String ("Java");
		String str2 = new String ("JAVA");
		System.out.println(str1==str2); //checks address location
		System.out.println(str1.equals(str2)); //checks content

		String s1="JAVA";
		String s2="JAVA";
		System.out.println(s1==s2);
		System.out.println(s1.equals(str2));

		StringBuffer sb1 = new StringBuffer ("Java");
		StringBuffer sb2 = new StringBuffer ("Java");

		System.out.println(sb1==sb2); //checks address location
		System.out.println(sb1.equals(sb2)); //checks address location

		StringBuilder sb01 = new StringBuilder ("Java");
		StringBuilder sb02 = new StringBuilder ("Java");
		System.out.println(sb01==sb02); //checks address location
		System.out.println(sb01.equals(sb02)); //checks address location
	}
}


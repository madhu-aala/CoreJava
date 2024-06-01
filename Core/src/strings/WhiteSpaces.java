package strings;

//Program to remove white spaces

public class WhiteSpaces
{
	public static void main(String[] args) {
		String str = "J  A   V    A ";
		for(int i=0; i<str.length(); i++) {
			str=str.replaceAll(" ","");
		}
		System.out.println(str);
	}
}
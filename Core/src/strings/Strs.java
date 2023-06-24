package strings;

public class Strs
{
	public static void main(String[] args)
	{
		StringBuffer sb1 = new StringBuffer("abc");
		StringBuffer sb2 = sb1;
		sb1.append("d");
		System.out.println(sb1+" "+sb2+" "+(sb1==sb2));
		System.out.println(sb1.equals(sb2));
	}
}
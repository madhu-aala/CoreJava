package placement_prep;

public class SplitMethod
{
	public static void main(String[] args) 
	{ 
		String s1="java is awesome"; 
		String s2[]=s1.split(" "); 
		System.out.println("s2 length->:"+s2.length); 
		for(String a:s2) 
		{ 
			System.out.println(a); 
		} 
		String s3="object oriented programming language"; 
		String s4[]=s3.split(" ",2);
		System.out.println("s4 length->:"+s4.length); 
		for(String b:s4) 
		{ 
			System.out.println(b); 
		}
	} 
}
package placement_prep;

public class StringCompress
{
	void meth(String str) 
	{ 
		for(int i=0;i<str.length();i++) 
		{ 
			int count=1; 
			while (i< str.length()-1 && str.charAt(i)==str.charAt(i+1)) 
			{ 
				count++; 
				i++; 
			} 
			System.out.print(str.charAt(i)+""+count); 
		} 
	} 
	public static void main(String[] args)  
	{ 
		new StringCompress().meth("AAABBDMMMM"); 
	} 

}